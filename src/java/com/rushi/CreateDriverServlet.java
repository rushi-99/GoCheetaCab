package com.rushi;

import com.rushi.bean.DriverBean;
import com.rushi.dao.CreateDriverDao;
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
@WebServlet("/CreateDriver")
public class CreateDriverServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = request.getParameter("address");
        String branch = request.getParameter("Branch");
        String name = request.getParameter("driverName");
        String vehicleNumber = request.getParameter("vehicleNumber");
        String contactNumber = request.getParameter("contact");
        String email = request.getParameter("email");

        DriverBean db = new DriverBean();
        db.setAddress(address);
        db.setBranch(branch);
        db.setContactNumber(contactNumber);
        db.setEmail(email);
        db.setFullName(name);
        db.setVehicleNumber(vehicleNumber);
        CreateDriverDao cd = new CreateDriverDao();

        RequestDispatcher dispatcher = null;

        try {
            String count = cd.createDriver(db);
            dispatcher = request.getRequestDispatcher("addDrivers.jsp");

            if (count.equals("success")) {
                request.setAttribute("status", "success");

            } else {
                request.setAttribute("status", "failed");
            }
            dispatcher.forward(request, response);

        } catch (Exception ex) {

        }
//
    }

}
