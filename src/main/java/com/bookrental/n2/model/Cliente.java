package com.bookrental.n2.model;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String tipoCliente;
	
	public Cliente(int id, String nome, String cpf, String telefone, String tipoCliente) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.tipoCliente = tipoCliente;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}