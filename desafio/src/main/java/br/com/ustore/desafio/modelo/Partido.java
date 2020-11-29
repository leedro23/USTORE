package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partido {

	@Id
	private long id;
	private String nome;

	public Partido(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Partido() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
