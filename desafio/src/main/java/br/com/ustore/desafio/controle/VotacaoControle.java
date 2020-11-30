package br.com.ustore.desafio.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.ustore.desafio.modelo.Resultado;
import br.com.ustore.desafio.modelo.Votacao;
import br.com.ustore.desafio.servico.ResultadoServico;
import br.com.ustore.desafio.servico.VotacaoServico;

@RestController
@RequestMapping("/votacao")
public class VotacaoControle {

	@Autowired
	private VotacaoServico votacaoServico;

	@Autowired
	private ResultadoServico votacaoResultado;

	@PostMapping("/votar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void votar(@RequestBody Votacao votacao) {
		votacaoServico.votar(votacao);
	}

	@GetMapping("/resultado/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Resultado resultadoVotacao(@PathVariable long id) {
		return votacaoResultado.buscarResultado(id);
	}

}
