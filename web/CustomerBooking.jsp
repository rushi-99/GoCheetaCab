<%-- 
    Document   : CustomerBooking
    Created on : Sep 5, 2022, 2:35:08 PM
    Author     : admin
--%>
<%
    if (session.getAttribute("name") == null) {
        response.sendRedirect("index.html");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>GoCheeta</title>
        <meta name="viewport" content="width=device-width height=device-height initial-scale=1.0">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="icon" href="images/favicon.ico" type="image/x-icon">

        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Work+Sans:300,400,500,700%7CZilla+Slab:300,400,500,700,700i%7CGloria+Hallelujah">
        <script src="https://owlcarousel2.github.io/OwlCarousel2/assets/owlcarousel/owl.carousel.js"></script>

        <link rel="stylesheet" href="css/customerCustom.css">
        <link rel="stylesheet" href="css/customerFont.css">
        <link rel="stylesheet" href="css/customerStyle.css">
        <style>.ie-panel{
                display: none;
                background: #212121;
                padding: 10px 0;
                box-shadow: 3px 3px 5px 0 rgba(0,0,0,.3);
                clear: both;
                text-align:center;
                position: relative;
                z-index: 1;
            }
            html.ie-10 .ie-panel, html.lt-ie-10 .ie-panel {
                display: block;
            }</style>
    </head>
    <body>
        <div class="ie-panel"><a href="http://windows.microsoft.com/en-US/internet-explorer/"><img src="images/ie8-panel/warning_bar_0000_us.jpg" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."></a></div>
        <div class="preloader">
            <div class="preloader-logo"><a class="brand" href="index.html"><img class="brand-logo-dark" src="images/logo.jpeg" alt="" width="177" height="59"/></a>
            </div>
            <div class="preloader-body">
                <div class="cssload-container">
                    <div class="cssload-speeding-wheel"></div>
                </div>
            </div>
        </div>
        <div class="page">
            <!-- Page Header--><a class="banner banner-top" href="https://www.templatemonster.com/website-templates/monstroid2.html" target="_blank"><img src="images/monstroid_02.jpg" alt="" height="0"/></a>
            <!-- Page Header-->
            <header class="page-header">
                <div class="rd-navbar-wrap">
                    <nav class="rd-navbar rd-navbar-modern" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-fixed" data-xl-layout="rd-navbar-static" data-xl-device-layout="rd-navbar-static" data-body-class="rd-navbar-modern-linked" data-lg-stick-up-offset="46px" data-xl-stick-up-offset="46px" data-xxl-stick-up-offset="46px" data-lg-stick-up="true" data-xl-stick-up="true" data-xxl-stick-up="true">
                        <div class="rd-navbar-main-outer">
                            <div class="rd-navbar-main">
                                <div class="rd-navbar-nav-wrap">
                                    <ul class="rd-navbar-nav">
                                        <li class="rd-nav-item active"><a class="rd-nav-link" href="CustomerBooking.jsp">Home</a>
                                        </li>
                                        <li class="rd-nav-item"><a class="rd-nav-link" href="">Services</a>
                                        </li>
                                        <li class="rd-nav-item"><a class="rd-nav-link" href="contact.jsp">Contacts</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <div class="rd-navbar-aside-outer">
                            <div class="rd-navbar-aside">
                                <!-- RD Navbar Panel-->
                                <div class="rd-navbar-panel">
                                    <!-- RD Navbar Toggle-->
                                    <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                                    <!-- RD Navbar Brand-->
                                    <div class="rd-navbar-brand"><a class="brand" href="index.html"><img class="brand-logo-dark" src="images/logo.jpeg" alt="" width="177" height="59"/></a>
                                    </div>
                                </div>
                                <div class="rd-navbar-collapse">
                                    <button class="rd-navbar-collapse-toggle" data-rd-navbar-toggle=".rd-navbar-collapse-content"><span></span></button>
                                    <div class="rd-navbar-collapse-content">
                                        <div class="link-icon-title"><a class="link-icon-1" href="tel:#"><span class="icon mdi mdi-phone"></span><span>070 123 4568</span></a></div>
                                        <div><a class="link-icon-1" href="mailto:#"><span class="icon mdi mdi-email-outline"></span><span>info@GoCheeta.com</span></a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
            </header>
            <!-- FScreen-->
            <section class="section parallax-container section-xl bg-gray-900" data-parallax-img="images/bg-image-1.jpg">
                <div class="parallax-content">
                    <div class="container">
                        <div class="product-creative-main text-center">
                            <p class="heading-1 product-creative-title"><a href="#">Reliable and Secure Way to Reach Any Point of the City</a></p>
                            <div class="product-creative-text">
                                <p class="heading-5 text-white"> Fast, Safe, On time and affordable 24 hrs × 7 days</p>
                            </div>
                            <p class="heading-2 product-creative-price text-primary"><a href="tel:#">070 1234568</a></p><a class="button button-lg button-primary button-raven" href="#">Need a Ride?</a>
                        </div>
                    </div>
                </div>
            </section>

            <!-- Testimonials-->
            <section class="section section-lg bg-default text-center">
                <div class="container">
                    <h2 class="wow fadeIn">Testimonials</h2>
                    <!-- Owl Carousel-->
                    <!--                    <div class="owl-carousel owl-style-1 wow fadeIn" data-wow-delay=".2s" data-items="1" data-dots="false" data-nav="true" data-stage-padding="0" data-loop="true" data-margin="30" data-animation-in="fadeIn" data-animation-out="fadeOut" data-autoplay="true" data-mouse-drag="false">
                                            <blockquote class="quote-light"><img class="quote-light-avatar" src="images/testimonials-4-68x68.jpg" alt="" width="68" height="68"/>
                                                <p class="heading-5 quote-light-cite">Brittany Grant</p>
                                                <p class="quote-light-position">Regular Client</p>
                                                <div class="quote-light-text">
                                                    <p class="font-weight-regular heading-5">I found your service to be a 5-star experience. Our flight was delayed by two hours, so we arrived at the airport at 2am. However, the driver was waiting at the arrivals hall for us, when we finally got there. All the people we communicated with were pleasant and cheerful.</p>
                                                </div>
                                            </blockquote>
                                            <blockquote class="quote-light"><img class="quote-light-avatar" src="images/testimonials-1-68x68.jpg" alt="" width="68" height="68"/>
                                                <p class="heading-5 quote-light-cite">Patrick Mills</p>
                                                <p class="quote-light-position">Regular Client</p>
                                                <div class="quote-light-text">
                                                    <p class="font-weight-regular heading-5">Everything went perfectly! Incredibly punctual, friendly drivers, and a very fast customer service that answered my questions within minutes the night before my return trip. I highly recommend booking here, and will definitely do so again in the future.</p>
                                                </div>
                                            </blockquote>
                                            <blockquote class="quote-light"><img class="quote-light-avatar" src="images/testimonials-2-68x68.jpg" alt="" width="68" height="68"/>
                                                <p class="heading-5 quote-light-cite">Paul Johnston</p>
                                                <p class="quote-light-position">Regular Client</p>
                                                <div class="quote-light-text">
                                                    <p class="font-weight-regular heading-5">The service was excellent, thank you. My driver was waiting at Arrivals for me with a clear sign. He introduced himself, was very polite and friendly and drove me to my hotel with no delay. I will be pleased to recommend this service to my family and friends.</p>
                                                </div>
                                            </blockquote>
                                        </div>-->
                </div>
            </section>

            <!-- Page Footer--><a class="banner" href="https://www.templatemonster.com/website-templates/monstroid2.html" target="_blank"><img src="images/monstroid_big_02.jpg" alt="" height="0"/></a>
            <footer class="section footer-modern bg-gray-950">
                <div class="footer-modern-main">
                    <div class="container">
                        <div class="row row-50 justify-content-center justify-content-lg-between">
                            <!--        
                                                        
                                                        
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="footer-modern-aside">
                                                <div class="container">
                                                    <div class="layout-2">
                            <!-- Rights-->
                            <p class="rights"><span>&copy;&nbsp; GoCheeta</span><span class="copyright-year"></span></p>

                        </div>
                    </div>
                </div>
            </footer>
        </div>
        <div class="snackbars" id="form-output-global"></div>
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>