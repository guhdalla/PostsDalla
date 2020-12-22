<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Home - Brand</title>
    <link rel="icon" type="image/png" sizes="512x512" href="assets/img/carro-voador.png">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cabin:700">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.2.0/aos.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">
    <link rel="stylesheet" href="assets/css/Lightbox-Gallery.css">
    <link rel="stylesheet" href="assets/css/Off-Canvas-Sidebar-Drawer-Navbar.css">
</head>

<body id="page-top">
    
    <%@ include file="nav.jsp"%>
    
    <section data-bs-parallax-bg="true" id="timeline" class="content-section text-center" style="margin-top: 0px;padding-top: 50px;padding-bottom: 50px;">
        <div class="container">
            <div class="row" style="margin-top: 0px;">
                <div class="col-xl-4 offset-xl-4" data-aos="slide-down" data-aos-duration="1000" data-aos-delay="300" data-aos-once="true">
                    <hr style="background: #ffffff;border-width: 3px;height: 48px;width: 3px;"><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" class="bi bi-plus-circle-fill" style="width: 25px;height: 25px;margin-top: -34px;">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3v-3z"></path>
</svg></div>
                <div class="col-lg-8 col-xl-10 mx-auto">
                    <h2 data-aos="zoom-out" data-aos-duration="1500" data-aos-delay="150" data-aos-once="true">Machine learning</h2>
                    <div style="margin-bottom: 60px;">
                        <p class="text-left">O grupo NewGen desenvolveu uma proposta para o aprendizado de máquina do filme Back To The Future. A solução se baseia em regressão, onde temos os dados de todos os anos que ocorreram no filme e os anos que houveram viagens no
                            tempo, com essas informações, podemos criar um algoritmo com gráficos para prever quando serão as próximas viagens no tempo.<br></p>
                    </div>
                    <div style="margin-bottom: 60px;">
                        <h1 style="font-size: 28px;text-align: left;">Algoritmo</h1><code class="d-xl-flex align-items-xl-center" style="text-align: left;color: #06ebc4;">import os<br>import pandas as pd<br>import numpy as np<br>import matplotlib.pyplot as plt<br>%matplotlib inline<br>df = pd.read_csv('abc.csv')<br>df.head()<br><br>plt.scatter(df.Anos, df.Diferenca)<br>plt.xlabel("DiferenÃ§a de anos")<br>plt.ylabel("Anos")<br>plt.show()<br><br>f,ax = plt.subplots(figsize=(20, 10))<br>sns.heatmap(df, annot=True, linewidths=0.9,linecolor="orange", fmt= '.0f',ax=ax)<br>plt.show()</code>
                        <p
                            class="text-left" style="margin-top: 19px;">Arquivo com os dados para&nbsp;<a href="https://fiapcom-my.sharepoint.com/:x:/g/personal/rm85743_fiap_com_br/EWkLuSXAIiNBuiKrGKiPUE4BH-ayCAKHRzf6K2VHoCiEbQ?e=ctwkUQ">DOWNLOAD</a>&nbsp;ou&nbsp;<a href="/BackToTheFuture/dados">LINK</a></p>
                            <p
                                class="text-left">Com este algoritmo podemos visualizar os seguintes gráficos:</p>
                    </div>
                    <div class="row photos">
                        <div class="col-sm-6 col-md-4 col-lg-3 col-xl-6 text-left item"><a data-lightbox="photos" href="assets/img/WhatsApp%20Image%202020-11-11%20at%2013.28.26.jpeg"><img class="img-fluid" src="assets/img/WhatsApp%20Image%202020-11-11%20at%2013.28.26.jpeg" width="370"></a></div>
                        <div class="col-sm-6 col-md-4 col-lg-3 col-xl-6 text-right item"><a data-lightbox="photos" href="assets/img/WhatsApp%20Image%202020-11-11%20at%2013.26.09.jpeg"><img class="img-fluid" src="assets/img/WhatsApp%20Image%202020-11-11%20at%2013.26.09.jpeg" width="700"></a></div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <div class="container text-center">
            <p data-aos="fade-up" data-aos-duration="1500" data-aos-delay="300" data-aos-once="true">Copyright Â©&nbsp;NewGen 2020</p>
        </div>
    </footer>
    <script type="text/javascript">
				function googleTranslateElementInit() {
					new google.translate.TranslateElement({ pageLanguage: 'pt-br' }, 'google_translate_element');
				}
			</script>
	<script type="text/javascript"
		src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.2.0/aos.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="assets/js/Off-Canvas-Sidebar-Drawer-Navbar.js"></script>
    <script src="assets/js/grayscale.js"></script>
    <script src="assets/js/Off-Canvas-Sidebar-Drawer-Navbar-1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
</body>

</html>