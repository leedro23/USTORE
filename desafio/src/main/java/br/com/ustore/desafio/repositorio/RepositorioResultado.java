package br.com.ustore.desafio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ustore.desafio.modelo.Resultado;

public interface RepositorioResultado extends JpaRepository<Resultado, Long> {
 
	Resultado findById(long id);
	
	
}
