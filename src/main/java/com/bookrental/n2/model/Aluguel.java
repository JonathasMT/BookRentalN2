package com.bookrental.n2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluguel implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dataAluguel;
	private String dataDevolucao;
	private double multaAtraso;
	private int status;
	
	private Livro livro;
	private Cliente cliente;
//	private CalcularAluguel calcularAluguel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public double getMultaAtraso() {
		return multaAtraso;
	}
	public void setMultaAtraso(double multaAtraso) {
		this.multaAtraso = multaAtraso;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
//	public CalcularAluguel getCalcularAluguel() {
//		return calcularAluguel;
//	}
//	public void setCalcularAluguel(CalcularAluguel calcularAluguel) {
//		this.calcularAluguel = calcularAluguel;
//	}
	public double valorTotalAluguel() {
		
		return 0;
	}
}
