package br.com.mariojp.estoque.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mariojp.estoque.Aplicacao;
import br.com.mariojp.estoque.model.Categoria;
import br.com.mariojp.estoque.model.Produto;

/**
 * Servlet implementation class ProdutoController
 */
@WebServlet("/produtos")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Aplicacao app = Aplicacao.getInstancia();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("lista",app.listarProduto());
		RequestDispatcher dispatcher = request.getRequestDispatcher("./produtos.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String qtd = request.getParameter("quantidade");
		String codigoCategoria = request.getParameter("categoria");
		
		Produto produto = new Produto();
		produto.setNome(nome);
		Categoria categoria = app.obterCategoriaPorCodigo(Integer.parseInt(codigoCategoria));
		produto.setQuantidade(qtd);
		produto.setCategoria(categoria);
		app.salvarProduto(produto);
		response.sendRedirect("./produtos");
	}


}
