/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.dao;

import com.rushi.bean.VehicleCategoryBean;
import com.rushi.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class VehicleCategoryDao {

    public String createVehicleCategory(VehicleCategoryBean VCategory) {
        String name = VCategory.getName();

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("insert into vehicleCategory(Name) values(?) ");
            pst.setString(1, name);
            System.out.println(pst);

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
    
     public static List<VehicleCategoryBean> getVehicleCategoryDetails() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<VehicleCategoryBean> list = new ArrayList<>();

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("select * from vehicleCategory");
            System.out.println(pst);
            rs = pst.executeQuery();

            while (rs.next()) {
                VehicleCategoryBean category = new VehicleCategoryBean();
                category.setName(rs.getString("Name"));
                category.setId(rs.getInt("Id"));

                list.add(category);
            }
            return list;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        return "something went wrong";
        return list;
    }

    public boolean deleteCategorybyID(int id) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("delete from vehicleCategory where Id = ?");
            pst.setInt(1, id);
            System.out.println(pst);

            int res = pst.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
