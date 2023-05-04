package br.com.papelaria.projeto.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, unique=true)
	private Integer idcategoria;
	
	@Column(nullable=false, unique=true)
	private String nomecategoria;
	
	@Column(nullable=false, unique=false)
	private Date datacriacao;

	public Categoria() {
	}

	public Categoria(Integer idcategoria, String nomecategoria, Date datacriacao) {
		this.idcategoria = idcategoria;
		this.nomecategoria = nomecategoria;
		this.datacriacao = datacriacao;
	}

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNomecategoria() {
		return nomecategoria;
	}

	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

	public Date getDatacriacao() {
		return datacriacao;
	}

	public void setDatacriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}
}
