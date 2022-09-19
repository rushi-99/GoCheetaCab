/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.bean.VehicleBean;
import com.rushi.dao.CreateDriverDao;
import com.rushi.dao.VehicleDao;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/CreateVehicle")
public class CreateVehicleServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        String ownerName = request.getParameter("ownerName");
        String contact = request.getParameter("contact");
        String vehicleNumber = request.getParameter("vehicleNumber");
        String vehicleName = request.getParameter("vehicleName");
        String category = request.getParameter("VehicleCategory");

        VehicleBean vb = new VehicleBean();
        vb.setCategory(category);
        vb.setOwnerContact(contact);
        vb.setVehicleName(vehicleName);
        vb.setVehicleNumber(vehicleNumber);
        vb.setOwnerName(ownerName);
        VehicleDao vd = new VehicleDao();

        RequestDispatcher dispatcher = null;

        try {
            String count = vd.createVehicle(vb);
            dispatcher = request.getRequestDispatcher("AddVehicle.jsp");

            if (count.equals("success")) {
                request.setAttribute("categoryList", "success");

            } else {
                request.setAttribute("categoryList", "failed");
            }
            dispatcher.forward(request, response);

        } catch (Exception ex) {

        }
    }
}
