package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Cliente;
import br.com.papelaria.projeto.repository.ClienteRepository;

@RestController
public class ClienteController {
	//Auto instância da interface em tempo de execução
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/cliente/listar")
	public List<Cliente> listar() {
		return cr.findAll();
	}
	
	@PostMapping("/cliente/cadastrar")
	public String cadastrar(@RequestBody Cliente cl) {
		String msg = "";
		cr.save(cl);
		msg = "Cadastrado";
		return msg;
	}
}