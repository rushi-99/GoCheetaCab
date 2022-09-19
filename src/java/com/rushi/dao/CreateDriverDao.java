/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.dao;

import com.rushi.bean.DriverBean;
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
public class CreateDriverDao {

    public String createDriver(DriverBean driverBean) {
        String address = driverBean.getAddress();
        String branch = driverBean.getBranch();
        String name = driverBean.getFullName();
        String vehicleNumber = driverBean.getVehicleNumber();
        String contactNumber = driverBean.getContactNumber();
        String email = driverBean.getEmail();

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("insert into driver(address, Branch, driverName, vehicleNumber,contact,email) values(?,?,?,?,?,?) ");
            pst.setString(1, address);
            pst.setString(2, branch);
            pst.setString(3, name);
            pst.setString(4, vehicleNumber);
            pst.setString(5, contactNumber);
            pst.setString(6, email);

            int res = pst.executeUpdate();

           if (res > 0) {
                return "success";
            } else {
                return "failed";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "something went wrong";
    }
}
