package com.tsswebapps.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsswebapps.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.tsswebapps.algafood.domain.model.Cozinha;
import com.tsswebapps.algafood.domain.model.Restaurante;
import com.tsswebapps.algafood.domain.repository.CozinhaRepository;
import com.tsswebapps.algafood.domain.repository.RestauranteRepositoty;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	private RestauranteRepositoty restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if(cozinha == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cozinha com esse código, %d.", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha);		
		return restauranteRepository.salvar(restaurante);
	}

}
