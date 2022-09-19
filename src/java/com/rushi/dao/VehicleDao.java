/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.dao;

import com.rushi.bean.VehicleBean;
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
public class VehicleDao {

    public String createVehicle(VehicleBean VehicleB) {
        String category = VehicleB.getCategory();
        String contact = VehicleB.getOwnerContact();
        String name = VehicleB.getOwnerName();
        String vehicleName = VehicleB.getVehicleName();
        String vehicleNumber = VehicleB.getVehicleNumber();
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("insert into vehicle(OwnerName, OwnerContact, VehicleNumber, VehicleName,Category) values(?,?,?,?,?) ");
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, vehicleNumber);
            pst.setString(4, vehicleName);
            pst.setString(5, category);

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

    public static List<VehicleBean> getVehicleDetails() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<VehicleBean> list = new ArrayList<>();

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("select * from vehicle");
            System.out.println(pst);
            rs = pst.executeQuery();
            
            

            while (rs.next()) {
                VehicleBean vehicle = new VehicleBean();
                vehicle.setOwnerName(rs.getString("OwnerName"));
                vehicle.setVehicleName(rs.getString("VehicleName"));
                vehicle.setCategory(rs.getString("Category"));
                vehicle.setOwnerContact(rs.getString("OwnerContact"));
                vehicle.setVehicleNumber(rs.getString("VehicleNumber"));
                vehicle.setId(rs.getInt("Id"));

                list.add(vehicle);
            }
            return list;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        return "something went wrong";
        return list;
    }

    public boolean deleteVehiclebyID(int id) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("delete from vehicle where Id = ?");
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

    public boolean editVehiclebyID(VehicleBean VehicleB) throws SQLException {

        String category = VehicleB.getCategory();
        String contact = VehicleB.getOwnerContact();
        String name = VehicleB.getOwnerName();
        String vehicleName = VehicleB.getVehicleName();
        String vehicleNumber = VehicleB.getVehicleNumber();
        int id = VehicleB.getId();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("UPDATE vehicle SET OwnerName = ?, OwnerContact = ?, VehicleNumber = ?,VehicleName = ?,Category =? WHERE Id = ?");
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, vehicleNumber);
            pst.setString(4, vehicleName);
            pst.setString(5, category);
            pst.setInt(6, id);

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

    public static VehicleBean getSingleVehicleDetailsbyId(int id) throws SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        VehicleBean vehicle = new VehicleBean();

        try {
            con = DBConnection.createConnection();
            pst = con.prepareStatement("SELECT * FROM vehicle WHERE Id = ?");
            pst.setInt(1, id);
            System.out.println(pst);

            rs = pst.executeQuery();

            if (rs.next()) {
                vehicle.setOwnerName(rs.getString("OwnerName"));
                vehicle.setOwnerContact(rs.getString("OwnerContact"));
                vehicle.setVehicleNumber(rs.getString("VehicleNumber"));
                vehicle.setVehicleName(rs.getString("VehicleName"));
                vehicle.setCategory(rs.getString("Category"));
                vehicle.setId(rs.getInt("Id"));

                return vehicle;
            } else {
                return vehicle;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vehicle;
    }
}
