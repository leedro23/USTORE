package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partido {

	@Id
	private long idPartido;
	private String nomePartido;

	public Partido() {
	}

	public long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(long idPartido) {
		this.idPartido = idPartido;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

}
