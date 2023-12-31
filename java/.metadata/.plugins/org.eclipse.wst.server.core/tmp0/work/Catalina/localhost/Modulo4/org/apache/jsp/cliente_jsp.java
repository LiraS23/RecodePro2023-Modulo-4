/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.13
 * Generated at: 2023-11-03 15:00:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, height=device-height, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Cliente</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"assets/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"assets/fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/fonts.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"page\">\r\n");
      out.write("		<header\r\n");
      out.write("			class=\"section page-header breadcrumbs-custom-wrap bg-gradient bg-secondary-2 novi-background bg-cover\">\r\n");
      out.write("			<!-- RD Navbar-->\r\n");
      out.write("			<div class=\"rd-navbar-wrap rd-navbar-default\">\r\n");
      out.write("				<nav class=\"rd-navbar\" data-layout=\"rd-navbar-fixed\"\r\n");
      out.write("					data-sm-layout=\"rd-navbar-fixed\" data-md-layout=\"rd-navbar-fixed\"\r\n");
      out.write("					data-md-device-layout=\"rd-navbar-fixed\"\r\n");
      out.write("					data-lg-layout=\"rd-navbar-fullwidth\"\r\n");
      out.write("					data-xl-layout=\"rd-navbar-static\"\r\n");
      out.write("					data-lg-device-layout=\"rd-navbar-fixed\"\r\n");
      out.write("					data-xl-device-layout=\"rd-navbar-static\"\r\n");
      out.write("					data-md-stick-up-offset=\"2px\" data-lg-stick-up-offset=\"2px\"\r\n");
      out.write("					data-stick-up=\"true\" data-sm-stick-up=\"true\"\r\n");
      out.write("					data-md-stick-up=\"true\" data-lg-stick-up=\"true\"\r\n");
      out.write("					data-xl-stick-up=\"true\">\r\n");
      out.write("					<div class=\"rd-navbar-inner\">\r\n");
      out.write("						<!-- RD Navbar Panel-->\r\n");
      out.write("						<div class=\"rd-navbar-panel\">\r\n");
      out.write("							<!-- RD Navbar Toggle-->\r\n");
      out.write("							<button class=\"rd-navbar-toggle\"\r\n");
      out.write("								data-rd-navbar-toggle=\".rd-navbar-nav-wrap\">\r\n");
      out.write("								<span></span>\r\n");
      out.write("							</button>\r\n");
      out.write("							<!-- RD Navbar Brand-->\r\n");
      out.write("							<div class=\"rd-navbar-brand\">\r\n");
      out.write("								<a class=\"brand-name\" href=\"index.html\"><img\r\n");
      out.write("									class=\"logo-default\"\r\n");
      out.write("									src=\"assets/images/logo-default-208x46.png\" alt=\"\" width=\"208\"\r\n");
      out.write("									height=\"46\" /><img class=\"logo-inverse\"\r\n");
      out.write("									src=\"assets/images/logo-inverse-208x46.png\" alt=\"\" width=\"208\"\r\n");
      out.write("									height=\"46\" /></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"rd-navbar-aside-right\">\r\n");
      out.write("							<div class=\"rd-navbar-nav-wrap\">\r\n");
      out.write("								<!-- RD Navbar Nav-->\r\n");
      out.write("								<ul class=\"rd-navbar-nav\">\r\n");
      out.write("									<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("									<li><a href=\"destinos.jsp\">Destinos</a></li>\r\n");
      out.write("									<li><a href=\"promocoes.html\">Promoções</a></li>\r\n");
      out.write("									<li><a href=\"contato.html\">Contato</a></li>\r\n");
      out.write("									<li class=\"active\"><a href=\"cliente.jsp\">Cliente</a></li>\r\n");
      out.write("									<li><a href=\"pedidos.jsp\">Reserve um passeio</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- Breadcrumbs-->\r\n");
      out.write("			<section class=\"breadcrumbs-custom\"\r\n");
      out.write("				style=\"background: url(&quot;https://travelplustur.com.br/wp-content/uploads/2022/04/travelplus-tur-22.jpg&quot;); background-size: cover;\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<p class=\"breadcrumbs-custom-subtitle\">Faça seu registro</p>\r\n");
      out.write("					<p class=\"heading-1 breadcrumbs-custom-title\">Cadastro</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		<!-- Cadastro-->\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"section section-wrap bg-gray-lighter novi-background bg-cover\">\r\n");
      out.write("			<div class=\"section-wrap-inner\">\r\n");
      out.write("				<div class=\"container container-bigger\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<div class=\"section section-lg\">\r\n");
      out.write("								<h3>Cadastre-se</h3>\r\n");
      out.write("								<hr class=\"divider divider-left divider-secondary\">\r\n");
      out.write("								<p class=\"big\">Não perca a oportunidade de começar a\r\n");
      out.write("									explorar o mundo. Cadastre-se agora para acessar ofertas\r\n");
      out.write("									exclusivas, itinerários personalizados e as últimas novidades\r\n");
      out.write("									em viagens. Sua próxima jornada está a apenas um clique de\r\n");
      out.write("									distância. Junte-se a nós!</p>\r\n");
      out.write("								<!--form-->\r\n");
      out.write("								<form class=\"\" data-form-output=\"form-output-global\"\r\n");
      out.write("									data-form-type=\"contact\" method=\"post\"\r\n");
      out.write("									action=\"/Modulo4/ClienteController\">\r\n");
      out.write("									<input type=\"hidden\" name=\"action\" value=\"adicionar\">\r\n");
      out.write("									<div class=\"row row-fix row-20\">\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label for=\"cpf\">CPF</label> <input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													id=\"cpf\" type=\"text\" name=\"cpf\" placeholder=\"Sem pontos\"\r\n");
      out.write("													data-constraints=\"@Required\" />\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label class=\"form-label-outside\" for=\"nome\">Nome\r\n");
      out.write("													Completo</label> <input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													id=\"nome\" type=\"text\" name=\"nome\"\r\n");
      out.write("													data-constraints=\"@Required\" />\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label class=\"form-label-outside\" for=\"email\">E-mail</label>\r\n");
      out.write("												<input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													id=\"email\" type=\"email\" name=\"email\"\r\n");
      out.write("													data-constraints=\"@Email @Required\" />\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label class=\"form-label-outside\" for=\"dataNasc\">Data\r\n");
      out.write("													de Nascimento</label><input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													id=\"dataNasc\" type=\"text\" name=\"dataNasc\"\r\n");
      out.write("													placeholder=\"dd/MM/yyyy\"\r\n");
      out.write("													data-constraints=\"@Numeric @Required\" />\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-sm-12 offset-custom-1\">\r\n");
      out.write("											<div class=\"form-button\">\r\n");
      out.write("												<button class=\"btn btn-secondary\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													type=\"submit\">Cadastrar</button>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("		<!-- Adicione essa parte para exibir a lista de clientes -->\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"section section-wrap bg-gray-lighter novi-background bg-cover\">\r\n");
      out.write("			<div class=\"section-wrap-inner\">\r\n");
      out.write("				<div class=\"container container-bigger\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<hr class=\"divider divider-left divider-secondary\">\r\n");
      out.write("							<div class=\"section section-lg\">\r\n");
      out.write("								<div id=\"lista-clientes\">\r\n");
      out.write("									<section>\r\n");
      out.write("										<table class=\"table\">\r\n");
      out.write("											<thead>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<th>CPF</th>\r\n");
      out.write("													<th>Nome</th>\r\n");
      out.write("													<th>E-mail</th>\r\n");
      out.write("													<th>Data de Nascimento</th>\r\n");
      out.write("												</tr>\r\n");
      out.write("											</thead>\r\n");
      out.write("											<tbody>\r\n");
      out.write("												<!-- Os dados dos clientes serão inseridos aqui -->\r\n");
      out.write("											</tbody>\r\n");
      out.write("										</table>\r\n");
      out.write("									</section>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Footer Minimal-->\r\n");
      out.write("		<footer\r\n");
      out.write("			class=\"section page-footer page-footer-minimal novi-background bg-cover text-center bg-gray-darker\">\r\n");
      out.write("			<div class=\"container container-wide\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"row row-fix justify-content-sm-center align-items-md-center row-30\">\r\n");
      out.write("					<div class=\"col-md-10 col-lg-7 col-xl-4 text-xl-left\">\r\n");
      out.write("						<a href=\"index.html\"><img class=\"inverse-logo\"\r\n");
      out.write("							src=\"assets/images/logo-inverse-208x46.png\" alt=\"\" width=\"208\"\r\n");
      out.write("							height=\"46\" /></a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-10 col-lg-7 col-xl-4\">\r\n");
      out.write("						<p class=\"right\">\r\n");
      out.write("							&#169;&nbsp;<span class=\"copyright-year\"></span> All Rights\r\n");
      out.write("							Reserved Viagens Recode\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-10 col-lg-7 col-xl-4 text-xl-right\">\r\n");
      out.write("						<ul class=\"group-xs group-middle\">\r\n");
      out.write("							<li><a\r\n");
      out.write("								class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-facebook\"\r\n");
      out.write("								href=\"#\"></a></li>\r\n");
      out.write("							<li><a\r\n");
      out.write("								class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-twitter\"\r\n");
      out.write("								href=\"#\"></a></li>\r\n");
      out.write("							<li><a\r\n");
      out.write("								class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-instagram\"\r\n");
      out.write("								href=\"#\"></a></li>\r\n");
      out.write("							<li><a\r\n");
      out.write("								class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-google\"\r\n");
      out.write("								href=\"#\"></a></li>\r\n");
      out.write("							<li><a\r\n");
      out.write("								class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi mdi-linkedin\"\r\n");
      out.write("								href=\"#\"></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Global Mailform Output-->\r\n");
      out.write("	<div class=\"snackbars\" id=\"form-output-global\"></div>\r\n");
      out.write("	<!-- Javascript-->\r\n");
      out.write("	<script src=\"assets/js/core.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/script.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document)\r\n");
      out.write("				.ready(\r\n");
      out.write("						function() {\r\n");
      out.write("							// Função para carregar a lista de clientes\r\n");
      out.write("							function carregarListaClientes() {\r\n");
      out.write("								$.ajax({\r\n");
      out.write("									type : \"GET\",\r\n");
      out.write("									url : \"/Modulo4/ClienteController\",\r\n");
      out.write("									data : {\r\n");
      out.write("										action : \"listar\"\r\n");
      out.write("									},\r\n");
      out.write("									success : function(response) {\r\n");
      out.write("										// Atualiza a tabela com a lista de clientes\r\n");
      out.write("										$(\"#lista-clientes tbody\").html(\r\n");
      out.write("												response);\r\n");
      out.write("\r\n");
      out.write("										// Adicione botões \"Editar\" e \"Excluir\" a cada linha\r\n");
      out.write("										addEditAndDeleteButtons();\r\n");
      out.write("									}\r\n");
      out.write("								});\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							function addEditAndDeleteButtons() {\r\n");
      out.write("								// Encontre todas as linhas da tabela de clientes\r\n");
      out.write("								var rows = $(\"#lista-clientes tbody tr\");\r\n");
      out.write("\r\n");
      out.write("								// Para cada linha\r\n");
      out.write("								rows\r\n");
      out.write("										.each(function() {\r\n");
      out.write("											var row = $(this);\r\n");
      out.write("\r\n");
      out.write("											// Obtenha o ID do cliente da linha (você deve ter uma coluna para o ID)\r\n");
      out.write("											var idCliente = row\r\n");
      out.write("													.find(\"td:first\").text();\r\n");
      out.write("\r\n");
      out.write("											// Crie botões \"Editar\" e \"Excluir\" para cada linha\r\n");
      out.write("											var editButton = '<a class=\"btn btn-primary\" href=\"editarCliente.jsp?cpf='\r\n");
      out.write("													+ idCliente\r\n");
      out.write("													+ '\">Editar</button>';\r\n");
      out.write("											var deleteButton = '<button class=\"btn btn-danger\" onclick=\"excluirCliente('\r\n");
      out.write("													+ idCliente\r\n");
      out.write("													+ ')\">Excluir</button>';\r\n");
      out.write("\r\n");
      out.write("											// Adicione as células das colunas de botões à linha\r\n");
      out.write("											row.append('<td>' + editButton\r\n");
      out.write("													+ '</td><td>'\r\n");
      out.write("													+ deleteButton + '</td>');\r\n");
      out.write("										});\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							// Carrega a lista de clientes quando a página é carregada\r\n");
      out.write("							carregarListaClientes();\r\n");
      out.write("						});\r\n");
      out.write("\r\n");
      out.write("		function excluirCliente(cpf) {\r\n");
      out.write("			if (confirm(\"Deseja realmente excluir este Cliente?\")) {\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					type : 'POST',\r\n");
      out.write("					url : '/Modulo4/ClienteController',\r\n");
      out.write("					data : {\r\n");
      out.write("						action : 'excluir',\r\n");
      out.write("						cpf : cpf\r\n");
      out.write("					},\r\n");
      out.write("					success : function(response) {\r\n");
      out.write("						alert(response);\r\n");
      out.write("						// Recarregue a página para atualizar a lista de clientes\r\n");
      out.write("						location.reload();\r\n");
      out.write("					},\r\n");
      out.write("					error : function() {\r\n");
      out.write("						alert('Falha ao excluir o cliente.');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
