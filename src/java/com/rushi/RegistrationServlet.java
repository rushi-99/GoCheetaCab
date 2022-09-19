/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author admin
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
//        out.print("working");

        String fName = request.getParameter("firstName");
        String lName = request.getParameter("lastName");
        String mNumber = request.getParameter("mobileNumber");
        String uName = request.getParameter("registerUser");
        String pass = request.getParameter("registerPassword");

        RequestDispatcher dispatcher = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GoCheeta?useSSL=false", "root", "");
            PreparedStatement pst = con.prepareStatement("insert into customer(firstName, lastName, mobileNumber, username,password,role) values(?,?,?,?,?,?) ");
            pst.setString(1, fName);
            pst.setString(2, lName);
            pst.setString(3, mNumber);
            pst.setString(4, uName);
            pst.setString(5, pass);
            pst.setString(6, "C");

            int count = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("register.jsp");

            if (count > 0) {
                request.setAttribute("status", "success");
            } else {
                request.setAttribute("status", "failed");
            }

            dispatcher.forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();}
//        } finally {
//
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }

    }
}
