package com.tsswebapps.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.Cozinha;
import com.tsswebapps.algafood.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationsContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationsContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Russa");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Canadense");
		
		cozinhaRepository.salvar(cozinha1);
		cozinhaRepository.salvar(cozinha2);
	}
}
