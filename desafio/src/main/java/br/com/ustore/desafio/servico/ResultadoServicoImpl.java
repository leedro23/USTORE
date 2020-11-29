package br.com.ustore.desafio.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ustore.desafio.modelo.Resultado;
import br.com.ustore.desafio.repositorio.RepositorioResultado;

public class ResultadoServicoImpl implements ResultadoServico {

	@Autowired
	RepositorioResultado repositorioResultado;

	@Override
	public Resultado buscarResultados(long id) {
		return repositorioResultado.findById(id);
	}

}
