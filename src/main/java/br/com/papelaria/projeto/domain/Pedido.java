package br.com.papelaria.projeto.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, unique=true)
	private Integer idpedido;
	
	@Column(nullable=false, unique=true)
	private Integer idusuario;
	
	@Column(nullable=false, unique=false)
	private Date datapedido;

	public Pedido() {
	}

	public Pedido(Integer idpedido, Integer idusuario, Date datapedido) {
		this.idpedido = idpedido;
		this.idusuario = idusuario;
		this.datapedido = datapedido;
	}

	public Integer getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public Date getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(Date datapedido) {
		this.datapedido = datapedido;
	}
}
