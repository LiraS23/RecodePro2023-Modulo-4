/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.13
 * Generated at: 2023-11-03 15:02:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class destinos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Destinos</title>\r\n");
      out.write("<link rel=\"icon\" href=\"assets/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<!-- Stylesheets -->\r\n");
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
      out.write("			<div class=\"rd-navbar-wrap rd-navbar-default\" style=\"z-index: 1000;\">\r\n");
      out.write("				<nav\r\n");
      out.write("					class=\"rd-navbar rd-navbar-expand-lg rd-navbar-light custom-navbar\"\r\n");
      out.write("					style=\"z-index: 1000;\" data-layout=\"rd-navbar-fixed\"\r\n");
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
      out.write("									<li class=\"active\"><a href=\"destinos.jsp\">Destinos</a></li>\r\n");
      out.write("									<li><a href=\"promocoes.html\">Promoções</a></li>\r\n");
      out.write("									<li><a href=\"contato.html\">Contato</a></li>\r\n");
      out.write("									<li><a href=\"cliente.jsp\">Cliente</a></li>\r\n");
      out.write("									<li><a href=\"pedidos.jsp\">Reserve um passeio</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- Breadcrumbs-->\r\n");
      out.write("			<section class=\"breadcrumbs-custom\"\r\n");
      out.write("				style=\"background: url(&quot;https://png.pngtree.com/thumb_back/fw800/back_pic/03/93/99/8257e7bbd63b3ff.jpg&quot;); background-size: cover;\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<p class=\"breadcrumbs-custom-subtitle\">Encontre seu proximo\r\n");
      out.write("						destino!</p>\r\n");
      out.write("					<p class=\"heading-1 breadcrumbs-custom-title\">Destinos</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		<!-- Cadastro destinos-->\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"section section-wrap bg-gray-lighter novi-background bg-cover\">\r\n");
      out.write("			<div class=\"section-wrap-inner\">\r\n");
      out.write("				<div class=\"container container-bigger\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<div class=\"section section-lg\">\r\n");
      out.write("								<h3>Cadastro destinos</h3>\r\n");
      out.write("								<hr class=\"divider divider-left divider-secondary\">\r\n");
      out.write("								<!-- RD Mailform-->\r\n");
      out.write("								<form class=\"\" data-form-output=\"form-output-global\"\r\n");
      out.write("									data-form-type=\"cadastro\" method=\"post\"\r\n");
      out.write("									action=\"/Modulo4/MeuPacoteServlet\">\r\n");
      out.write("									<input type=\"hidden\" name=\"action\" value=\"adicionar\">\r\n");
      out.write("									<div class=\"row row-fix row-20\">\r\n");
      out.write("										<div class=\"col-md-6\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label class=\"form-label-outside\" for=\"destino\">Destino</label>\r\n");
      out.write("												<input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													id=\"destino\" type=\"text\" name=\"destino\" required>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-md-2\">\r\n");
      out.write("											<div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("												<label class=\"form-label-outside\" for=\"valorDiaria\">Valor\r\n");
      out.write("													Diária:</label> <input class=\"form-control\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													type=\"text\" name=\"valorDiaria\" placeholder=\"R$ 0.00\"\r\n");
      out.write("													required>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"col-sm-12 offset-custom-1\">\r\n");
      out.write("											<div class=\"form-button\">\r\n");
      out.write("												<input class=\"btn btn-secondary\"\r\n");
      out.write("													style=\"border: 5px solid #FFA900; border-radius: 20px;\"\r\n");
      out.write("													type=\"submit\" value=\"Adicionar Pacote\">\r\n");
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
      out.write("		<!-- Listar Pacotes -->\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"section section-wrap bg-gray-lighter novi-background bg-cover\">\r\n");
      out.write("			<div class=\"section-wrap-inner\">\r\n");
      out.write("				<div class=\"container container-bigger\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col\">\r\n");
      out.write("							<hr class=\"divider divider-left divider-secondary\">\r\n");
      out.write("							<div class=\"section section-lg\">\r\n");
      out.write("								<!-- Tabela para listar os pacotes -->\r\n");
      out.write("								<section>\r\n");
      out.write("									<table class=\"table\">\r\n");
      out.write("										<tbody id=\"lista-destinos\">\r\n");
      out.write("											<!-- Os dados da lista de destinos serão inseridos aqui -->\r\n");
      out.write("										</tbody>\r\n");
      out.write("									</table>\r\n");
      out.write("								</section>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
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
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Global Mailform Output-->\r\n");
      out.write("	<div class=\"snackbars\" id=\"form-output-global\"></div>\r\n");
      out.write("	<!-- Javascript-->\r\n");
      out.write("	<script src=\"assets/js/core.min.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/script.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		function listarDestinos() {\r\n");
      out.write("			// Use AJAX para solicitar a lista de destinos ao servidor\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type : 'GET',\r\n");
      out.write("				url : '/Modulo4/MeuPacoteServlet?action=listar', // Certifique-se de que seu Servlet esteja mapeado corretamente\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					// Atualize a tabela com os dados recebidos do servidor\r\n");
      out.write("					$('#lista-destinos').html(data);\r\n");
      out.write("\r\n");
      out.write("					// Adicione botões \"Editar\" a cada registro da tabela\r\n");
      out.write("					addEditButtons();\r\n");
      out.write("				},\r\n");
      out.write("				error : function() {\r\n");
      out.write("					alert('Falha ao listar os destinos.');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function addEditButtons() {\r\n");
      out.write("			// Encontre todas as linhas da tabela\r\n");
      out.write("			var rows = $('#lista-destinos tr');\r\n");
      out.write("\r\n");
      out.write("			// Para cada linha, exceto a primeira que contém cabeçalhos\r\n");
      out.write("			for (var i = 1; i < rows.length; i++) {\r\n");
      out.write("				var row = rows[i];\r\n");
      out.write("				var idPacote = $(row).find('td:first').text(); // Obtenha o ID do pacote da primeira coluna\r\n");
      out.write("\r\n");
      out.write("				// Crie o botão \"Editar\" com o ID do destino como parâmetro na URL\r\n");
      out.write("				var editButton = '<a class=\"btn btn-primary\" href=\"editarDestino.jsp?idPacote='\r\n");
      out.write("						+ idPacote + '\">Editar</a>';\r\n");
      out.write("\r\n");
      out.write("				// Crie o botão \"Excluir\" com o ID do destino como parâmetro na URL\r\n");
      out.write("				var deleteButton = '<a class=\"btn btn-danger\" href=\"javascript:excluirDestino('\r\n");
      out.write("						+ idPacote + ')\">Excluir</a>';\r\n");
      out.write("\r\n");
      out.write("				// Crie uma nova célula na tabela para o botão \"Editar\"\r\n");
      out.write("				var editButtonCell = '<td>' + editButton + '</td>';\r\n");
      out.write("\r\n");
      out.write("				// Crie uma nova célula na tabela para o botão \"Excluir\"\r\n");
      out.write("				var deleteButtonCell = '<td>' + deleteButton + '</td>';\r\n");
      out.write("\r\n");
      out.write("				// Adicione as novas células à linha\r\n");
      out.write("				$(row).append(editButtonCell + deleteButtonCell);\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function excluirDestino(idPacote) {\r\n");
      out.write("			if (confirm(\"Deseja realmente excluir este pacote?\")) {\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					type : 'POST',\r\n");
      out.write("					url : '/Modulo4/MeuPacoteServlet',\r\n");
      out.write("					data : {\r\n");
      out.write("						action : 'excluir',\r\n");
      out.write("						idPacote : idPacote\r\n");
      out.write("					},\r\n");
      out.write("					success : function(response) {\r\n");
      out.write("						alert(response);\r\n");
      out.write("						// Recarregue a lista de destinos após a exclusão\r\n");
      out.write("						listarDestinos();\r\n");
      out.write("					},\r\n");
      out.write("					error : function() {\r\n");
      out.write("						alert('Falha ao excluir o pacote.');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			listarDestinos();\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
