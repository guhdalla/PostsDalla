package br.com.ferragens.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ferragens.bean.Caixa;
import br.com.ferragens.bean.Linha;
import br.com.ferragens.bean.Prateleira;
import br.com.ferragens.bean.Produto;
import br.com.ferragens.bo.CaixaBO;
import br.com.ferragens.bo.LinhaBO;
import br.com.ferragens.bo.PrateleiraBO;
import br.com.ferragens.bo.ProdutoBO;

@WebServlet(urlPatterns = { "/consultarProduto", "/home", "/criarPrateleira", "/removerPrateleira", "/editarPrateleira",
		"/addLinha", "/removeLinha", "/criarCaixa", "/removeCaixa", "/atualizarCaixa", "/addProduto", "/alterarProduto",
		"/excluirProduto", "/aviso", "/excluirAviso" })
public class FerragensController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FerragensController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getRequestURI()) {

		case "/FerragensCasaGrande/home":
			try {
				executeMetodos(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				response.sendRedirect("index.jsp");
			}
			break;

		case "/FerragensCasaGrande/criarPrateleira":
			try {
				criarPrateleira(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/removerPrateleira":
			try {
				removerPrateleira(request, response, Integer.parseInt(request.getParameter("cdPrateleira")));
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/editarPrateleira":
			try {
				editarPrateleira(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/addLinha":
			try {
				addLinha(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/removeLinha":
			try {
				removeLinha(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/criarCaixa":
			try {
				criarCaixa(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/removeCaixa":
			try {
				removeCaixa(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/atualizarCaixa":
			try {
				atualizarCaixa(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/addProduto":
			try {
				criarProduto(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/alterarProduto":
			try {
				alterarProduto(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/excluirProduto":
			try {
				excluirProduto(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FerragensCasaGrande/consultarProduto":
			try {
				consultarProduto(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "/FerragensCasaGrande/aviso":
			try {
				param(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				response.sendRedirect("/FerragensCasaGrande/home");
			}
			break;
			
		case "/FerragensCasaGrande/excluirAviso":
			try {
				excluirParam(request, response);
			} catch (ClassNotFoundException | ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				response.sendRedirect("/FerragensCasaGrande/home");
			}
			break;

		default:
			response.sendRedirect("/FerragensCasaGrande/home?msgStaus=PASSOU DIRETO");
			break;
		}
	}

	public void executeMetodos(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {
		listarPrateleira(request, response);

	}

	public String param(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {
		
		ServletContext aviso = getServletContext();
		
		String param = request.getParameter("aviso");
		
		aviso.setAttribute("paramAviso", param);
		
		return (String) aviso.getAttribute("paramAviso");
		
	}
	
	public String excluirParam(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {
		
		ServletContext aviso = getServletContext();
		
		String param = null;
		
		aviso.setAttribute("paramAviso", param);
		
		return (String) aviso.getAttribute("paramAviso");
	}

	public void criarPrateleira(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Prateleira prateleira = new Prateleira();

		prateleira.setCdPrateleira(Integer.parseInt(request.getParameter("cd_prateleira")));
		int qntLinha = Integer.parseInt(request.getParameter("linha_prateleira"));

		PrateleiraBO pBO = new PrateleiraBO();
		LinhaBO lBO = new LinhaBO();

		Prateleira pExiste = pBO.selectPrateleiraBO(prateleira.getCdPrateleira());

		if (pExiste == null) {
			int p = pBO.insertPrateleiraBO(prateleira.getCdPrateleira());

			for (int i = 0; i < qntLinha; i++) {
				lBO.insertLinhaBO(prateleira.getCdPrateleira());
			}

			if (p != 0) {
				response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Prateleira criada.");
			} else {
				response.sendRedirect("/FerragensCasaGrande/home");
			}
		} else {
			System.out.println("Prateleira ja Existe!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Prateleira ja existe.");
		}

	}

	public List<Prateleira> listarPrateleira(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

		ServletContext listaPrateleira = getServletContext();

		PrateleiraBO pBO = new PrateleiraBO();

		List<Prateleira> lista = pBO.listPrateleiraBO();

		listaPrateleira.setAttribute("listaPrateleira", lista);
		listarLinha(request, response);
		return (List<Prateleira>) listaPrateleira.getAttribute("listaPrateleira");

	}

	public List<Linha> listarLinha(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

		ServletContext listaLinha = getServletContext();

		LinhaBO lBO = new LinhaBO();

		List<Linha> lista = lBO.listaLinhaBO();

		listaLinha.setAttribute("listaLinha", lista);
		listarCaixa(request, response);
		return (List<Linha>) listaLinha.getAttribute("listaLinha");
	}

	public void removerPrateleira(HttpServletRequest request, HttpServletResponse response, int cdPrateleira)
			throws ClassNotFoundException, ServletException, IOException {

		PrateleiraBO pBO = new PrateleiraBO();
		LinhaBO lBO = new LinhaBO();

		int statusLinha = lBO.removeTodasLinhaBO(cdPrateleira);

		if (statusLinha != 0) {
			int status = pBO.removePrateleiraBO(cdPrateleira);
			if (status != 0) {
				response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Prateleira removida.");
			} else {
				System.out.println("Erro ao Remover Prateleira!");
				response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover prateleira. Antes de chamar o gustavo, tente novamente.");
			}
		} else {
			System.out.println("Erro ao Remover todas as linhas da prateleira!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover todas as linhas da prateleira. Antes de chamar o gustavo, tente novamente.");
		}

	}

	public void editarPrateleira(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Prateleira p = new Prateleira();

		p.setCdPrateleira(Integer.parseInt(request.getParameter("cd_prateleira")));

		int pNovo = Integer.parseInt(request.getParameter("cd_prateleira_novo"));

		System.out.println(pNovo);

		PrateleiraBO pBO = new PrateleiraBO();
		LinhaBO lBO = new LinhaBO();

		int novaP = pBO.insertPrateleiraBO(pNovo);

		if (novaP != 0) {

			int statusLinha = lBO.updateLinhaBO(p.getCdPrateleira(), pNovo);

			if (statusLinha != 0) {

				int statusRemove = pBO.removePrateleiraBO(p.getCdPrateleira());

				if (statusRemove != 0) {

					response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Prateleira alterada.");

				} else {
					System.out.println("Erro ao Remover Prateleira Antiga!");
					response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover prateleira antiga. Antes de chamar o gustavo, tente novamente.");
				}

			} else {
				System.out.println("Erro ao Editar as Linhas da Prateleira!");
				response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao editar as linhas da prateleira. Antes de chamar o gustavo, tente novamente.");
			}

		} else {
			System.out.println("Erro ao Criar nova Prateleira!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro transferir prateleira. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public void addLinha(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Prateleira prateleira = new Prateleira();

		prateleira.setCdPrateleira(Integer.parseInt(request.getParameter("cdPrateleira")));

		LinhaBO lBO = new LinhaBO();

		int status = lBO.insertLinhaBO(prateleira.getCdPrateleira());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Linha adicionada.");
		} else {
			System.out.println("Erro ao Adicionar Linha!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao adicionar linha. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public void removeLinha(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Linha linha = new Linha();

		linha.setCdLinha(Integer.parseInt(request.getParameter("cdLinha")));

		LinhaBO lBO = new LinhaBO();

		int status = lBO.removeLinhaBO(linha.getCdLinha());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Linha removida.");
		} else {
			System.out.println("Erro ao Remover Linha!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover linha. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public void criarCaixa(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Caixa caixa = new Caixa();

		caixa.setNmCaixa(request.getParameter("nome_caixa"));
		caixa.setCdLinha(Integer.parseInt(request.getParameter("cd_linha")));
		;

		CaixaBO cBO = new CaixaBO();

		int status = cBO.insertCaixaBO(caixa.getCdLinha(), caixa.getNmCaixa());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Caixa criado.");
		} else {
			System.out.println("Erro ao Criar Caixa!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao criar caixa. Antes de chamar o gustavo, tente novamente.");
		}

	}

	public List<Caixa> listarCaixa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

		ServletContext listaCaixa = getServletContext();

		CaixaBO cBO = new CaixaBO();

		List<Caixa> lista = cBO.listaCaixaBO();

		listaCaixa.setAttribute("listaCaixa", lista);
		listarProduto(request, response);
		return (List<Caixa>) listaCaixa.getAttribute("listaCaixa");
	}

	public void removeCaixa(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Caixa caixa = new Caixa();

		caixa.setCdCaixa(Integer.parseInt(request.getParameter("cdCaixa")));

		CaixaBO lBO = new CaixaBO();

		int status = lBO.removeCaixaBO(caixa.getCdCaixa());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Caixa removida.");
		} else {
			System.out.println("Erro ao Remover Caixa!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover caixa. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public void atualizarCaixa(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Caixa caixa = new Caixa();

		caixa.setCdCaixa(Integer.parseInt(request.getParameter("cd_caixa")));

		caixa.setCdLinha(Integer.parseInt(request.getParameter("cd_linha")));

		caixa.setNmCaixa(request.getParameter("nome_caixa"));

		CaixaBO lBO = new CaixaBO();

		int status = lBO.updateCaixaBO(caixa.getCdCaixa(), caixa.getCdLinha(), caixa.getNmCaixa());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Caixa alterado.");
		} else {
			System.out.println("Erro ao Atualizar Caixa!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao atualizar caixa. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public List<Produto> listarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

		ServletContext listaProduto = getServletContext();

		ProdutoBO pBO = new ProdutoBO();

		List<Produto> lista = pBO.listaProdutoBO();

		listaProduto.setAttribute("listaProduto", lista);

		return (List<Produto>) listaProduto.getAttribute("listaProduto");
	}

	public void criarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Produto p = new Produto();

		p.setCdCaixa(Integer.parseInt(request.getParameter("cdCaixa")));
		p.setNmProduto(request.getParameter("nome_produto"));
		p.setQntProduto(Integer.parseInt(request.getParameter("qnt_produto")));

		ProdutoBO pBO = new ProdutoBO();

		int status = pBO.insertProdutoBO(p.getCdCaixa(), p.getNmProduto(), p.getQntProduto());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Produto criado.");
		} else {
			System.out.println("Erro ao Criar Produto!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao criar produto. Antes de chamar o gustavo, tente novamente.");
		}

	}

	public void alterarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Produto p = new Produto();

		p.setCdProduto(Integer.parseInt(request.getParameter("cdProduto")));
		p.setNmProduto(request.getParameter("nome_produto"));
		p.setQntProduto(Integer.parseInt(request.getParameter("qnt_produto")));

		ProdutoBO pBO = new ProdutoBO();

		int status = pBO.updateProdutoBO(p.getCdProduto(), p.getNmProduto(), p.getQntProduto());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Produto alterado.");
		} else {
			System.out.println("Erro ao Atualizar Produto!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao atualizar produto. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public void excluirProduto(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, ServletException, IOException {

		Produto p = new Produto();

		p.setCdProduto(Integer.parseInt(request.getParameter("cdProduto")));

		ProdutoBO pBO = new ProdutoBO();

		int status = pBO.removeProdutoBO(p.getCdProduto());

		if (status != 0) {
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Produto removido.");
		} else {
			System.out.println("Erro ao Remover Caixa!");
			response.sendRedirect("/FerragensCasaGrande/aviso?aviso=Erro ao remover caixa. Antes de chamar o gustavo, tente novamente.");
		}
	}

	public List<Produto> consultarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException {

		ServletContext listaProduto = getServletContext();

		ProdutoBO pBO = new ProdutoBO();

		List<Produto> lista = pBO.listaProdutoBO();

		listaProduto.setAttribute("listaProduto", lista);

		return (List<Produto>) listaProduto.getAttribute("listaProduto");
	}
}
