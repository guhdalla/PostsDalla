<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html style="height: 100%;">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<title>Ferragens</title>
<link rel="icon" type="image/png" sizes="500x500"
	href="assets/img/logoFerragensCasaGrande.png">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
<link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
<link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
<link rel="stylesheet" href="assets/fonts/line-awesome.min.css">
<link rel="stylesheet"
	href="assets/fonts/fontawesome5-overrides.min.css">
<link rel="stylesheet"
	href="assets/css/Registration-Form-with-Photo.css">
<link rel="stylesheet" href="assets/css/untitled.css">
</head>

<body id="page-top" style="height: 100%;">
	<div id="wrapper" style="height: 100%;">

		<div class="d-flex flex-column" id="content-wrapper">
			<div id="content">
				<nav
					class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
					<div class="container-fluid">

						<div class="sidebar-brand-icon rotate-n-15">
							<a href="index.jsp"><img
								src="assets/img/logoFerragensCasaGrande.png" width="50" /></a>

						</div>
						<div class="sidebar-brand-text mx-3">
							<span>Ferragens Casa Grande</span>
						</div>
						<div class="container d-xl-flex justify-content-xl-center">
							<form
								class="form-inline d-sm-inline-block ml-md-3 my-2 my-md-0 mw-100 navbar-search"
								method="post" action="consultarProduto">
								<div class="input-group">
									<input type="text" class="bg-light form-control border-0 small"
										name="consulta_produto" placeholder="Pesquise um Produto ..." />
									<div class="input-group-append">
										<button class="btn btn-primary py-0" type="submit">
											<i class="fas fa-search"></i>
										</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</nav>
				<div class="container-fluid">
					<h3 class="text-center text-dark mb-1">Ferragens Casa Grande</h3>
				</div>
				<div class="container">
					<c:if test="${not empty paramAviso}">
						<div class="alert alert-primary" role="alert">
						<a href="excluirAviso"><button type="button" class="close" aria-label="Close">
								<span aria-hidden="true">x</span>
							</button></a>
							
							<h2>${paramAviso}</h2>
						</div>
					</c:if>
					<!-- INICIO PRATELEIRA -->
					<c:forEach items="${listaPrateleira}" var="listandoPrateleira">
						<div id="${listandoPrateleira.cdPrateleira}"
							class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th class="text-left d-flex align-items-xl-center"
											style="text-align: center;">Prateleira
											${listandoPrateleira.cdPrateleira}
											<div
												class="dropright d-xl-flex justify-content-xl-center align-items-xl-center">
												<button class="btn btn-primary" data-toggle="dropdown"
													aria-expanded="false" type="button"
													style="margin-left: 20px; color: rgb(80, 80, 85); background: url('assets/img/editar.png') center/contain no-repeat, rgba(78, 115, 223, 0); border-color: rgba(80, 80, 85, 0);"></button>
												<div class="dropdown-menu">
													<a class="dropdown-item"
														href="#editarPrateleira${listandoPrateleira.cdPrateleira}"
														data-toggle="modal">Editar Prateleira<br></a><a
														class="dropdown-item"
														href="/FerragensCasaGrande/removerPrateleira?cdPrateleira=${listandoPrateleira.cdPrateleira}">Remover
														Prateleira<br>
													</a>
												</div>
											</div>
										</th>
									</tr>
								</thead>
								<tbody class="d-table">
									<tr>
										<td>
											<!-- INICIO LINHA --> <c:forEach items="${listaLinha}"
												var="listandoLinha">
												<c:if
													test="${listandoLinha.cdPrateleira == listandoPrateleira.cdPrateleira}">
													<div id="${listandoLinha.cdLinha}" class="col-xl-12 d-flex"
														style="border-top: 4px solid rgb(78, 78, 84); border-right: 8px solid rgb(78, 78, 84); border-bottom-color: rgb(78, 78, 84); border-left: 8px solid rgb(78, 78, 84); width: auto;">
														<div
															class="dropright d-xl-flex justify-content-xl-center align-items-xl-center">
															<button class="btn btn-primary" data-toggle="dropdown"
																aria-expanded="false" type="button">
																<i class="fas fa-bars"></i>
															</button>
															<div class="dropdown-menu">
																<label>Linha: ${listandoLinha.cdLinha}</label> <a
																	class="dropdown-item"
																	href="#criarCaixa${listandoLinha.cdLinha}"
																	data-toggle="modal">Criar Caixa</a><a
																	class="dropdown-item"
																	href="addLinha?cdPrateleira=${listandoPrateleira.cdPrateleira}">Adicionar
																	Linha<br>
																</a> <a class="dropdown-item"
																	href="removeLinha?cdLinha=${listandoLinha.cdLinha}">Remover
																	Linha<br>
																</a>
															</div>
														</div>
														<!-- INICIO CAIXA -->
														<c:forEach items="${listaCaixa}" var="listandoCaixa">
															<c:if
																test="${listandoLinha.cdLinha == listandoCaixa.cdLinha}">
																<div>
																	<a id="caixa${listandoCaixa.cdCaixa}"
																		class="btn btn-primary btn-lg d-lg-flex d-xl-flex justify-content-lg-center align-items-lg-end justify-content-xl-center align-items-xl-end"
																		role="button" data-toggle="modal"
																		href="#caixaModal${listandoCaixa.cdCaixa}"
																		style="background: url(assets/img/caixa-de-papelao.png) center/cover no-repeat; width: 100px; height: 100px; border-width: 0px; color: rgb(0, 0, 0);">${listandoCaixa.nmCaixa}
																		${listandoCaixa.cdCaixa}</a>
																</div>
																<!-- CAIXA -->
																<div class="modal fade" role="dialog" tabindex="-1"
																	id="caixaModal${listandoCaixa.cdCaixa}">
																	<div class="modal-dialog" role="document">
																		<div class="modal-content">
																			<div class="modal-header">
																				<h4 class="d-xl-flex align-items-xl-center"
																					style="margin-right: 13px;">Caixa
																					${listandoCaixa.nmCaixa}</h4>
																				<a class="btn btn-primary"
																					href="removeCaixa?cdCaixa=${listandoCaixa.cdCaixa}"><i
																					class="fas fa-trash"
																					style="background: rgba(234, 234, 234, 0); border-color: rgba(255, 255, 255, 0);"></i></a>
																				<button type="button" class="close"
																					data-dismiss="modal" aria-label="Close">
																					<span aria-hidden="true">x</span>
																				</button>
																			</div>
																			<div class="modal-body">
																				<form method="post" action="atualizarCaixa">
																					<div class="form-group d-block">
																						<div class="form-row">
																							<div class="col-md-12"
																								style="margin-bottom: 21px;">
																								<input class="form-control" type="text"
																									name="nome_caixa" placeholder="Nome da Caixa"
																									value="${listandoCaixa.nmCaixa}"> <input
																									class="form-control" type="hidden"
																									name="cd_caixa" placeholder="Nome da Caixa"
																									value="${listandoCaixa.cdCaixa}">
																							</div>

																							<div class="col-md-12 col-xl-3 offset-xl-3"
																								style="margin-bottom: 21px; margin-left: 10px;">
																								<label>Linha</label> <input class="form-control"
																									type="number" name="cd_linha"
																									placeholder="Linha"
																									value="${listandoLinha.cdLinha}">
																							</div>
																						</div>
																					</div>
																					<div class="form-group text-center">
																						<button class="btn btn-primary" type="submit">Salvar</button>
																					</div>
																				</form>
																				<div class="col-md-12">
																					<div class="table-responsive">
																						<table class="table">
																							<thead>
																								<tr>
																									<th class="text-center" colspan="2"
																										style="width: 224px;">Produto</th>
																									<th class="text-center" style="width: 74px;">Quantidade</th>
																									<th class="text-center" style="width: 34px;">Editar</th>
																								</tr>
																							</thead>
																							<tbody>
																								<tr>
																									<td colspan="4">
																										<form class="d-flex" method="post"
																											style="margin-left: 20px;"
																											action="addProduto?cdCaixa=${listandoCaixa.cdCaixa}">
																											<input type="text" required
																												class="form-control d-xl-flex justify-content-xl-center"
																												name="nome_produto" placeholder="Produto"
																												style="width: 215px; margin-right: 25px;" /><input
																												required type="number" class="form-control"
																												name="qnt_produto"
																												style="width: 89px; margin-right: 25px;" />
																											<button class="btn btn-primary" type="submit"
																												style="background: url(assets/img/mais.png) center/contain no-repeat; width: 42px; height: 23px; border-color: rgba(255, 255, 255, 0);"></button>
																										</form>
																									</td>
																								</tr>

																								<!-- LISTA PRODUTO -->
																								<c:forEach items="${listaProduto}"
																									var="listandoProduto">
																									<c:if
																										test="${listandoCaixa.cdCaixa == listandoProduto.cdCaixa}">
																										<tr>
																											<td><a class="btn btn-primary btn-lg"
																												type="button"
																												href="excluirProduto?cdProduto=${listandoProduto.cdProduto}"
																												style="background: url(assets/img/excluir.png) center/contain no-repeat; width: 20px; height: 20px; border-color: rgba(255, 255, 255, 0);"></a>
																											</td>
																											<td colspan="3">
																												<form id="${listandoProduto.cdProduto}"
																													class="d-flex" method="post"
																													action="alterarProduto?cdProduto=${listandoProduto.cdProduto}">


																													<input type="text"
																														class="form-control d-xl-flex justify-content-xl-center"
																														name="nome_produto" placeholder="Produto"
																														style="width: 180px; margin-right: 26px; margin-left: -45px;"
																														value="${listandoProduto.nmProduto}"
																														required /> <input type="number"
																														class="form-control" name="qnt_produto"
																														style="width: 89px; margin-right: 25px;"
																														value="${listandoProduto.qntProduto}"
																														required />


																													<button class="btn btn-primary"
																														type="submit"
																														style="background: url(assets/img/editar.png) center/contain no-repeat; width: 42px; height: 23px; border-color: rgba(255, 255, 255, 0);"></button>
																												</form>
																											</td>

																										</tr>
																									</c:if>
																								</c:forEach>
																								<!-- FIM LISTA PRODUTO -->

																							</tbody>
																						</table>

																					</div>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>

																<!-- FIM CAIXA -->
															</c:if>
														</c:forEach>
														<!-- FIM CAIXA -->
													</div>
													<!-- EDITAR PRATELEIRA -->
													<div class="modal fade" role="dialog" tabindex="-1"
														id="editarPrateleira${listandoPrateleira.cdPrateleira}">
														<div class="modal-dialog" role="document">
															<div class="modal-content">
																<div class="modal-header">
																	<h4>Prateleira ${listandoPrateleira.cdPrateleira}</h4>
																	<button type="button" class="close"
																		data-dismiss="modal" aria-label="Close">
																		<span aria-hidden="true">x</span>
																	</button>
																</div>
																<div class="modal-body">
																	<form method="post" action="editarPrateleira">
																		<div class="form-group d-block">
																			<div class="form-row">
																				<div class="col-md-12">
																					<input class="form-control" type="number"
																						name="cd_prateleira_novo"
																						placeholder="Codigo da Prateleira"> <input
																						class="form-control" type="hidden"
																						name="cd_prateleira"
																						value="${listandoPrateleira.cdPrateleira}">
																				</div>
																			</div>
																		</div>
																		<div class="form-group text-center">
																			<button class="btn btn-primary" type="submit">Salvar</button>
																		</div>
																	</form>
																</div>
															</div>
														</div>
													</div>
													<!-- FIM EDITAR PRATELEIRA -->
													<!-- CRIAR CAIXA -->
													<div class="modal fade" role="dialog" tabindex="-1"
														id="criarCaixa${listandoLinha.cdLinha}">
														<div class="modal-dialog" role="document">
															<div class="modal-content">
																<div class="modal-header">
																	<h4>Criar Caixa na Linha ${listandoLinha.cdLinha}</h4>
																	<button type="button" class="close"
																		data-dismiss="modal" aria-label="Close">
																		<span aria-hidden="true">x</span>
																	</button>
																</div>
																<div class="modal-body">
																	<form method="post" action="criarCaixa">
																		<div class="form-group d-block">
																			<div class="form-row">
																				<div class="col-md-12">
																					<input class="form-control" type="text"
																						name="nome_caixa" placeholder="Nome da Caixa">
																					<input class="form-control" type="hidden"
																						name="cd_linha" value="${listandoLinha.cdLinha}">
																				</div>
																			</div>
																		</div>
																		<div class="form-group text-center">
																			<button class="btn btn-primary" type="submit">Cadastrar</button>
																		</div>
																	</form>
																</div>
															</div>
														</div>
													</div>
													<!-- FIM CRIAR CAIXA -->
												</c:if>
											</c:forEach> <!-- FIM LINHA -->

											<div class="col-xl-12"
												style="border-top: 4px solid rgb(78, 78, 84); border-right: 8px solid rgb(78, 78, 84); border-bottom-color: rgb(78, 78, 84); border-left: 8px solid rgb(78, 78, 84);">
												<div style="height: 20px; width: auto;"></div>
											</div>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</c:forEach>
					<!-- FIM PRATELEIRA -->
				</div>
				<div class="container text-right">
					<a class="btn btn-primary btn-lg" role="button" data-toggle="modal"
						href="#criarPrateleira">Nova Prateleira</a>
				</div>
			</div>
			<footer class="bg-white sticky-footer">
				<div class="container my-auto">
					<div class="text-center my-auto copyright">
						<span>Copyright © Ferragens Casa Grande 2020</span>
					</div>
				</div>
			</footer>
			<div id="MODAL" style="margin: 0px; margin-bottom: 20px;">

				<!-- CRIAR PRATELEIRA -->
				<div class="modal fade" role="dialog" tabindex="-1"
					id="criarPrateleira">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h4>Criar Prateleira</h4>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">x</span>
								</button>
							</div>
							<div class="modal-body">
								<form method="post" action="criarPrateleira">
									<input type="number" class="form-control" name="cd_prateleira"
										placeholder="Qual o codigo da prateleira?"
										style="margin-bottom: 20px;" /> <input type="number"
										class="form-control" name="linha_prateleira"
										placeholder="Quantas linhas a prateleira possui?"
										style="margin-bottom: 20px;" />
									<div class="form-group text-center">
										<button class="btn btn-primary" type="submit">Criar</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!-- FIM CRIAR PRATELEIRA -->
			</div>
		</div>
	</div>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
	<script src="assets/js/theme.js"></script>
</body>

</html>