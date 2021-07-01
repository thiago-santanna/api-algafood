package com.tsswebapps.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.Permissao;
import com.tsswebapps.algafood.domain.repository.PermissaoRepository;

public class PermissaoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		List<Permissao> permissoes = permissaoRepository.listar();
		
		for(Permissao permissao : permissoes) {
			System.out.printf("-> %s - %s\n", permissao.getNome(), permissao.getDescricao());
		}
	}

}
