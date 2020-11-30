package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resultado {

	@Id
	private long codigoVerificador;
	@ManyToOne( fetch = FetchType.LAZY)
	private ContagemVotosPorCandidato contagemVotos;
	private long totalVotosBrancos;
	private long totalVotosNulos;
	private long totalVotosNominais;

	private Resultado() {
	}

	public long getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(long codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public ContagemVotosPorCandidato getContagemVotos() {
		return contagemVotos;
	}

	public void setContagemVotos(ContagemVotosPorCandidato contagemVotos) {
		this.contagemVotos = contagemVotos;
	}

	public long getTotalVotosBrancos() {
		return totalVotosBrancos;
	}

	public void setTotalVotosBrancos(long totalVotosBrancos) {
		this.totalVotosBrancos = totalVotosBrancos;
	}

	public long getTotalVotosNulos() {
		return totalVotosNulos;
	}

	public void setTotalVotosNulos(long totalVotosNulos) {
		this.totalVotosNulos = totalVotosNulos;
	}

	public long getTotalVotosNominais() {
		return totalVotosNominais;
	}

	public void setTotalVotosNominais(long totalVotosNominais) {
		this.totalVotosNominais = totalVotosNominais;
	}

}
