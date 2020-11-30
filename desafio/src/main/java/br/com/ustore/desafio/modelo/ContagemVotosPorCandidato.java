package br.com.ustore.desafio.modelo;

import javax.persistence.*;

@Entity
public class ContagemVotosPorCandidato {
	
	@Id
	private long idContagemVotosPorCandidatos;
	private long totalVotos;
	@OneToOne
	private Candidato candidato;
	public ContagemVotosPorCandidato() {}
	
	public long getIdContagemVotosPorCandidatos() {
		return idContagemVotosPorCandidatos;
	}
	public void setIdContagemVotosPorCandidatos(long idContagemVotosPorCandidatos) {
		this.idContagemVotosPorCandidatos = idContagemVotosPorCandidatos;
	}
	public long getTotalVotos() {
		return totalVotos;
	}
	public void setTotalVotos(long totalVotos) {
		this.totalVotos = totalVotos;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

}
