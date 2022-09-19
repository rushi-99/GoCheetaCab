<%-- 
    Document   : register
    Created on : Sep 4, 2022, 7:51:39 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Go Cheeta</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            body {
                background-size: cover;
                font-family: sans-serif;
                background-color: silver;
            }
            .register-wrapper {
                height: 100vh;
                width: 100vw;
                display: flex;
                justify-content: center;
                align-items: center;
            }
            .form {
                position: relative;
                width: 100%;
                max-width: 380px;
                padding: 80px 40px 40px;
                background: rgba(0, 0, 0, 0.7);
                border-radius: 10px;
                color: #fff;
                box-shadow: 0 15px 25px rgba(0, 0, 0, 0.5);
            }
            .form::before {
                content: "";
                position: absolute;
                top: 0;
                left: 0;
                width: 50%;
                height: 100%;
                background: rgba(255, 255, 255, 0.08);
                transform: skewX(-26deg);
                transform-origin: bottom left;
                border-radius: 10px;
                pointer-events: none;
            }
            .form img {
                position: absolute;
                top: -50px;
                left: calc(50% - 50px);
                width: 100px;
                background: rgba(255, 255, 255, 0.8);
                border-radius: 50%;
            }
            .form h2 {
                text-align: center;
                letter-spacing: 1px;
                margin-bottom: 2rem;
                color: white;
            }
            .form .input-group {
                position: relative;
            }
            .form .input-group input {
                width: 100%;
                padding: 10px 0;
                font-size: 1rem;
                letter-spacing: 1px;
                margin-bottom: 30px;
                border: none;
                border-bottom: 1px solid #fff;
                outline: none;
                background-color: transparent;
                color: inherit;
            }
            .form .input-group label {
                position: absolute;
                top: 0;
                left: 0;
                padding: 10px 0;
                font-size: 1rem;
                pointer-events: none;
                transition: 0.3s ease-out;
            }
            .form .input-group input:focus + label,
            .form .input-group input:valid + label {
                transform: translateY(-18px);
                color: white;
                font-size: 0.8rem;
            }
            .submit-btn {
                display: block;
                margin-left: auto;
                border: none;
                outline: none;
                background: #ff652f;
                font-size: 1rem;
                text-transform: uppercase;
                letter-spacing: 1px;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
                width: 100%;
            }
            .forgot-pw {
                color: inherit;
            }

            #forgot-pw {
                position: absolute;
                display: flex;
                justify-content: center;
                align-items: center;
                top: 0;
                left: 0;
                right: 0;
                height: 0;
                z-index: 1;
                background: #fff;
                opacity: 0;
                transition: 0.6s;
            }
            #forgot-pw:target {
                height: 100%;
                opacity: 1;
            }
            .close {
                position: absolute;
                right: 1.5rem;
                top: 0.5rem;
                font-size: 2rem;
                font-weight: 900;
                text-decoration: none;
                color: inherit;
            }

            .login{
                color: whitesmoke;
            }

            div a {
                text-decoration: none;
                color: white;
                font-size: 20px;
                padding: 15px;
                display:inline-block;
            }
        </style>
    </head>
    <body>
        <input type="hidden" id="status" value="<%= request.getAttribute("status")%>">
        <div class="register-wrapper">
            <form action="registration" method="post" class="form">
                <h2>Registration</h2>
                <div class="input-group">
                    <input type="text" name="firstName" id="firstName" required />
                    <label for="firstName">First Name</label>
                </div>
                <div class="input-group">
                    <input type="text" name="lastName" id="lastName" required />
                    <label for="lastName">Last Name</label>
                </div>
                <div class="input-group">
                    <input type="text" name="mobileNumber" id="mobileNumber" required />
                    <label for="mobileNumber">Mobile Number</label>
                </div>
                <div class="input-group">
                    <input type="text" name="registerUser" id="registerUser" required />
                    <label for="registerUser">User Name</label>
                </div>
                <div class="input-group">
                    <input
                        type="password"
                        name="registerPassword"
                        id="registerPassword"
                        required
                        />
                    <label for="loginPassword">Password</label>
                </div>
                <input type="submit" value="Register" class="submit-btn" />
                <br>
                <div class="login">

                    Have an account? <a href ='index.html' >login here</a>

                </div>
            </form>

        </div> 

        <script src="vender/jquery/jquery.min.js"></script>
        <script src="js.main.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>        
        <link rel="stylesheet" href="alert/dist/sweetalert.css">

        <script type="text/javascript">
            var status = document.getElementById("status").value;
            if (status == "success") {
                swal("congrats", "successfully registerd..", "success");
            }
        </script>
    </body>
</html>