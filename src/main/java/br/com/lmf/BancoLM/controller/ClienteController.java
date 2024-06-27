package br.com.lmf.BancoLM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lmf.BancoLM.entities.Cliente;
import br.com.lmf.BancoLM.services.ClienteService;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = clienteService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
		Cliente response = clienteService.criarCliente(cliente);
		return ResponseEntity.ok(response);
	}

}
