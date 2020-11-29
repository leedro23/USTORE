package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity
public class Votacao {

	@Id
	private long id;
	private boolean votoBranco;
	private boolean votoNulo;
	private LocalDate dataHoraVoto;
	private Candidato cadidatoEscolhido;
	private long codigoVerificadorResultado;

	public Votacao() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Candidato getCadidatoEscolhido() {
		return cadidatoEscolhido;
	}

	public void setCadidatoEscolhido(Candidato cadidatoEscolhido) {
		this.cadidatoEscolhido = cadidatoEscolhido;
	}

	public long getCodigoVerificadorResultado() {
		return codigoVerificadorResultado;
	}

	public void setCodigoVerificadorResultado(long codigoVerificadorResultado) {
		this.codigoVerificadorResultado = codigoVerificadorResultado;
	}

}
