package br.com.ferragens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.ferragens.bean.Prateleira;
import br.com.ferragens.connection.ConnectionFactory;

public class PrateleiraDAO {
	
	public int insertPrateleira(int cdPrateleira) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "INSERT INTO t_fg_prateleira (cd_prateleira) VALUES (?)";

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
	
	public int removePrateleira(int cdPrateleira) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("DELETE FROM t_fg_prateleira WHERE cd_prateleira = '%s'", cdPrateleira);

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
	
	public Prateleira selectPrateleira(int cdPrateleira) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Prateleira prateleira = null;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("SELECT * FROM t_fg_prateleira WHERE cd_prateleira = '%s'", cdPrateleira);

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				prateleira = new Prateleira();
				// Populando o objeto.
				prateleira.setCdPrateleira(Integer.parseInt(rs.getNString("cd_prateleira")));
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
		return prateleira;
	}
	
	public List<Prateleira> selectListaPrateleira() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Prateleira> lista = null;
		Prateleira prateleira = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_fg_prateleira";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);
			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Prateleira>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				prateleira = new Prateleira();
				// Populando o objeto.
				prateleira.setCdPrateleira(Integer.parseInt(rs.getNString("cd_prateleira")));

				// Adicionando na lista.
				lista.add(prateleira);
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
	
	public int updatePrateleira(int cdPrateleira, int cdPrateleiraNovo) throws ClassNotFoundException {
		int status = 0;
		try {
			Connection conn = new ConnectionFactory().getConnection();

			Statement stmt = conn.createStatement();

			String sql = String.format(
					"UPDATE t_fg_prateleira SET cd_prateleira = %s WHERE cd_prateleira = %s",
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
}
