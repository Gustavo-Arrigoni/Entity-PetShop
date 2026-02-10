package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private double tamanho;
	private String dataNasc;
	
	public Pet() {
		
	}
	public Pet(long id, String nome, double tamanho, String dataNasc) {
		this.id = id;
		this.nome = nome;
		this.tamanho = tamanho;
		this.dataNasc = dataNasc;
	}
}
