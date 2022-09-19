/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.bean.VehicleCategoryBean;
import com.rushi.dao.CreateDriverDao;
import com.rushi.dao.VehicleCategoryDao;
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
@WebServlet("/CreateVehicleCategory")
public class CreateVehicleCategoryServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final long serialVersionUID = 1L;

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
        
        String name = request.getParameter("categoryName");

        VehicleCategoryBean vCategoryBean = new VehicleCategoryBean();
        vCategoryBean.setName(name);
        
        VehicleCategoryDao VCategory = new VehicleCategoryDao();

        RequestDispatcher dispatcher = null;

        try {
            String status = VCategory.createVehicleCategory(vCategoryBean);
            dispatcher = request.getRequestDispatcher("AddVehicleCategory.jsp");

            if (status.equals("success")) {
                request.setAttribute("status", "success");

            } else {
                request.setAttribute("status", "failed");
            }
            dispatcher.forward(request, response);

        } catch (Exception ex) {

        }
    }

}
