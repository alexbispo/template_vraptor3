package br.alexbispo.templatevraptor3.exemplo.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ExemploController {

	private final Result result;

	public ExemploController(Result result){
		this.result = result;
	}
	
	public void hello(){
		result.include("mensagem", "Meu projeto template com vraptor 3 está funcionando!");
	}
}
