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
<title>Home</title>
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

	<header class="masthead"
		style="background: url(assets/img/wp3986098.jpg) center/cover no-repeat; height: 711px;">
		<div class="intro-body">
			<div class="container" style="margin-top: -54px;">
				<div class="row">
					<div class="col-lg-8 col-xl-12 mx-auto">
						<h1 data-aos="fade-down" data-aos-duration="1000"
							data-aos-delay="500" data-aos-once="true"
							style="margin-bottom: 0px; margin-top: 78px;"><fmt:message key="site.timeline"/></h1>
						<h1 data-aos="fade-up" data-aos-duration="1000"
							data-aos-delay="500" data-aos-once="true" class="brand-heading"><fmt:message key="saudacao"/></h1>
						<a class="btn btn-link pulse animated infinite btn-circle"
							role="button" style="margin-top: 345px;"><i
							class="fa fa-angle-double-down animated"></i></a>
					</div>
				</div>
			</div>
		</div>
	</header>

	<c:forEach items="${listaAcontecimento}" var="listaAcontecimento">
		<section data-bs-parallax-bg="true"
			id="${listaAcontecimento.cdAcontecimento}"
			class="content-section text-center"
			style="margin-top: 0px; padding-top: 50px; padding-bottom: 50px;">
			<div class="container">
				<div class="row" style="margin-top: 0px;">
					<div class="col-xl-4 offset-xl-4" data-aos="slide-down"
						data-aos-duration="1000" data-aos-delay="300" data-aos-once="true">
						<hr
							style="background: #ffffff; border-width: 3px; height: 48px; width: 3px;">
						<svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em"
							viewBox="0 0 16 16" fill="currentColor"
							class="bi bi-plus-circle-fill"
							style="width: 25px; height: 25px; margin-top: -34px;">
  <path fill-rule="evenodd"
								d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3v-3z"></path>
</svg>
					</div>
					<div class="col-lg-8 col-xl-10 mx-auto">
						<h2 data-aos="zoom-out" data-aos-duration="1500"
							data-aos-delay="150" data-aos-once="true">${listaAcontecimento.dtAno}</h2>
						<img class="img-fluid" src="${listaAcontecimento.ftAcontecimento}"
							width="700"
							style="margin-bottom: 35px; background-image: url(assets/img/1955-original-timeline-1588340925.jpg); background-position: center; background-size: cover;">
						<p>${listaAcontecimento.dsAcontecimento}</p>
					</div>
				</div>
			</div>
		</section>
	</c:forEach>

	<footer>
		<div class="container text-center">
			<p data-aos="fade-up" data-aos-duration="1500" data-aos-delay="300"
				data-aos-once="true">Copyright ©&nbsp;NewGen 2020</p>
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