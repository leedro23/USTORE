package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Votacao {

	@Id
	private long idVotacao;
	private boolean votoBranco;
	private boolean votoNulo;
	private LocalDate dataHoraVoto;
	private List<Candidato> opcoesCandidatos;
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

	public List<Candidato> getOpcoesCandidatos() {
		return opcoesCandidatos;
	}

	public void setOpcoesCandidatos(List<Candidato> opcoesCandidatos) {
		this.opcoesCandidatos = opcoesCandidatos;
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
