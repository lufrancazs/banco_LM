package br.com.lmf.BancoLM.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_conta")
public class ContaTipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;

	public ContaTipo() {

	}

	public ContaTipo(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaTipo other = (ContaTipo) obj;
		return Objects.equals(id, other.id);
	}

	public enum Enum {

		CORRENTE(1L, "corrente"), POUPANÇA(2L, "poupanca");

		private Enum(Long id, String description) {
			this.id = id;
			this.description = description;
		}

		private Long id;
		private String description;

		public ContaTipo get() {
			return new ContaTipo(id, description);
		}
	}
}
