package com.tsswebapps.algafood.domain.repository;

import java.util.List;

import com.tsswebapps.algafood.domain.model.Restaurante;

public interface RestauranteRepositoty {
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);
}
