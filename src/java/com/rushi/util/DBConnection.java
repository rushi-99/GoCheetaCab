/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBConnection {
    public static Connection createConnection()
    {
    Connection con = null;
 
    try
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GoCheeta?useSSL=false", "root", "");
    }
    catch (SQLException e)
        {
           System.out.println("plese try again!!");
         e.printStackTrace();
       }
    return con;
    }
}
