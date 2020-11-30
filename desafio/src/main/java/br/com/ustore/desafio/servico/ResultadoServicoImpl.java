package br.com.ustore.desafio.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ustore.desafio.modelo.Resultado;
import br.com.ustore.desafio.repositorio.RepositorioResultado;

@Service
public class ResultadoServicoImpl implements ResultadoServico {

	@Autowired
	RepositorioResultado repositorioResultado;

	@Override
	public Resultado buscarResultado(long id) {
		return repositorioResultado.findById(id).orElseThrow(RuntimeException::new);
	}

}
