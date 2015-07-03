package org.abelnightroad.model;

import java.math.BigDecimal;
import java.util.List;

import org.abelnightroad.persistence.EntidadeBase;

public class Livro extends EntidadeBase<Integer>{
	private String titulo;
	private List<Autor> autores;
	private String isbn;
	private String edicao;
	private String anoLancamento;
	private BigDecimal preco;
	
	public Livro() {}

	public Livro(String titulo, List<Autor> autores, String isbn,
			String edicao, String anoLancamento, BigDecimal preco) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.isbn = isbn;
		this.edicao = edicao;
		this.anoLancamento = anoLancamento;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
