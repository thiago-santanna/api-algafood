package com.tsswebapps.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.Restaurante;
import com.tsswebapps.algafood.domain.repository.RestauranteRepositoty;

public class ConsultaRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationsContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepositoty restauranteRepository = applicationsContext.getBean(RestauranteRepositoty.class);
		
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for (Restaurante restaurante : restaurantes) {
			System.out.printf("%s - %f - %s\n", restaurante.getNome(), 
					restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
		}
	}
}
