/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.VehicleCategoryBean;
import com.rushi.dao.VehicleCategoryDao;
import java.io.IOException;
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
@WebServlet("/categoryListDropDown")
public class categoryListServlet extends HttpServlet {

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
        String action = request.getParameter("action");
        String msg = "no data";
        RequestDispatcher dispatcher = null;
        List<VehicleCategoryBean> category = VehicleCategoryDao.getVehicleCategoryDetails();

        try {

            if (category.size() > 0) {
//                msg = driverList.size() + (driverList.size() > 1 ? "rexords" : " record");

//                request.setAttribute("msg", msg);
                request.setAttribute("categoryList", category);
                dispatcher = request.getRequestDispatcher("AddVehicle.jsp");

            }

            dispatcher.forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("error", "something went wrong!!");

        }
    }

}
