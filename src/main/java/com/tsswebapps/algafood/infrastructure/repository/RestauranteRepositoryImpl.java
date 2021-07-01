package com.tsswebapps.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.tsswebapps.algafood.domain.model.Restaurante;
import com.tsswebapps.algafood.domain.repository.RestauranteRepositoty;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepositoty {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> listar() {
		return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
	}

	@Override
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class, id);
	}

	@Override
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}

	@Override
	public void remover(Restaurante restaurante) {
		manager.remove(buscar(restaurante.getId()));
		
	}

}
