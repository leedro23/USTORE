package br.com.ustore.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Candidato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long id;
    private String nome;
    private Cargo cargo;
    private Partido partido;
    private long numeroCandidatura;
    
    
    public Candidato (long id, String nome, Cargo cargo, Partido partido, long numeroCandidatura) {
    	this.id = id;
    	this.nome= nome;
    	this.cargo=cargo;
    	this.partido = partido;
    	this.numeroCandidatura = numeroCandidatura;
    }
    
    
    public Candidato() {}
    
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    


}
