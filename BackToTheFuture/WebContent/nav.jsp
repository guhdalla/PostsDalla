<nav class="navbar navbar-dark fixed-top bg-dark off-canvas"
	data-right-drawer="0" data-open-drawer="0"
	style="font-family: Lora, serif; width: 360px;">
	<div class="container-fluid flex-column">
		<button class="btn btn-dark drawer-knob" type="button"
			data-open="drawer"
			style="background: rgb(0, 0, 0); border-width: 0px;">
			<svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em"
				viewBox="0 0 24 24" stroke-width="2" stroke="currentColor"
				fill="none" stroke-linecap="round" stroke-linejoin="round"
				class="icon icon-tabler icon-tabler-align-left"
				data-bs-hover-animate="tada"
				style="width: 25px; height: 25px; margin-right: -6px;">
  <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
  <line x1="4" y1="6" x2="20" y2="6"></line>
  <line x1="4" y1="12" x2="14" y2="12"></line>
  <line x1="4" y1="18" x2="18" y2="18"></line>
</svg>
		</button>
		<div class="d-flex justify-content-between brand-line">
			<a class="navbar-brand" data-bs-hover-animate="pulse"
				href="/BackToTheFuture/home"
				style="font-family: Cabin, sans-serif; letter-spacing: 1px; font-size: 17px;"><fmt:message key="botao.home"/></a>
			<button class="btn btn-dark" data-bs-hover-animate="tada"
				type="button" data-dismiss="drawer"
				style="background: rgb(0, 0, 0); border-width: 0px;">
				<span class="sr-only">Toggle Navigation&nbsp;</span><i
					class="fas fa-times"></i>
			</button>
		</div>
		<ul class="nav navbar-nav text-center flex-column drawer-menu">
			<li class="nav-item">
				<div>
					<a class="btn btn-primary" data-toggle="collapse"
						aria-expanded="false" aria-controls="collapse-1"
						href="#collapse-1" role="button" data-bs-hover-animate="pulse"
						style="color: rgb(255, 255, 255); background: rgba(66, 220, 163, 0); border-width: 0px; letter-spacing: 3px;"><fmt:message key="botao.acontecimento"/></a>
					<div class="collapse" id="collapse-1">
						<div class="container">
							<c:forEach items="${listaAcontecimento}" var="listaAcontecimento">
								<div class="col-xl-6" data-bs-hover-animate="pulse">
									<figure class="figure">
										<img class="img-fluid figure-img"
											src="${listaAcontecimento.ftAcontecimento}">
										<figcaption class="figure-caption">
											<a class="active"
												href="#${listaAcontecimento.cdAcontecimento}">${listaAcontecimento.dtAno}</a>
										</figcaption>
									</figure>
								</div>
							</c:forEach>

						</div>
					</div>
				</div>
				<div>
					<a class="btn btn-primary" data-toggle="collapse"
						aria-expanded="false" aria-controls="collapse-2"
						href="#collapse-2" role="button" data-bs-hover-animate="pulse"
						style="color: rgb(255, 255, 255); background: rgba(66, 220, 163, 0); border-width: 0px; letter-spacing: 3px;"><fmt:message key="botao.personagens"/></a>
					<div class="collapse" id="collapse-2">
						<div class="container">

							<c:forEach items="${listaPersonagem}" var="listaPersonagem">
								<div class="col-xl-6" data-bs-hover-animate="pulse">
									<figure class="figure">
										<img class="img-fluid figure-img"
											src="${listaPersonagem.ftPersonagem}">
										<figcaption class="figure-caption">
											<a class="active"
												href="/BackToTheFuture/personagem?cdPersonagem=${listaPersonagem.cdPersonagem}">${listaPersonagem.nmPersonagem}</a>
										</figcaption>
									</figure>
								</div>
							</c:forEach>


						</div>
					</div>
				</div>
			</li>
		</ul>
		<ul class="nav navbar-nav flex-column bottom-nav">


			<ul
				class="nav navbar-nav d-md-flex justify-content-md-center align-items-md-center flex-column bottom-nav"
				style="text-align: center;">
				<li class="nav-item">
					<div>
						<a class="btn btn-primary" data-toggle="collapse"
							aria-expanded="true" aria-controls="collapse-3"
							href="#collapse-3" role="button" data-bs-hover-animate="pulse"
							style="color: rgb(255, 255, 255); background: rgba(66, 220, 163, 0); border-width: 0px; letter-spacing: 3px;">Newgen</a>
						<div class="collapse" id="collapse-3">
							<div
								class="container d-md-flex justify-content-md-center align-items-md-center">
								<a href="diagrama.jsp"
									style="border-color: rgb(255, 255, 255); color: rgb(255, 255, 255); font-family: Cabin, sans-serif; letter-spacing: 3px;">DIAGRAMA
									DE CLASSES</a><a href="machine.jsp"
									style="border-color: rgb(255, 255, 255); color: rgb(255, 255, 255); font-family: Cabin, sans-serif; letter-spacing: 3px;">MACHINE
									LEARNING</a>
							</div>
						</div>
					</div>
				</li>
				<li
					class="nav-item d-flex justify-content-xl-center align-items-xl-center">
					<!-- <div id="google_translate_element"></div> --> 
					<a class="nav-link text-center active"
					href="change?lingua=pt-br"
					data-bs-hover-animate="pulse"
					style="font-family: Cabin, sans-serif; letter-spacing: 3px; width: 50px; background: url(assets/img/brasil.png) center/contain no-repeat; height: 30px;"></a>


					<a class="nav-link text-center active"
					href="change?lingua=en"
					data-bs-hover-animate="pulse"
					style="font-family: Cabin, sans-serif; letter-spacing: 3px; width: 50px; background: url(assets/img/estados-unidos.png) center/contain no-repeat; height: 30px;"></a>


				</li>
			</ul>
	</div>
</nav>
