package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Id;

@Entity
public class Resultado {

	@Id
	private long codigoVerificador;
	private List<Votacao> listaVotacao;
	private LocalDate dataHoraFechamento;
	private long totalVotosBrancos;
	private long totalVotosNulos;
	private long totalVotosApurados;
	private long totalVotosNominais;

	public Resultado(long codigoVerificador, List<Votacao> listaVotacao, LocalDate dataHoraFechamento,
			long totalVotosBrancos, long totalVotosNulos, long totalVotosApurados, long totalVotosNominais) {
		this.codigoVerificador = codigoVerificador;
		this.listaVotacao = listaVotacao;
		this.dataHoraFechamento = dataHoraFechamento;
		this.totalVotosBrancos = totalVotosBrancos;
		this.totalVotosNulos = totalVotosNulos;
		this.totalVotosApurados = totalVotosApurados;
		this.totalVotosNominais = totalVotosNominais;
	}

	public Resultado() {
	}

	public long getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(long codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public List<Votacao> getListaVotacao() {
		return listaVotacao;
	}

	public void setListaVotacao(List<Votacao> listaVotacao) {
		this.listaVotacao = listaVotacao;
	}

	public LocalDate getDataHoraFechamento() {
		return dataHoraFechamento;
	}

	public void setDataHoraFechamento(LocalDate dataHoraFechamento) {
		this.dataHoraFechamento = dataHoraFechamento;
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

	public long getTotalVotosApurados() {
		return totalVotosApurados;
	}

	public void setTotalVotosApurados(long totalVotosApurados) {
		this.totalVotosApurados = totalVotosApurados;
	}

	public long getTotalVotosNominais() {
		return totalVotosNominais;
	}

	public void setTotalVotosNominais(long totalVotosNominais) {
		this.totalVotosNominais = totalVotosNominais;
	}

}
