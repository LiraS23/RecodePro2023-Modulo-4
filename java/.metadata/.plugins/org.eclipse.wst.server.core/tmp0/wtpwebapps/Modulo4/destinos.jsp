<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Destinos</title>
<link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
<!-- Stylesheets -->
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
			<div class="rd-navbar-wrap rd-navbar-default" style="z-index: 1000;">
				<nav
					class="rd-navbar rd-navbar-expand-lg rd-navbar-light custom-navbar"
					style="z-index: 1000;" data-layout="rd-navbar-fixed"
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
									<li class="active"><a href="destinos.jsp">Destinos</a></li>
									<li><a href="promocoes.html">Promoções</a></li>
									<li><a href="contato.html">Contato</a></li>
									<li><a href="cliente.jsp">Cliente</a></li>
									<li><a href="pedidos.jsp">Reserve um passeio</a></li>
								</ul>
							</div>
						</div>
					</div>
				</nav>
			</div>
			<!-- Breadcrumbs-->
			<section class="breadcrumbs-custom"
				style="background: url(&quot;https://png.pngtree.com/thumb_back/fw800/back_pic/03/93/99/8257e7bbd63b3ff.jpg&quot;); background-size: cover;">
				<div class="container">
					<p class="breadcrumbs-custom-subtitle">Encontre seu proximo
						destino!</p>
					<p class="heading-1 breadcrumbs-custom-title">Destinos</p>
				</div>
			</section>
		</header>

		<!-- Cadastro destinos-->
		<section
			class="section section-wrap bg-gray-lighter novi-background bg-cover">
			<div class="section-wrap-inner">
				<div class="container container-bigger">
					<div class="row">
						<div class="col">
							<div class="section section-lg">
								<h3>Cadastro destinos</h3>
								<hr class="divider divider-left divider-secondary">
								<!-- RD Mailform-->
								<form class="" data-form-output="form-output-global"
									data-form-type="cadastro" method="post"
									action="/Modulo4/MeuPacoteServlet">
									<input type="hidden" name="action" value="adicionar">
									<div class="row row-fix row-20">
										<div class="col-md-6">
											<div class="form-wrap form-wrap-validation">
												<label class="form-label-outside" for="destino">Destino</label>
												<input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													id="destino" type="text" name="destino" required>
											</div>
										</div>
										<div class="col-md-2">
											<div class="form-wrap form-wrap-validation">
												<label class="form-label-outside" for="valorDiaria">Valor
													Diária:</label> <input class="form-control"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													type="text" name="valorDiaria" placeholder="R$ 0.00"
													required>
											</div>
										</div>
										<div class="col-sm-12 offset-custom-1">
											<div class="form-button">
												<input class="btn btn-secondary"
													style="border: 5px solid #FFA900; border-radius: 20px;"
													type="submit" value="Adicionar Pacote">
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

		<!-- Listar Pacotes -->
		<section
			class="section section-wrap bg-gray-lighter novi-background bg-cover">
			<div class="section-wrap-inner">
				<div class="container container-bigger">
					<div class="row">
						<div class="col">
							<hr class="divider divider-left divider-secondary">
							<div class="section section-lg">
								<!-- Tabela para listar os pacotes -->
								<section>
									<table class="table">
										<tbody id="lista-destinos">
											<!-- Os dados da lista de destinos serão inseridos aqui -->
										</tbody>
									</table>
								</section>
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
		function listarDestinos() {
			// Use AJAX para solicitar a lista de destinos ao servidor
			$.ajax({
				type : 'GET',
				url : '/Modulo4/MeuPacoteServlet?action=listar', // Certifique-se de que seu Servlet esteja mapeado corretamente
				success : function(data) {
					// Atualize a tabela com os dados recebidos do servidor
					$('#lista-destinos').html(data);

					// Adicione botões "Editar" a cada registro da tabela
					addEditButtons();
				},
				error : function() {
					alert('Falha ao listar os destinos.');
				}
			});
		}

		function addEditButtons() {
			// Encontre todas as linhas da tabela
			var rows = $('#lista-destinos tr');

			// Para cada linha, exceto a primeira que contém cabeçalhos
			for (var i = 1; i < rows.length; i++) {
				var row = rows[i];
				var idPacote = $(row).find('td:first').text(); // Obtenha o ID do pacote da primeira coluna

				// Crie o botão "Editar" com o ID do destino como parâmetro na URL
				var editButton = '<a class="btn btn-primary" href="editarDestino.jsp?idPacote='
						+ idPacote + '">Editar</a>';

				// Crie o botão "Excluir" com o ID do destino como parâmetro na URL
				var deleteButton = '<a class="btn btn-danger" href="javascript:excluirDestino('
						+ idPacote + ')">Excluir</a>';

				// Crie uma nova célula na tabela para o botão "Editar"
				var editButtonCell = '<td>' + editButton + '</td>';

				// Crie uma nova célula na tabela para o botão "Excluir"
				var deleteButtonCell = '<td>' + deleteButton + '</td>';

				// Adicione as novas células à linha
				$(row).append(editButtonCell + deleteButtonCell);
			}
		}

		function excluirDestino(idPacote) {
			if (confirm("Deseja realmente excluir este pacote?")) {
				$.ajax({
					type : 'POST',
					url : '/Modulo4/MeuPacoteServlet',
					data : {
						action : 'excluir',
						idPacote : idPacote
					},
					success : function(response) {
						alert(response);
						// Recarregue a lista de destinos após a exclusão
						listarDestinos();
					},
					error : function() {
						alert('Falha ao excluir o pacote.');
					}
				});
			}
		}
	</script>

	<script>
		$(document).ready(function() {
			listarDestinos();
		});
	</script>

</body>

</html>