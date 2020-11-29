package br.com.ustore.desafio.servico;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ustore.desafio.modelo.Resultado;
import br.com.ustore.desafio.modelo.Votacao;
import br.com.ustore.desafio.repositorio.RepositorioResultado;
import br.com.ustore.desafio.repositorio.RepositorioVotacao;

@Service
public class VotacaoServicoImpl implements VotacaoServico {

    @Autowired
    public RepositorioResultado repositorioResultado;
    
    @Autowired
    public RepositorioVotacao repositorioVotacao;

	@Override
	public long votar(Votacao voto) {
		long resultadoVoto= 0L;
		
		if( voto !=null && voto.isVotoBranco()) {
			Map<Long, Long> contagem = new HashMap<Long, Long>();
			Resultado resultado = repositorioResultado.findById(voto.getCodigoVerificadorResultado());
				if(resultado !=null) {
					for(Votacao votoComputado: resultado.getListaVotacao()) {
						if(contagem.containsKey(votoComputado.getCadidatoEscolhido().getNumeroCandidatura())) {
							 contagem.put(votoComputado.getCadidatoEscolhido().getNumeroCandidatura(), 0L);
						}
						   contagem.put(votoComputado.getCadidatoEscolhido().getNumeroCandidatura(), 
								   contagem.get(votoComputado.getCadidatoEscolhido().getNumeroCandidatura())+1);
					}
				}
		}
		
		else if( voto != null && !voto.isVotoNulo() && voto.getCadidatoEscolhido() !=null) {
			Votacao votacaoSalva = repositorioVotacao.save(voto);
			resultadoVoto = votacaoSalva.getId();
		}
		
		return resultadoVoto;
	}

  

}
