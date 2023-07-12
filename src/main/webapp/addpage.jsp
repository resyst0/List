<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 10.07.2023
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<html lang="tr">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>LİST-Duyuru Ekleme Formu</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon">
    <link href="assets/img/list-task.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">

    <!-- =======================================================
    * Template Name: Gp
    * Updated: May 30 2023 with Bootstrap v5.3.0
    * Template URL: https://bootstrapmade.com/gp-free-multipurpose-html-bootstrap-template/
    * Author: BootstrapMade.com
    * License: https://bootstrapmade.com/license/
    ======================================================== -->
</head>

<body>

<!-- ======= Header ======= -->
<header id="header" class="fixed-top header-inner-pages">
    <div class="container d-flex align-items-center justify-content-lg-between">

        <h1 class="logo me-auto me-lg-0"><a href="index.html">LİST<span>.</span></a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html" class="logo me-auto me-lg-0"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
        <nav id="list-navbar" class="navbar order-last order-lg-0">
            <ul>
                <li><a class="nav-link scrollto " href="index.jsp">Anasayfa</a></li>
                <li><a class="nav-link scrollto  " href="listpage.jsp">Duyurular</a></li>
                <li><a class="nav-link scrollto active" href="addpage.jsp">Ekleyin</a></li>
            </ul>
            <i class="bi bi-list mobile-nav-toggle"></i>
        </nav><!-- .navbar -->

    </div>
</header><!-- End Header -->

<main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section id="breadcrumbs" class="breadcrumbs">
        <div class="container">

            <div class="d-flex justify-content-between align-items-center">
                <h2>Duyuru Ekleme Formu</h2>
            </div>

        </div>
    </section><!-- End Breadcrumbs -->


    <section id="list-section" class="portfolio-details">
        <div class="container">
            <form action="addServlet" method="post" >
                <div class="form-group">
                    <label style="font-size: larger;font-weight: bold;" for="title">Başlık</label>
                    <input name="title"  type="text" class="form-control" id="title" style="font-style: italic;" placeholder ="Duyuru başlığı giriniz." >
                </div>
                <br>
                <div class="form-group">
                    <label style="font-size: larger;font-weight: bold;" for="description">Açıklama</label>
                    <input name="description" type="text" class="form-control" id="description" style="font-style: italic;" placeholder="Duyuru açıklaması giriniz.">
                </div>
                <br>
                <div class="form-group">
                    <label style="font-size: larger;font-weight: bold;" for="FirstDate">Duyuru Gösterim Tarihi</label>
                    <input name="firstdate" type="text" class="form-control" id="firstdate" style="font-style: italic;" placeholder="yyyy-aa-gg">
                </div>
                <br>
                <div class="form-group">
                    <label style="font-size: larger;font-weight: bold;" for="SecondDate">Duyuru Bitiş Tarihi</label>
                    <input name="seconddate" type="text"  class="form-control" id="seconddate" style="font-style: italic;"   placeholder="yyyy-aa-gg">
                </div>
                <br>
                <button type="submit" id="savebutton" class="btn btn-dark" value="1" >Kaydet</button>

        </form>
        </div>
    </section>
</main><!-- End #main -->



<div id="preloader"></div>
<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
<script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
<script src="assets/vendor/aos/aos.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>

</body>

</html>
