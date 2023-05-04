package br.com.papelaria.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique=true)
	private Integer idcliente;
	
	@Column(nullable=false,unique=false)
	private String nomecliente;
	
	@Column(nullable=true,unique=true)
	private String cpf;
	
	@Column(nullable=false,unique=true)
	private String telefone;
	
	@Column(nullable=true,unique=true)
	private String email;
	
	@Column(nullable=false,unique=true)
	private Integer idusuario;

	public Cliente() {
	}

	public Cliente(Integer idcliente, String nomecliente, String cpf, String telefone, String email, Integer idusuario) {
		this.idcliente = idcliente;
		this.nomecliente = nomecliente;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.idusuario = idusuario;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
}
