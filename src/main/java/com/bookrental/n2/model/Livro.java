package com.bookrental.n2.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Livro {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idLivro;
	private String titulo;
	private String autor;
	private String editora;
	private String codigoDeBarras;
	private String quantidade;
	private String preco;
	
	public Livro(int idLivro, String titulo, String autor, String editora, String codigoDeBarras, String quantidade,
			String preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.codigoDeBarras = codigoDeBarras;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	

}
