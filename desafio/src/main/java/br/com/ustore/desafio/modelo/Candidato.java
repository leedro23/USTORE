package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Candidato  {

	@Id
	private long idCandidato;
	private String nomeCandidato;
	@OneToOne
	private Cargo cargo;
	@OneToOne
	private Partido partido;
	private long numeroCandidatura;

	public Candidato() {
	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setId(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNome(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public long getNumeroCandidatura() {
		return numeroCandidatura;
	}

	public void setNumeroCandidatura(long numeroCandidatura) {
		this.numeroCandidatura = numeroCandidatura;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

}
