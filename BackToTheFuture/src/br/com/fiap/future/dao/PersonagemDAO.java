package br.com.fiap.future.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.future.bean.Personagem;
import br.com.fiap.future.connection.ConnectionFactory;

public class PersonagemDAO {
	
	public Personagem selectPersonagem(int cdPersonagem) throws ClassNotFoundException {
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Personagem personagem = null;

		try {

			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = String.format("SELECT * FROM t_ng_personagem WHERE cd_personagem = '%s'", cdPersonagem);

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				personagem = new Personagem();
				// Populando o objeto.
				personagem.setCdPersonagem(Integer.parseInt(rs.getNString("cd_personagem")));
				personagem.setDtNasc(rs.getDate("dt_nasc"));
				personagem.setDsPersonagem(rs.getNString("ds_personagem"));
				personagem.setNmPersonagem(rs.getNString("nm_personagem"));
				personagem.setFtPersonagem(rs.getNString("ft_personagem"));
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
		return personagem;
	}
	
	public List<Personagem> selectListaPersonagem() throws ClassNotFoundException {

		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Personagem> lista = null;
		Personagem personagem = null;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			// CRIANDO A INSTRU��O SQL = SELECT ALL
			sql = "SELECT * FROM t_ng_personagem";

			// Criando a conex�o.
			ps = conn.prepareStatement(sql);

			// Criando o ResultSet que armazena o resultado da consulta.
			rs = ps.executeQuery();

			// Construindo a lista
			lista = new ArrayList<Personagem>();

			// Criando uma estrutura para percorrer o ResultSet e armazenar seu resultado em
			// uma lista
			while (rs.next()) {
				// A cada nova itera��o do while ser� criado um novo objeto Cliente
				personagem = new Personagem();
				// Populando o objeto.
				personagem.setCdPersonagem(Integer.parseInt(rs.getNString("cd_personagem")));
				personagem.setDtNasc(rs.getDate("dt_nasc"));
				personagem.setDsPersonagem(rs.getNString("ds_personagem"));
				personagem.setNmPersonagem(rs.getNString("nm_personagem"));
				personagem.setFtPersonagem(rs.getNString("ft_personagem"));

				// Adicionando na lista.
				lista.add(personagem);
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
