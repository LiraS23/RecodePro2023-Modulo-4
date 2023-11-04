package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {
    private Connection conexao;

    public ClienteDAO(Connection conexao) {
        this.conexao = conexao;
    }

    // Método para adicionar um novo cliente
    public boolean adicionarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, dataNasc, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getCpf());
            pstmt.setString(2, cliente.getNome());
            pstmt.setDate(3, new java.sql.Date(cliente.getDataNasc().getTime()));
            pstmt.setString(4, cliente.getEmail());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para listar todos os clientes
    public List<Cliente> listarClientes() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<>();
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDataNasc(rs.getDate("dataNasc"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    // Método para atualizar os dados de um cliente
    public boolean atualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, dataNasc = ?, email = ? WHERE cpf = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setDate(2, new java.sql.Date(cliente.getDataNasc().getTime()));
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getCpf());
            int linhasAfetadas = pstmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para excluir um cliente pelo CPF
    public boolean excluirCliente(String cpf) {
        String sql = "DELETE FROM cliente WHERE cpf = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, cpf);
            int linhasAfetadas = pstmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
