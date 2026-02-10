package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tutor {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String dataNasc;
	
	public Tutor() {
		
	}
	public Tutor(long id,String nome, String dataNasc) {
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	
}
