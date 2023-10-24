package br.com.carro_crud.carro;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	public Carro(String marca, String modelo, int ano, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}

	public Carro() {
	}

	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	
    public String getMarca() {
		return this.marca;
	}

	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getModelo() {
		return modelo;
	}

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public int getAno() {
		return ano;
	}

	
	public void setAno(int ano) {
		this.ano = ano;
	}

	// 
	public String getPlaca() {
		return this.placa;
	}

	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
