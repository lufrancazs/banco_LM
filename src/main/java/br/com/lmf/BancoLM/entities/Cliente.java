package br.com.lmf.BancoLM.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private Integer cpfCnpj;
	
	@Column(nullable = false)
	private Integer telefone;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	public Cliente() {
	}

	public Cliente(Long id, String nome, Integer cpfCnpj, Integer telefone, String email, String senha,
			Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Integer cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
