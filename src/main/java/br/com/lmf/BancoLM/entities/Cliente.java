package br.com.lmf.BancoLM.entities;

public class Cliente {
	
	private Long id;
	private String nome;
	private Integer cpfCnpj;
	private Integer telefone;
	private String email;
	private String senha;
	
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
