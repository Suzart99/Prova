package br.com.mariojp.estoque;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.mariojp.estoque.model.Categoria;
import br.com.mariojp.estoque.model.Produto;

public class Aplicacao {
	
	
	private static final Aplicacao instancia= new Aplicacao();
	
	private Map<Integer,Categoria> categoria = new HashMap<>();
	private Integer sequenceCategoria = 0;
	private Map<Integer,Produto> produto = new HashMap<>();
	private Integer sequenceProduto = 0;

	
	private Aplicacao() {
	}
	
	
	public static Aplicacao getInstancia() {
		return instancia;
	}
	
	
	public void salvarCategoria(Categoria categoria) {
		sequenceCategoria++;
		categoria.setCodigo(sequenceCategoria);
		this.categoria.put(categoria.getCodigo(), categoria);
	}
	
	public Collection<Categoria> listarCategoria() {
		return this.categoria.values();
	}
	
	
	public Categoria obterCategoriaPorCodigo(Integer codigo) {
		return categoria.get(codigo);
	}

	public void salvarProduto(Produto produto) {
		sequenceProduto++;
		produto.setCodigo(sequenceProduto);
		this.produto.put(produto.getCodigo(), produto);
	}
	
	
	public Collection<Produto> listarProduto() {
		return this.produto.values();
	}
	
	
}