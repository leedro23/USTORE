package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cargo {

	@Id
	private long idCargo;
	private String nomeCargo;

	public Cargo() {
	}

	public long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

}
