package br.com.fiap.future.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.future.bean.Acontecimento;
import br.com.fiap.future.connection.ConnectionFactory;

public class AcontecimentoDAO {
	
	public Acontecimento selectAcontecimento(int cdAcontecimento) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Acontecimento acontecimento = null;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("SELECT * FROM t_ng_acontecimento WHERE cd_acontecimento = '%s'", cdAcontecimento);

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				acontecimento = new Acontecimento();
				// Populando o objeto.
				acontecimento.setCdAcontecimento(Integer.parseInt(rs.getNString("cd_acontecimento")));
				acontecimento.setDtAno(Integer.parseInt(rs.getNString("dt_ano")));
				acontecimento.setDsAcontecimento(rs.getNString("ds_acontecimento"));
				acontecimento.setFtAcontecimento(rs.getNString("ft_acontecimento"));
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
		return acontecimento;
	}
	
	public List<Acontecimento> selectListaAcontecimento() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Acontecimento> lista = null;
		Acontecimento acontecimento = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_ng_acontecimento";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Acontecimento>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				acontecimento = new Acontecimento();
				// Populando o objeto.
				acontecimento.setCdAcontecimento(Integer.parseInt(rs.getNString("cd_acontecimento")));
				acontecimento.setDtAno(Integer.parseInt(rs.getNString("dt_ano")));
				acontecimento.setDsAcontecimento(rs.getNString("ds_acontecimento"));
				acontecimento.setFtAcontecimento(rs.getNString("ft_acontecimento"));

				// Adicionando na lista.
				lista.add(acontecimento);
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
	
}
