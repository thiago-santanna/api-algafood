package com.tsswebapps.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.Cozinha;
import com.tsswebapps.algafood.domain.repository.CozinhaRepository;

public class RemocaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationsContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationsContext.getBean(CozinhaRepository.class);
		
		//Posso enviar um objeto ou o ID dele, pois de toda forma vou ter que fazer um find lá no remover.
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		
		//cozinhaRepository.remover(cozinha);
	}
}
