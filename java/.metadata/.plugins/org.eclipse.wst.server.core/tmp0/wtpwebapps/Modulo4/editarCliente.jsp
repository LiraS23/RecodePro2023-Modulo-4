<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Editar Cliente</title>

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
									<li class="active"><a href="cliente.jsp">Cliente</a></li>
									<li><a href="pedidos.jsp">Reserve um passeio</a></li>
								</ul>
							</div>
						</div>
					</div>
				</nav>
			</div>
			<!-- Breadcrumbs-->
			<section class="breadcrumbs-custom"
				style="background: url(&quot;https://travelplustur.com.br/wp-content/uploads/2022/04/travelplus-tur-22.jpg&quot;); background-size: cover;">
				<div class="container">
					<p class="breadcrumbs-custom-subtitle">Edite seu</p>
					<p class="heading-1 breadcrumbs-custom-title">Cadastro</p>
				</div>
			</section>

		</header>

		<!-- Cadastro-->
		<section class="section section-lg bg-default text-center">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-md-8">
						<!--form-->
						<form id="editForm" data-form-output="form-output-global"
							data-form-type="edicao" method="post"
							action="/Modulo4/ClienteController">
							<input type="hidden" name="action" value="atualizar">
							<%
							String cpf = request.getParameter("cpf");
							%>
							<input type="hidden" id="cpf" name="cpf" value="<%=cpf%>">
							<div class="form-group">
								<label for="edit_nome">Nome Completo</label> <input type="text"
									class="form-control" id="edit_nome" name="nome" placeholder=""
									data-constraints="@Required"
									style="border: 5px solid #FFA900; border-radius: 20px;">
							</div>
							<div class="form-group">
								<label for="edit_email">E-mail</label> <input type="email"
									class="form-control" id="edit_email" name="email"
									placeholder="exemplo@exemplo.com" data-constraints="@Required"
									style="border: 5px solid #FFA900; border-radius: 20px;">
							</div>
							<div class="form-group">
								<label for="edit_dataNasc">Data de Nascimento</label> <input
									type="text" class="form-control" id="edit_dataNasc"
									name="dataNasc" placeholder="dd/MM/yyyy"
									data-constraints="@Required"
									style="border: 5px solid #FFA900; border-radius: 20px;">
							</div>
							<button type="button" id="saveChangesButton"
								class="btn btn-primary" onclick="atualizarCliente()">Salvar
								Alterações</button>
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
		function atualizarCliente() {
			// Obtenha o valor do CPF do campo oculto
			var cpf = $("#cpf").val();

			// Obtenha os valores dos campos de nome, email e dataNasc
			var nome = $("#edit_nome").val();
			var email = $("#edit_email").val();
			var dataNasc = $("#edit_dataNasc").val();

			// Realize a validação dos campos, se necessário

			// Faça uma solicitação AJAX para o servidor para atualizar o cliente
			$.ajax({
				type : "POST",
				url : "/Modulo4/ClienteController", // A URL deve apontar para o seu servlet
				data : {
					action : "atualizar",
					cpf : cpf,
					nome : nome,
					email : email,
					dataNasc : dataNasc
				},
				success : function(response) {
					alert(response); // Exiba uma mensagem de sucesso ou erro

					// Redirecione para cliente.jsp após a edição bem-sucedida
					window.location.href = 'cliente.jsp';
				},
				error : function() {
					alert('Erro ao atualizar o cliente.');
				}
			});
		}
	</script>
</body>
</html>