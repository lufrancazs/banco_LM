package br.com.lmf.BancoLM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lmf.BancoLM.client.ViaCepClient;
import br.com.lmf.BancoLM.entities.Cliente;
import br.com.lmf.BancoLM.entities.Endereco;
import br.com.lmf.BancoLM.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private final ClienteRepository clienteRepository;
	
	@Autowired
	private final ViaCepClient viaCepClient;

	public ClienteService(ClienteRepository clienteRepository, ViaCepClient viaCepClient) {
		this.clienteRepository = clienteRepository;
		this.viaCepClient = null;
	}
	
	public Cliente criarCliente(Cliente cliente) {
		
		if(clienteRepository.findByCpfCnpjOrEmail(cliente.getCpfCnpj(), cliente.getEmail()).isPresent()) {
			throw new IllegalArgumentException("Pessoa com mesmo CPF/CNPJ ou Email já existe");
		}
		
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = viaCepClient.buscarEndereco(cep);
		cliente.setEnderecoCep(endereco);
		
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}

}
