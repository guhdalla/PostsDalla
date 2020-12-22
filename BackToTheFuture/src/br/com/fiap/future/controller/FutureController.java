package br.com.fiap.future.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import br.com.fiap.future.bean.Acontecimento;
import br.com.fiap.future.bean.Personagem;
import br.com.fiap.future.bo.AcontecimentoBO;
import br.com.fiap.future.bo.PersonagemBO;

/**
 * Servlet implementation class FutureController
 */
@WebServlet(urlPatterns = { "/home", "/personagem", "/language", "/dados" })
public class FutureController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FutureController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getRequestURI()) {
		//

		case "/BackToTheFuture/home":
			try {
				executeMetodos(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				response.sendRedirect("index.jsp");
			}
			break;

		case "/BackToTheFuture/personagem":
			try {
				consultarPersonagem(request, response, Integer.parseInt(request.getParameter("cdPersonagem")));
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				response.sendRedirect("personagem.jsp");
			}
			break;
		case "/BackToTheFuture/dados":
			try {
				executeMetodos(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				response.sendRedirect("dados.jsp");
			}
			break;
		default:
			response.sendRedirect("/BackToTheFuture/home?msgStaus=PASSOU DIRETO");
			break;
		}
	}

	public void executeMetodos(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		listarAconteciemnto(request, response);
		listarPersonagem(request, response);
	}

	public List<Acontecimento> listarAconteciemnto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

//		RECUPERANDO A SESSAO
		ServletContext listaAcontecimento = getServletContext();

		// Coloca um atributo no contexto

		// Instaciando a classe BO
		AcontecimentoBO aBO = new AcontecimentoBO();

		// Criando a lista para receber os dados do m�todo listagem
		List<Acontecimento> lista = aBO.listagemAcontecimentoBO();

		listaAcontecimento.setAttribute("listaAcontecimento", lista);
		// Verifica��o na lista.
		if (listaAcontecimento.getAttribute("listaAcontecimento") != null) {
			// Adicionando a lista em um atributo do request para que ela seja enviada para
			// a p�gina lista.jsp

			request.setAttribute("listaAcontecimento", listaAcontecimento.getAttribute("listaAcontecimento"));

			return (List<Acontecimento>) listaAcontecimento.getAttribute("listaAcontecimento");
		} else {
			return (List<Acontecimento>) listaAcontecimento.getAttribute("listaAcontecimento");
		}
	}

	public List<Personagem> listarPersonagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

//		RECUPERANDO A SESSAO
		ServletContext listaPersonagem = getServletContext();

		// Coloca um atributo no contexto

		// Instaciando a classe BO
		PersonagemBO pBO = new PersonagemBO();

		// Criando a lista para receber os dados do m�todo listagem
		List<Personagem> lista = pBO.listagemPersonagemBO();

		listaPersonagem.setAttribute("listaPersonagem", lista);
		// Verifica��o na lista.
		if (listaPersonagem.getAttribute("listaPersonagem") != null) {
			// Adicionando a lista em um atributo do request para que ela seja enviada para
			// a p�gina lista.jsp

			request.setAttribute("listaPersonagem", listaPersonagem.getAttribute("listaPersonagem"));

			return (List<Personagem>) listaPersonagem.getAttribute("listaPersonagem");
		} else {
			return (List<Personagem>) listaPersonagem.getAttribute("listaPersonagem");
		}
	}

	public Personagem consultarPersonagem(HttpServletRequest request, HttpServletResponse response, int cdPersonagem)
			throws ServletException, IOException, ClassNotFoundException {

//		RECUPERANDO A SESSAO
		ServletContext personagem = getServletContext();

		// Coloca um atributo no contexto

		// Instaciando a classe BO
		PersonagemBO pBO = new PersonagemBO();

		// Criando a lista para receber os dados do m�todo listagem

		personagem.setAttribute("personagem", pBO.selectPersonagemBO(cdPersonagem));
		// Verifica��o na lista.
		if (personagem.getAttribute("personagem") != null) {
			// Adicionando a lista em um atributo do request para que ela seja enviada para
			// a p�gina lista.jsp

			request.setAttribute("personagem", personagem.getAttribute("personagem"));

			return (Personagem) personagem.getAttribute("personagem");
		} else {
			response.sendRedirect("/BackToTheFuture/home");
			return (Personagem) personagem.getAttribute("personagem");
		}
	}
}
