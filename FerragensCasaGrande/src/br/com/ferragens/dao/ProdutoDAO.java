package br.com.ferragens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.ferragens.bean.Produto;
import br.com.ferragens.connection.ConnectionFactory;

public class ProdutoDAO {

	public List<Produto> selectListaProduto() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Produto> lista = null;
		Produto produto = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_fg_produto";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);
			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Produto>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				produto = new Produto();
				// Populando o objeto.
				
				produto.setCdCaixa(Integer.parseInt(rs.getNString("cd_caixa")));
				produto.setCdProduto(Integer.parseInt(rs.getNString("cd_produto")));
				produto.setNmProduto(rs.getNString("nm_produto"));
				produto.setQntProduto(Integer.parseInt(rs.getNString("qnt_produto")));

				// Adicionando na lista.
				lista.add(produto);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	public int insertProduto(int cdCaixa, String nmProduto, int qntProduto) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "INSERT INTO t_fg_produto (cd_produto, cd_caixa, nm_produto, qnt_produto) VALUES (sqcProduto.nextval, ?, ?, ?)";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			ps.setInt(1, cdCaixa);
			ps.setString(2, nmProduto);
			ps.setInt(3, qntProduto);
			// Criando o ResultSet que armazena o resultado da consulta.
			status = ps.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			try {
				ps.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return status;
	}
	
	public int updateProduto(int cdProduto, String nmProduto, int qntProduto) throws ClassNotFoundException {
		int status = 0;
		try {
			Connection conn = new ConnectionFactory().getConnection();

			Statement stmt = conn.createStatement();

			String sql = String.format(
					"UPDATE t_fg_produto caixa SET nm_produto = '%s', qnt_produto = %s WHERE cd_produto = %s",
					nmProduto, qntProduto, cdProduto);

			status = stmt.executeUpdate(sql);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return status;
	}
	
	public int removeProduto(int cdProduto) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("DELETE FROM t_fg_produto WHERE cd_produto = '%s'", cdProduto);

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			status = ps.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			try {
				ps.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return status;
	}
}
