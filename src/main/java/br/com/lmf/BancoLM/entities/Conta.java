package br.com.lmf.BancoLM.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroConta;
	
	@Column
	private BigDecimal saldo;
	
	@JoinColumn(name = "conta_tipo_id")
	@ManyToOne
	private ContaTipo contaTipo;
	
	@OneToOne
	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
	private Cliente cliente;
	
	public Conta() {
		
	}

}
