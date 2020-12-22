package br.com.fiap.future.controller;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class ControllerLingua
 */
@WebServlet("/change")
public class ControllerLingua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLingua() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Vari�vel que vai receber o par�metro do Locale
		String language = req.getParameter("lingua");
		
		//Objeto que armazena o Locale escolhido pelo usu�rio
		//Ex de locale: pt-br, en, en-US, de, ep, fr, etc;
		Locale locale = new Locale(language);
		
		//O CONFIG faz inicialmente a altera��o do LOCALE do Sistema
		Config.set(req.getSession(), Config.FMT_LOCALE, locale);
		//Agora faz a altera��o do locale do browser do usu�rio.
		Config.set(req.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
		
		//Realziando o redirecionamento do usu�rio para a p�gina que chamou.
		resp.sendRedirect("index.jsp?lingua="+locale);
	}

}