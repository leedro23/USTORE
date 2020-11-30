package br.com.ustore.desafio.modelo;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Votacao {

	@Id
	private long idVotacao;
	private boolean votoBranco;
	private boolean votoNulo;
	private LocalDate dataHoraVoto;
	@ManyToMany
	private Set<Candidato> opcoesCandidatos;
	private long candidatoEscolhido;
	private long codigoVerificadorResultado;

	public Votacao() {
	}

	public long getIdVotacao() {
		return idVotacao;
	}

	public void setIdVotacao(long idVotacao) {
		this.idVotacao = idVotacao;
	}

	public boolean isVotoBranco() {
		return votoBranco;
	}

	public void setVotoBranco(boolean votoBranco) {
		this.votoBranco = votoBranco;
	}

	public boolean isVotoNulo() {
		return votoNulo;
	}

	public void setVotoNulo(boolean votoNulo) {
		this.votoNulo = votoNulo;
	}

	public LocalDate getDataHoraVoto() {
		return dataHoraVoto;
	}

	public void setDataHoraVoto(LocalDate dataHoraVoto) {
		this.dataHoraVoto = dataHoraVoto;
	}

	public Candidato getOpcoesCandidatos() {
		return (Candidato) opcoesCandidatos;
	}

	public void setOpcoesCandidatos(Candidato opcoesCandidatos) {
		this.opcoesCandidatos = (Set<Candidato>) opcoesCandidatos;
	}

	public long getCandidatoEscolhido() {
		return candidatoEscolhido;
	}

	public void setCandidatoEscolhido(long candidatoEscolhido) {
		this.candidatoEscolhido = candidatoEscolhido;
	}

	public long getCodigoVerificadorResultado() {
		return codigoVerificadorResultado;
	}

	public void setCodigoVerificadorResultado(long codigoVerificadorResultado) {
		this.codigoVerificadorResultado = codigoVerificadorResultado;
	}

}
