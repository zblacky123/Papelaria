package br.com.papelaria.projeto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, unique=true)
	private Integer idusuario;
	
	@Column(nullable=false, unique=true)
	private String nomeusuario;
	
	@Column(nullable=false, unique=false)
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer idusuario, String nomeusuario, String senha) {
		this.idusuario = idusuario;
		this.nomeusuario = nomeusuario;
		this.senha = senha;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
