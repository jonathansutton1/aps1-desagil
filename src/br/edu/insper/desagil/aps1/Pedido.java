package br.edu.insper.desagil.aps1;

public class Pedido {
	private int quantidade;
	private Produto produto;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		quantidade = 1;
	}
	
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int incrementaQuantidade() {
		return ++quantidade;
	}
	
	public int devolveTotal() {
		return quantidade*produto.getPreco();
	}

}
