<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Cliente</title>

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
					<p class="breadcrumbs-custom-subtitle">Faça seu registro</p>
					<p class="heading-1 breadcrumbs-custom-title">Cadastro</p>
				</div>
			</section>

		</header>

		<!-- Cadastro-->
		<section
			class="section section-wrap bg-gray-lighter novi-background bg-cover">
			<div class="section-wrap-inner">
				<div class="container container-bigger">
					<div class="row">
						<div class="col">
							<div class="section section-lg">
								<h3>Cadastre-se</h3>
								<hr class="divider divider-left divider-secondary">
								<p class="big">Não perca a oportunidade de começar a
									explorar o mundo. Cadastre-se agora para acessar ofertas
									exclusivas, itinerários personalizados e as últimas novidades
									em viagens. Sua próxima jornada está a apenas um clique de
									distância. Junte-se a nós!</p>
								<!--form-->
								<form class="" data-form-output="form-output-global"
									data-form-type="contact" method="post"
									action="/Modulo4/ClienteController">
									<input type="hidden" name="action" value="adicionar">
									<div class="row row-fix row-20">
										<div class="col-md-6">
											<div class="form-wrap form-wrap-validation">
												<label for="cpf">CPF</label> <input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													id="cpf" type="text" name="cpf" placeholder="Sem pontos"
													data-constraints="@Required" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-wrap form-wrap-validation">
												<label class="form-label-outside" for="nome">Nome
													Completo</label> <input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													id="nome" type="text" name="nome"
													data-constraints="@Required" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-wrap form-wrap-validation">
												<label class="form-label-outside" for="email">E-mail</label>
												<input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													id="email" type="email" name="email"
													data-constraints="@Email @Required" />
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-wrap form-wrap-validation">
												<label class="form-label-outside" for="dataNasc">Data
													de Nascimento</label><input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													id="dataNasc" type="text" name="dataNasc"
													placeholder="dd/MM/yyyy"
													data-constraints="@Numeric @Required" />
											</div>
										</div>
										<div class="col-sm-12 offset-custom-1">
											<div class="form-button">
												<button class="btn btn-secondary"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													type="submit">Cadastrar</button>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- Adicione essa parte para exibir a lista de clientes -->
		<section
			class="section section-wrap bg-gray-lighter novi-background bg-cover">
			<div class="section-wrap-inner">
				<div class="container container-bigger">
					<div class="row">
						<div class="col">
							<hr class="divider divider-left divider-secondary">
							<div class="section section-lg">
								<div id="lista-clientes">
									<section>
										<table class="table">
											<thead>
												<tr>
													<th>CPF</th>
													<th>Nome</th>
													<th>E-mail</th>
													<th>Data de Nascimento</th>
												</tr>
											</thead>
											<tbody>
												<!-- Os dados dos clientes serão inseridos aqui -->
											</tbody>
										</table>
									</section>
								</div>
							</div>
						</div>
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
		$(document)
				.ready(
						function() {
							// Função para carregar a lista de clientes
							function carregarListaClientes() {
								$.ajax({
									type : "GET",
									url : "/Modulo4/ClienteController",
									data : {
										action : "listar"
									},
									success : function(response) {
										// Atualiza a tabela com a lista de clientes
										$("#lista-clientes tbody").html(
												response);

										// Adicione botões "Editar" e "Excluir" a cada linha
										addEditAndDeleteButtons();
									}
								});
							}

							function addEditAndDeleteButtons() {
								// Encontre todas as linhas da tabela de clientes
								var rows = $("#lista-clientes tbody tr");

								// Para cada linha
								rows
										.each(function() {
											var row = $(this);

											// Obtenha o ID do cliente da linha (você deve ter uma coluna para o ID)
											var idCliente = row
													.find("td:first").text();

											// Crie botões "Editar" e "Excluir" para cada linha
											var editButton = '<a class="btn btn-primary" href="editarCliente.jsp?cpf='
													+ idCliente
													+ '">Editar</button>';
											var deleteButton = '<button class="btn btn-danger" onclick="excluirCliente('
													+ idCliente
													+ ')">Excluir</button>';

											// Adicione as células das colunas de botões à linha
											row.append('<td>' + editButton
													+ '</td><td>'
													+ deleteButton + '</td>');
										});
							}

							// Carrega a lista de clientes quando a página é carregada
							carregarListaClientes();
						});

		function excluirCliente(cpf) {
			if (confirm("Deseja realmente excluir este Cliente?")) {
				$.ajax({
					type : 'POST',
					url : '/Modulo4/ClienteController',
					data : {
						action : 'excluir',
						cpf : cpf
					},
					success : function(response) {
						alert(response);
						// Recarregue a página para atualizar a lista de clientes
						location.reload();
					},
					error : function() {
						alert('Falha ao excluir o cliente.');
					}
				});
			}
		}
	</script>


</body>
</html>