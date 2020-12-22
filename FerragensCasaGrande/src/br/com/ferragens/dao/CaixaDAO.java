package br.com.ferragens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.ferragens.bean.Caixa;
import br.com.ferragens.connection.ConnectionFactory;

public class CaixaDAO {
	
	public int insertCaixa(int cdLinha, String nmCaixa) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "INSERT INTO t_fg_caixa (cd_caixa, cd_linha, nm_caixa) VALUES (sqcCaixa.nextval, ?, ?)";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			ps.setInt(1, cdLinha);
			ps.setString(2, nmCaixa);
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
	
	public List<Caixa> selectListaCaixa() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Caixa> lista = null;
		Caixa caixa = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_fg_caixa";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);
			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Caixa>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				caixa = new Caixa();
				// Populando o objeto.
				
				caixa.setCdCaixa(Integer.parseInt(rs.getNString("cd_caixa")));
				caixa.setCdLinha(Integer.parseInt(rs.getNString("cd_linha")));
				caixa.setNmCaixa(rs.getNString("nm_caixa"));

				// Adicionando na lista.
				lista.add(caixa);
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
	
	public int removeCaixa(int cdCaixa) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		int status = 0;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("DELETE FROM t_fg_caixa WHERE cd_caixa = '%s'", cdCaixa);

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
	
	public int updateCaixa(int cdCaixa, int cdLinha, String nmCaixa) throws ClassNotFoundException {
		int status = 0;
		try {
			Connection conn = new ConnectionFactory().getConnection();

			Statement stmt = conn.createStatement();

			String sql = String.format(
					"UPDATE t_fg_caixa SET cd_linha = %s, nm_caixa = '%s' WHERE cd_caixa = %s",
					cdLinha, nmCaixa, cdCaixa);

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
