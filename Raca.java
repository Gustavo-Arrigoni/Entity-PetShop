package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Raca {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String origem;
	
	public Raca() {
		
	}
	public Raca(long id,String nome, String origem) {
		this.id = id;
		this.nome = nome;
		this.origem = origem;
	}
}
