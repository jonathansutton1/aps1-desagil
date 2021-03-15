package br.edu.insper.desagil.aps1;

public class Produto {
	private String codigo;
	private String nome;
	private int preco;
	
	public Produto(String codigo, String nome, int preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;			
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

}
