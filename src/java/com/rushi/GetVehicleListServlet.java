/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.VehicleBean;
import com.rushi.bean.VehicleCategoryBean;
import com.rushi.dao.VehicleCategoryDao;
import com.rushi.dao.VehicleDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet("/GetVehicleList")
public class GetVehicleListServlet extends HttpServlet {

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
        RequestDispatcher dispatcher = null;
        List<VehicleBean> vehicleDetails = VehicleDao.getVehicleDetails();

        try {

            if (vehicleDetails.size() > 0) {
//                msg = driverList.size() + (driverList.size() > 1 ? "rexords" : " record");

//                request.setAttribute("msg", msg);
                request.setAttribute("ListOfVehicle", vehicleDetails);
                dispatcher = request.getRequestDispatcher("VehicleList.jsp");

            }

            dispatcher.forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("error", "something went wrong!!");

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
