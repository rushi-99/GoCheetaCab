/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.dao.DriverDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet("/getDriverDetailsList")
public class ViewDriverServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String msg = "no data";
        RequestDispatcher dispatcher = null;
        List<DriverBean> driverList = DriverDao.getDriverDetails();

        try {

            if (driverList.size() > 0) {
//                msg = driverList.size() + (driverList.size() > 1 ? "rexords" : " record");

//                request.setAttribute("msg", msg);
                request.setAttribute("driverList", driverList);
                dispatcher = request.getRequestDispatcher("ViewDrivers.jsp");

            }

            dispatcher.forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("error", "something went wrong!!");

        }

    }

}
