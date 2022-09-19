<%-- 
    Document   : SingleVehicleView
    Created on : Sep 15, 2022, 10:01:48 AM
    Author     : admin
--%>

<%@page import="com.rushi.bean.VehicleBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getAttribute("vehicleDetails") == null) {
        response.sendRedirect("GetVehicleList");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GoCheeta/Admin</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/owl-carousel/1.3.3/owl.carousel.css" rel="stylesheet"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/owl-carousel/1.3.3/owl.carousel.js"></script>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">

    </head>
    <body>
        <div class="container-xxl position-relative bg-white d-flex p-0">
            <!-- Content Start -->
            <div class="content">
                <!-- Navbar Start -->
                <nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">

                    <a href="GetVehicleList" class="sidebar-toggler flex-shrink-0">
                        <i class="fa fa-chevron-left"></i>
                    </a>
                    Back
                </nav>
                <!-- Navbar End -->

                <div class="container-fluid pt-4 px-4">
                    <div class="bg-light rounded h-100 p-4">
                        <h6 class="mb-4">Edit Driver Details</h6>
                        <form class="form" method="post" action="EditVehicleByID">
                            <%
                                VehicleBean res = (VehicleBean) request.getAttribute("vehicleDetails");
                                if (res.getCategory()== null) {
                                    res.setCategory("");
                                }
                                if (res.getOwnerContact()== null) {
                                    res.setOwnerContact("");
                                }

                                if (res.getOwnerName()== null) {
                                    res.setOwnerName("");
                                }

                                if (res.getVehicleNumber()== null) {
                                    res.setVehicleNumber("");
                                }

                                if (res.getVehicleName()== null) {
                                    res.setVehicleName("");
                                }

                            %>
                            <div class="">

                                <input type="hidden" id="id"  name="id" value="<%= res.getId()%>"/>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="VehicleName" name="VehicleName" 
                                       placeholder="vehicle Name" value="<%= res.getVehicleName()%>" required>
                                <label for="VehicleName">Vehicle Name</label>
                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="VehicleNumber" name="VehicleNumber"
                                       placeholder="vehicle Number" value="<%= res.getVehicleNumber()%>"required>
                                <label for="VehicleNumber">Vehicle Number</label>
                            </div>
                   
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="OwnerContact" name="OwnerContact" value="<%= res.getOwnerContact()%>"
                                       placeholder="Owner Contact" required>
                                <label for="OwnerContact">Owner Contact</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="" name="" value="<%= res.getCategory()%>"
                                       placeholder="Category" disabled>
                                <label for="Category">Category</label>
                                <input type="hidden" id="Category"  name="Category" value="<%= res.getCategory()%>"/>

                            </div>
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control"placeholder="Owner Name" name="OwnerName" value="<%= res.getOwnerName()%>" 
                                          id="OwnerName" required>
                                <label for="OwnerName">Owner Name</label>
                            </div>
                            <br>
                            <button class="btn btn-primary w-100 m-2" type="submit">Submit</button>

                        </form>
                    </div>
                </div>

                <!-- Footer Start -->
                <div class="container-fluid pt-4 px-4">
                    <div class="bg-light rounded-top p-4">
                        <div class="row">
                            <div class="col-12 col-sm-6 text-center text-sm-start">
                                GoCheeta &copy; 2022
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Footer End -->

            </div>
            <!-- Content End -->


            <!-- Back to Top -->
            <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="lib/chart/chart.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>