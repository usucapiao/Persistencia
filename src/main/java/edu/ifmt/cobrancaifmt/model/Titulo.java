package edu.ifmt.cobrancaifmt.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity //Uma entidade JPA
public class Titulo {
	
	@Id // Idenditifca a Entidade
	@GeneratedValue(strategy=GenerationType.IDENTITY) // estrategia - fica por conta do DB
	private Long codigo;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	private BigDecimal valor;
	@Enumerated(EnumType.STRING) // salvará no DB como String
	private StatusTitulo status;
		
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, status, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descricao, other.descricao)
				&& status == other.status && Objects.equals(valor, other.valor);
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public StatusTitulo getStatus() {
		return status;
	}
	public void setStatus(StatusTitulo status) {
		this.status = status;
	}

	}
