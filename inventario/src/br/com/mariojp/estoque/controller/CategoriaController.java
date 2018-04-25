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

/**
 * Servlet implementation class CategoriaController
 */
@WebServlet("/categorias")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	private Aplicacao app = Aplicacao.getInstancia();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoriaController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("lista",app.listarCategoria());
		RequestDispatcher dispatcher = request.getRequestDispatcher("./categorias.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String descricao = request.getParameter("descricao");
			Categoria categoria = new Categoria();
			categoria.setDescricao(descricao);
			app.salvarCategoria(categoria);
			response.sendRedirect("./categorias");
	}

}
