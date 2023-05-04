package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Pedido;
import br.com.papelaria.projeto.repository.PedidoRepository;

@RestController
public class PedidoController {
	//Auto instância da interface em tempo de execução
	@Autowired
	private PedidoRepository per;
	
	@GetMapping("/pedido/listar")
	public List<Pedido> listar() {
		return per.findAll();
	}
	
	@PostMapping("/pedido/cadastrar")
	public String cadastrar(@RequestBody Pedido pe) {
		String msg = "";
		per.save(pe);
		msg = "Cadastrado";
		return msg;
	}
}
