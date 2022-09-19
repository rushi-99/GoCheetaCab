/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.dao.CreateDriverDao;
import com.rushi.dao.DriverDao;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
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
@WebServlet("/EditDriverByID")
public class EditDriverServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        int id = parseInt(request.getParameter("drivers"));
//        DriverBean driver = new DriverBean();
//        driver.setId(id);
//
////        DriverDao driverdao = request.getParameterValues;
//        RequestDispatcher dispatcher = null;
    }

//    try {
//            boolean res = driverdao.Edit(id);
//            dispatcher = request.getRequestDispatcher("getDriverDetailsList");
//
//            if (res == true) {
//                request.setAttribute("status", "success");
//            } else {
//                request.setAttribute("status", "failed");
//            }
//            dispatcher.forward(request, response);
//
//        } catch (Exception ex) {
//
//        }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id =  parseInt(request.getParameter("id"));
        
        String address = request.getParameter("address");
        String branch = request.getParameter("Branch");
        String name = request.getParameter("driverName");
        String vehicleNumber = request.getParameter("vehicleNumber");
        String contactNumber = request.getParameter("contact");
        String email = request.getParameter("email");

        DriverBean db = new DriverBean();
        db.setId(id);
        db.setAddress(address);
        db.setBranch(branch);
        db.setContactNumber(contactNumber);
        db.setEmail(email);
        db.setFullName(name);
        db.setVehicleNumber(vehicleNumber);
                

        DriverDao driverD = new DriverDao();

        RequestDispatcher dispatcher = null;
         try {
            Boolean count = driverD.editDriverbyID(db);
            dispatcher = request.getRequestDispatcher("SingleDriverView.jsp");

//            List<DriverBean> list = 
//            if (count.equals(true)) {
//                request.setAttribute("driverDetails", null);
//
//            } else {
//                request.setAttribute("driverList", "");
//            }
            dispatcher.forward(request, response);

        } catch (Exception ex) {

        }
//
    }

}
