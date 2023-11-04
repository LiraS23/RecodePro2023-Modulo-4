<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Editar pedidos</title>

<link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
<link rel="stylesheet" type="text/css"
	href="assets/fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900">
<link rel="stylesheet" href="assets/css/bootstrap.css">
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/fonts.css">
</head>
<body>
	<div class="page">
		<header
			class="section page-header breadcrumbs-custom-wrap bg-gradient bg-secondary-2 novi-background bg-cover">
			<!-- RD Navbar-->
			<div class="rd-navbar-wrap rd-navbar-default">
				<nav class="rd-navbar" data-layout="rd-navbar-fixed"
					data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed"
					data-md-device-layout="rd-navbar-fixed"
					data-lg-layout="rd-navbar-fullwidth"
					data-xl-layout="rd-navbar-static"
					data-lg-device-layout="rd-navbar-fixed"
					data-xl-device-layout="rd-navbar-static"
					data-md-stick-up-offset="2px" data-lg-stick-up-offset="2px"
					data-stick-up="true" data-sm-stick-up="true"
					data-md-stick-up="true" data-lg-stick-up="true"
					data-xl-stick-up="true">
					<div class="rd-navbar-inner">
						<!-- RD Navbar Panel-->
						<div class="rd-navbar-panel">
							<!-- RD Navbar Toggle-->
							<button class="rd-navbar-toggle"
								data-rd-navbar-toggle=".rd-navbar-nav-wrap">
								<span></span>
							</button>
							<!-- RD Navbar Brand-->
							<div class="rd-navbar-brand">
								<a class="brand-name" href="index.html"><img
									class="logo-default"
									src="assets/images/logo-default-208x46.png" alt="" width="208"
									height="46" /><img class="logo-inverse"
									src="assets/images/logo-inverse-208x46.png" alt="" width="208"
									height="46" /></a>
							</div>
						</div>
						<div class="rd-navbar-aside-right">
							<div class="rd-navbar-nav-wrap">
								<!-- RD Navbar Nav-->
								<ul class="rd-navbar-nav">
									<li><a href="index.html">Home</a></li>
									<li><a href="destinos.jsp">Destinos</a></li>
									<li><a href="promocoes.html">Promoções</a></li>
									<li><a href="contato.html">Contato</a></li>
									<li><a href="cliente.jsp">Cliente</a></li>
									<li class="active"><a href="pedidos.jsp">Reserve um
											passeio</a></li>
								</ul>
							</div>
						</div>
					</div>
				</nav>
			</div>
			<!-- Breadcrumbs-->
			<section class="breadcrumbs-custom"
				style="background: url(&quot;https://img.freepik.com/vetores-premium/hora-de-viajar-fundo-em-desenho-de-desenho-animado-em-vista-superior-papel-de-parede-com-composicao-de-passaporte_198565-2071.jpg?w=2000&quot;); background-size: cover;">
				<div class="container">
					<p class="breadcrumbs-custom-subtitle">Vamos Viajar!</p>
					<p class="heading-1 breadcrumbs-custom-title">Editar pedido</p>
				</div>
			</section>
		</header>

		<!-- Promoções info-->
		<section class="section section-lg bg-default text-center">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-md-8">
						<div class="section section-lg">
							<h3>Lista de destinos</h3>
							<!-- Tabela para listar os pacotes -->
							<table class="table">
								<tbody id="lista-destinos">
									<!-- Os dados da lista de destinos serão inseridos aqui -->
								</tbody>
							</table>
						</div>
						<hr class="divider divider-left divider-secondary">
						<br> <br>
						<!--form-->
						<form class="" data-form-output="form-output-global"
							data-form-type="cadastro" method="post" action="/Modulo4/Pedido">
							<input type="hidden" name="action" value="atualizar">
							<div class="form-group">
								<label for="diariasPedido">Diárias:</label> <input type="number"
									class="form-control" id="diariasPedido" name="diariasPedido"
									placeholder="Dias" min="0" required>
							</div>
							<div class="form-group">
								<label for="fk_pacote_idPacote">ID do Destino:</label> <input
									type="text" class="form-control" id="fk_pacote_idPacote"
									name="fk_pacote_idPacote" placeholder="Informe o ID do Pacote"
									required>
							</div>
							<div class="form-group">
								<label for="fk_cliente_cpf">CPF do Cliente:</label> <input
									type="text" class="form-control" id="fk_cliente_cpf"
									name="fk_cliente_cpf" placeholder="Informe o CPF do Cliente"
									required>
							</div>
							<%int idPedido = Integer.parseInt(request.getParameter("idPedido"));%>
							<input type="hidden" name="idPedido" value="<%=idPedido%>">
							<button type="submit" class="btn btn-primary">Atualizar
								Pedido</button>
						</form>
					</div>
				</div>
			</div>
		</section>

		<!-- Footer Minimal-->
		<footer
			class="section page-footer page-footer-minimal novi-background bg-cover text-center bg-gray-darker">
			<div class="container container-wide">
				<div
					class="row row-fix justify-content-sm-center align-items-md-center row-30">
					<div class="col-md-10 col-lg-7 col-xl-4 text-xl-left">
						<a href="index.html"><img class="inverse-logo"
							src="assets/images/logo-inverse-208x46.png" alt="" width="208"
							height="46" /></a>
					</div>
					<div class="col-md-10 col-lg-7 col-xl-4">
						<p class="right">
							&#169;&nbsp;<span class="copyright-year"></span> All Rights
							Reserved Viagens Recode
						</p>
					</div>
					<div class="col-md-10 col-lg-7 col-xl-4 text-xl-right">
						<ul class="group-xs group-middle">
							<li><a
								class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-facebook"
								href="#"></a></li>
							<li><a
								class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-twitter"
								href="#"></a></li>
							<li><a
								class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-instagram"
								href="#"></a></li>
							<li><a
								class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-google"
								href="#"></a></li>
							<li><a
								class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-linkedin"
								href="#"></a></li>
						</ul>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<!-- Global Mailform Output-->
	<div class="snackbars" id="form-output-global"></div>
	<!-- Javascript-->
	<script src="assets/js/core.min.js"></script>
	<script src="assets/js/script.js"></script>
	<script>
		function listarDestinos() {
			// Use AJAX para solicitar a lista de destinos ao servidor
			$.ajax({
				type : 'GET',
				url : '/Modulo4/MeuPacoteServlet?action=listar', // Certifique-se de que seu Servlet esteja mapeado corretamente
				success : function(data) {
					// Atualize a tabela com os dados recebidos do servidor
					$('#lista-destinos').html(data);
				},
				error : function() {
					alert('Falha ao listar os destinos.');
				}
			});
		}
	</script>

	<script>
		$(document).ready(function() {
			listarDestinos();
		});
	</script>
</body>

</html>