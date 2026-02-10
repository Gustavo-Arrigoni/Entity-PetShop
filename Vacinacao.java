package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vacinacao {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String codigo;
	private String validade;
	private String periodo;

	public Vacinacao() {

	}

	public Vacinacao(long id,String codigo, String localColocacao, String status) {
		this.id = id;
		this.codigo = codigo;
		this.validade = validade;
		this.periodo = periodo;
	
	}
}
