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
                    <h2 data-aos="zoom-out" data-aos-duration="1500" data-aos-delay="150" data-aos-once="true">Diagrama de classes</h2><img class="img-fluid" src="assets/img/Diagrama.PNG" width="700" style="margin-bottom: 60px;background-image: url(assets/img/1955-original-timeline-1588340925.jpg);background-position: center;background-size: cover;">
                    <div style="margin-bottom: 60px;">
                        <h1 style="font-size: 28px;text-align: left;">Personagem</h1>
                        <p class="text-left">Classe Personagem, está classe apresenta :&nbsp;<br><br>- cdPersonagem : int<br>- nmPersonagem : String<br>- dtNasc : Date<br>- dsPersonagem : String<br>- ftPersonagem : String<br><br>+ selectPersonagem() : Personagem = consultar
                            personagem do banco de dados&nbsp;<br>+ listagemPersonagem() : List&lt;Personagem&gt; = listar personagens do banco de dados&nbsp;</p>
                    </div>
                    <div style="margin-bottom: 60px;">
                        <h1 style="font-size: 28px;text-align: left;">ACONTECIMENTO<br></h1>
                        <p class="text-left">Classe Acontecimento, está classe apresenta :&nbsp;<br>&nbsp;<br>- cdAcontecimento : int&nbsp;<br>- DtAno : int&nbsp;<br>- dsAcontecimento : string&nbsp;<br>- ftAcontecimento : string&nbsp;<br>&nbsp;<br>+ listagemAcontecimento()
                            : List&lt;Acontecimento&gt; = lista de acontecimentos do banco de dados&nbsp;<br></p>
                    </div>
                    <div style="margin-bottom: 60px;">
                        <h1 style="font-size: 28px;text-align: left;">LINHADETEMPO<br></h1>
                        <p class="text-left">&nbsp;Classe LinhaDeTempo, está classe apresenta :&nbsp;<br>&nbsp;<br>-dtAno : int&nbsp;<br></p>
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