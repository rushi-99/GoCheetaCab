/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.dao;

import com.rushi.bean.DriverBean;
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
public class DriverDao {

    public static List<DriverBean> getDriverDetails() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<DriverBean> list = new ArrayList<>();

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("select * from driver");
            System.out.println(pst);
            rs = pst.executeQuery();

            while (rs.next()) {
                DriverBean driver = new DriverBean();
                driver.setFullName(rs.getString("driverName"));
                driver.setVehicleNumber(rs.getString("vehicleNumber"));
                driver.setBranch(rs.getString("Branch"));
                driver.setContactNumber(rs.getString("contact"));
                driver.setId(rs.getInt("ID"));

                list.add(driver);
            }
            return list;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        return "something went wrong";
        return list;
    }

    public boolean deleteDriverbyID(int id) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("delete from driver where ID = ?");
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

    public boolean editDriverbyID(DriverBean driverB) throws SQLException {

        String address = driverB.getAddress();
        String branch = driverB.getBranch();
        String name = driverB.getFullName();
        String vehicleNumber = driverB.getVehicleNumber();
        String contactNumber = driverB.getContactNumber();
        String email = driverB.getEmail();
        int id = driverB.getId();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("UPDATE driver SET address = ?, Branch = ?, driverName = ?,vehicleNumber = ?,contact =?, email= ? WHERE ID = ?");
            pst.setString(1, address);
            pst.setString(2, branch);
            pst.setString(3, name);
            pst.setString(4, vehicleNumber);
            pst.setString(5, contactNumber);
            pst.setString(6, email);
            pst.setInt(7, id);

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

    public static DriverBean getSingleDriverDetailsbyId(int id) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        DriverBean driver = new DriverBean();

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("SELECT * FROM driver WHERE ID = ?");
            pst.setInt(1, id);
            System.out.println(pst);

            rs = pst.executeQuery();

            if (rs.next()) {
                driver.setFullName(rs.getString("driverName"));
                driver.setVehicleNumber(rs.getString("vehicleNumber"));
                driver.setBranch(rs.getString("Branch"));
                driver.setContactNumber(rs.getString("contact"));
                driver.setId(rs.getInt("ID"));

                return driver;
            } else {
                return driver;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return driver;
    }
}
