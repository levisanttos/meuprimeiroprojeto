package br.com.ailv.meuprimeiroprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	
	@GetMapping("/produtos/nome-produto")
	public String getNomeProduto() {
		return "Produto indiponivel";
	}
}
