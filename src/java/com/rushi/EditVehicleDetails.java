/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.bean.VehicleBean;
import com.rushi.dao.DriverDao;
import com.rushi.dao.VehicleDao;
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
@WebServlet("/EditVehicleByID")
public class EditVehicleDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id =  parseInt(request.getParameter("id"));
        
        String ownerContact = request.getParameter("OwnerContact");
        String category = request.getParameter("Category");
        String ownerName = request.getParameter("OwnerName");
        String vehicleName = request.getParameter("VehicleName");
        String vehicleNubmer = request.getParameter("VehicleNumber");

        VehicleBean db = new VehicleBean();
        db.setId(id);
        db.setOwnerContact(ownerContact);
        db.setCategory(category);
        db.setOwnerName(ownerName);
        db.setVehicleName(vehicleName);
        db.setVehicleNumber(vehicleNubmer);
                

        VehicleDao vehicleD = new VehicleDao();

        RequestDispatcher dispatcher = null;
         try {
            Boolean count = vehicleD.editVehiclebyID(db);
            dispatcher = request.getRequestDispatcher("SingleVehicleView.jsp");

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
