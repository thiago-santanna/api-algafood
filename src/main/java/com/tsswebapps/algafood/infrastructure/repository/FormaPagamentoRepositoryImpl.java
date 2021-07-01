package com.tsswebapps.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.tsswebapps.algafood.domain.model.FormaPagamento;
import com.tsswebapps.algafood.domain.repository.FormaPagamentoRepository;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<FormaPagamento> listar() { 
		return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
	}

	@Override
	public FormaPagamento buscar(Long id) {
		return manager.find(FormaPagamento.class, id);
	}

	@Override
	public FormaPagamento salvar(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);
	}

	@Override
	public void remover(FormaPagamento formaPagamento) {
		manager.remove(buscar(formaPagamento.getId()));
	}
}
