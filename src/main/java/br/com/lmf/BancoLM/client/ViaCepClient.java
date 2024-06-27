package br.com.lmf.BancoLM.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.lmf.BancoLM.entities.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface ViaCepClient {
	
	@GetMapping("/{cep}/json")
	Endereco buscarEndereco(@PathVariable("cep") String cep);

}
