/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.dao;

import com.rushi.bean.LoginBean;
import com.rushi.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class LoginDao {

    public String authernticatedUser(LoginBean loginBean) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        Connection con = null;
        PreparedStatement pst = null;

        ResultSet rs = null;

        String roleDB = "";
        String fullName = "";
        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("select * from customer where username = ? and password =? ");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            while (rs.next()) {
                roleDB = rs.getString("role");
                fullName = rs.getString("firstName");
                loginBean.setFullName(fullName);

                if (roleDB.equals("A")) {
                    return ("Admin_Role");
                } else if (roleDB.equals("C")) {
                    return "User_Role";

                }
            }
        } catch (SQLException e) {
        }
        return "Invalid user credentials";
    }
}
