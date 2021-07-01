package com.tsswebapps.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.Cidade;
import com.tsswebapps.algafood.domain.repository.CidadeRepository;

public class CidadeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> cidades = cidadeRepository.listar();
		
		for(Cidade cidade : cidades) {
			System.out.printf("-> %s UF: %s\n", cidade.getNome(), cidade.getEstado().getNome());
		}
	}
}
