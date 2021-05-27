package com.bookrental.n2.model;

import com.bookrental.n2.generic.CalcularAluguel;

public class Aluguel {
	private Livro livro;
	private Cliente cliente;
	private CalcularAluguel calcularAluguel;
	
	public Aluguel(Livro livro, Cliente cliente, CalcularAluguel calcularAluguel) {
		this.livro = livro;
		this.cliente = cliente;
		this.calcularAluguel = calcularAluguel;
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CalcularAluguel getCalcularAluguel() {
		return calcularAluguel;
	}
	public void setCalcularAluguel(CalcularAluguel calcularAluguel) {
		this.calcularAluguel = calcularAluguel;
	}
	
	public double valorTotalAluguel() {
		
		return 0;
	}
}
