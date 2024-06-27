package br.com.lmf.BancoLM.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lmf.BancoLM.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Optional<Cliente> findByCpfCnpjOrEmail(Integer cpfCnpj, String email);

}
