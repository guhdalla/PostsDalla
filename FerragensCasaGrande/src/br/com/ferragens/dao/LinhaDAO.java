package br.com.ferragens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.ferragens.bean.Linha;
import br.com.ferragens.connection.ConnectionFactory;

public class LinhaDAO {

	public int insertLinha(int cdPrateleira) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "INSERT INTO t_fg_linha (cd_linha, cd_prateleira) VALUES (sqclinha.nextval, ?)";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			ps.setInt(1, cdPrateleira);
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
	
	public List<Linha> selectListaLinha() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Linha> lista = null;
		Linha linha = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_fg_linha";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Linha>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				linha = new Linha();
				// Populando o objeto.
				linha.setCdLinha(Integer.parseInt(rs.getNString("cd_linha")));
				linha.setCdPrateleira(Integer.parseInt(rs.getNString("cd_prateleira")));

				// Adicionando na lista.
				lista.add(linha);
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
	
	public int removeTodasLinhas(int cdPrateleira) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("DELETE FROM t_fg_linha WHERE cd_prateleira = '%s'", cdPrateleira);

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
	
	public int updateLinha(int cdPrateleira, int cdPrateleiraNovo) throws ClassNotFoundException {
		int status = 0;
		try {
			Connection conn = new ConnectionFactory().getConnection();

			Statement stmt = conn.createStatement();

			String sql = String.format(
					"UPDATE t_fg_linha SET cd_prateleira = %s WHERE cd_prateleira = %s",
					cdPrateleiraNovo, cdPrateleira);

			status = stmt.executeUpdate(sql);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return status;
	}
	
	public int removeLinha(int cdLinha) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("DELETE FROM t_fg_linha WHERE cd_linha = '%s'", cdLinha);

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
