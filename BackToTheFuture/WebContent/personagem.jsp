<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<title>Home - Brand</title>
<link rel="icon" type="image/png" sizes="512x512"
	href="assets/img/carro-voador.png">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Cabin:700">
<link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
<link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
<link rel="stylesheet"
	href="assets/fonts/fontawesome5-overrides.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.2.0/aos.css">
<link rel="stylesheet"
	href="assets/css/Off-Canvas-Sidebar-Drawer-Navbar.css">
</head>

<body id="page-top">

	<%@ include file="nav.jsp"%>

	<section data-bs-parallax-bg="true" id="timeline"
		class="content-section text-center"
		style="margin-top: 0px; padding-top: 100px; padding-bottom: 100px;">
		<div class="container">
			<div class="row" style="margin-top: 0px;">
				<div class="col-lg-8 col-xl-10 mx-auto">
					<h2>${personagem.nmPersonagem}</h2>
					<img class="img-fluid"
						src="${personagem.ftPersonagem}" width="700"
						style="margin-bottom: 35px;">
					<p>Data de Nascimento: ${personagem.dtNasc}</p>
					<p>${personagem.dsPersonagem}</p>
				</div>
			</div>
		</div>
	</section>
	
	
	<footer>
		<div class="container text-center">
			<p>Copyright ©&nbsp;NewGen 2020</p>
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
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
	<script src="assets/js/Off-Canvas-Sidebar-Drawer-Navbar.js"></script>
	<script src="assets/js/grayscale.js"></script>
	<script src="assets/js/Off-Canvas-Sidebar-Drawer-Navbar-1.js"></script>
</body>

</html>