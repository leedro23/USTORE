package br.com.ustore.desafio.servico;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ustore.desafio.modelo.ContagemVotosPorCandidato;
import br.com.ustore.desafio.modelo.Resultado;
import br.com.ustore.desafio.modelo.Votacao;
import br.com.ustore.desafio.repositorio.RepositorioContagemVotos;
import br.com.ustore.desafio.repositorio.RepositorioResultado;
import br.com.ustore.desafio.repositorio.RepositorioVotacao;

@Service
public class VotacaoServicoImpl implements VotacaoServico {

	@Autowired
	public RepositorioResultado repositorioResultado;

	@Autowired
	public RepositorioVotacao repositorioVotacao;

	@Autowired
	public RepositorioContagemVotos repositorioContagemVotos;

	@Override
	public void votar(Votacao voto) {
		
		if (voto != null && voto.isVotoBranco()) {
			long maiorNumeroVotos = 0L;
			long idCandidatoMaiorNumeroVotos = 0L;
			List<ContagemVotosPorCandidato> listaVotos = repositorioContagemVotos.findAll();
			Collections.sort(listaVotos, Comparator.comparing(ContagemVotosPorCandidato::getTotalVotos));

			for (ContagemVotosPorCandidato contVotos : listaVotos) {
				if (contVotos.getTotalVotos() > maiorNumeroVotos) {
					maiorNumeroVotos = contVotos.getTotalVotos();
					idCandidatoMaiorNumeroVotos = contVotos.getCandidato().getIdCandidato();
				}
			}

			for (ContagemVotosPorCandidato contVotos : listaVotos) {
				if (idCandidatoMaiorNumeroVotos == contVotos.getCandidato().getIdCandidato()) {
					contVotos.setTotalVotos(contVotos.getTotalVotos() + 1);
					repositorioContagemVotos.save(contVotos);
					Resultado resultado = repositorioResultado.findById(voto.getCodigoVerificadorResultado()).get();
					resultado.setTotalVotosBrancos(resultado.getTotalVotosBrancos() + 1);
					repositorioResultado.save(resultado);

				}
			}

		}

		else if (voto != null && !voto.isVotoBranco() && !voto.isVotoNulo()) {
			ContagemVotosPorCandidato contagemVoto = repositorioContagemVotos.findById(voto.getCandidatoEscolhido());
			if (contagemVoto != null) {
				contagemVoto.setTotalVotos(contagemVoto.getTotalVotos() + 1);
				repositorioContagemVotos.save(contagemVoto);
				Resultado resultado = repositorioResultado.findById(voto.getCodigoVerificadorResultado()).get();
				resultado.setTotalVotosNominais(resultado.getTotalVotosNominais() + 1);
				repositorioResultado.save(resultado);

			}
		}

		else {
			Resultado resultado = repositorioResultado.findById(voto.getCodigoVerificadorResultado()).get();
			resultado.setTotalVotosNulos(resultado.getTotalVotosNulos() + 1);
			repositorioResultado.save(resultado);
		}

		
	}
}