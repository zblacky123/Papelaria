package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Categoria;
import br.com.papelaria.projeto.repository.CategoriaRepository;

@RestController
public class CategoriaController {
	@Autowired
	private CategoriaRepository car;
	
	@GetMapping("/categoria/listar")
	public List<Categoria> listar(){
		return car.findAll();
	}
	
	@PostMapping("/categoria/cadastrar")
	public String cadastrar(@RequestBody Categoria ca) {
		String msg = "";
		car.save(ca);
		msg = "Cadastrado";
		return msg;
	}
}
