package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tipo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String descricao;
	
	public Tipo() {
		
	}
	public Tipo(long id,String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
