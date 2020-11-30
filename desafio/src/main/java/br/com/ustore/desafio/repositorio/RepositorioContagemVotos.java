package br.com.ustore.desafio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ustore.desafio.modelo.ContagemVotosPorCandidato;

public interface RepositorioContagemVotos extends JpaRepository<ContagemVotosPorCandidato, Long>{
	
	ContagemVotosPorCandidato findById(long idContagemVotosPorCandidatos);

}
