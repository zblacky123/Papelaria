package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.ItensPedido;
import br.com.papelaria.projeto.repository.ItensPedidoRepository;

@RestController
public class ItensPedidoController {
	//Auto instância da interface em tempo de execução
	@Autowired
	private ItensPedidoRepository ipr;
	
	@GetMapping("/itenspedido/listar")
	public List<ItensPedido> listar() {
		return ipr.findAll();
	}
	
	@PostMapping("/itenspedido/cadastrar")
	public String cadastrar(@RequestBody ItensPedido ip) {
		String msg = "";
		ipr.save(ip);
		msg = "Cadastrado";
		return msg;
	}
}