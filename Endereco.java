package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public Endereco() {
		
	}
	public Endereco(long id,String rua, int numero, String bairro, String cidade) {
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public long getId() {
		return id;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	
}
