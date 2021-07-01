package com.tsswebapps.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.tsswebapps.algafood.domain.model.Estado;
import com.tsswebapps.algafood.domain.repository.EstadoRepository;

@Component
public class EstatoRepositoryImpl implements EstadoRepository {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Estado> listar() {
		return manager.createQuery("from Estado", Estado.class).getResultList();
	}

	@Override
	public Estado buscar(Long id) {
		return manager.find(Estado.class, id);
	}

	@Override
	public Estado salvar(Estado estado) {
		return manager.merge(estado);
	}

	@Override
	public void remover(Estado estado) {
		manager.remove(buscar(estado.getId()));
	}
}
