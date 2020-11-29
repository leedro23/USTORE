package br.com.ustore.desafio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ustore.desafio.modelo.Votacao;

public interface RepositorioVotacao extends JpaRepository<Votacao, Long> {
	

}
