package com.tsswebapps.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsswebapps.algafood.AlgafoodApiApplication;
import com.tsswebapps.algafood.domain.model.FormaPagamento;
import com.tsswebapps.algafood.domain.repository.FormaPagamentoRepository;

public class FormaPagamentoMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository formaPagamentoRepository = applicationContext
				.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> formasPagamento = formaPagamentoRepository.listar();
		
		for(FormaPagamento formaPagamento: formasPagamento) {
			System.out.println("-> " + formaPagamento.getDescricao());
		}
	}
}
