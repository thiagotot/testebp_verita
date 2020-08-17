package br.com.verita.backend.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customer")
public class Customer implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long _id;
	private String nome;
	private String cpf;
	private String endereco;

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		this._id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	


}
