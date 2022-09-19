/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.dao.DriverDao;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet("/getSingleDriverDetails")
public class getSingleDriverDetails extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = parseInt(request.getParameter("id"));
        
        DriverBean driver = new DriverBean();
        driver.setId(id);

        DriverDao driverdao = new DriverDao();
        RequestDispatcher dispatcher = null;
        
        try {
            
            driver = driverdao.getSingleDriverDetailsbyId(id);
            request.setAttribute("driverDetails", driver);
            dispatcher = request.getRequestDispatcher("SingleDriverView.jsp");

            dispatcher.forward(request, response);

        } catch (Exception ex) {

        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

   

}
