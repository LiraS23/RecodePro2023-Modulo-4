package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pacote;
import dao.PacoteDAO;
import connection.ConnectionFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

@WebServlet("/MeuPacoteServlet")
public class PacoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		Connection conexao = null;
		try {
			conexao = ConnectionFactory.createConnectionToMySQL();
			PacoteDAO pacoteDAO = new PacoteDAO(conexao);

			if ("listar".equals(action)) {
				List<Pacote> pacotes = pacoteDAO.listarPacotes();

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();

				out.println("<tr>");
				out.println("<th>ID</th>");
				out.println("<th>Destino</th>");
				out.println("<th>Valor Diária</th>");
				out.println("</tr>");

				for (Pacote pacote : pacotes) {
					out.println("<tr>");
					out.println("<td>" + pacote.getIdPacote() + "</td>");
					out.println("<td>" + pacote.getDestino() + "</td>");
					out.println("<td>" + pacote.getValorDiaria() + "</td>");
					out.println("</tr>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Erro interno do servidor.");
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		Connection conexao = null;

		try {
			conexao = ConnectionFactory.createConnectionToMySQL();
			PacoteDAO pacoteDAO = new PacoteDAO(conexao);

			if ("adicionar".equals(action)) {
				String destino = request.getParameter("destino");
				BigDecimal valorDiaria = new BigDecimal(request.getParameter("valorDiaria"));
				Pacote pacote = new Pacote(0, destino, valorDiaria);

				if (pacoteDAO.adicionarPacote(pacote)) {
					response.getWriter().write(
							"<script>alert('Pacote adicionado com sucesso!'); window.location.href='destinos.jsp';</script>");
				} else {
					response.getWriter().write("<script>alert('Falha ao adicionar o pacote.');</script>");
				}
			} else if ("atualizar".equals(action)) {
				int idPacote = Integer.parseInt(request.getParameter("idPacote"));
				String destino = request.getParameter("destino");
				BigDecimal valorDiaria = new BigDecimal(request.getParameter("valorDiaria"));
				Pacote pacote = new Pacote(idPacote, destino, valorDiaria);

				if (pacoteDAO.atualizarPacote(pacote)) {
					response.getWriter().write("Pacote atualizado com sucesso!");
				} else {
					response.getWriter().write("Falha ao atualizar o pacote.");
				}
			} else if ("excluir".equals(action)) {
				int idPacote = Integer.parseInt(request.getParameter("idPacote"));

				if (pacoteDAO.excluirPacote(idPacote)) {
					response.getWriter().write("Pacote excluído com sucesso!");
				} else {
					response.getWriter().write("Falha ao excluir o pacote.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().write("Erro interno do servidor.");
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
