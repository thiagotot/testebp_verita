package br.com.verita.backend.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "mensagem")
public class Message implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long _id;
		private String descricaomensagem;
	private int areaMensagem;

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		this._id = id;
	}

	public String getDescricaoMensagem() {
		return descricaomensagem;
	}

	public void setDescricaoMensagem(String descricaoMensagem) {
		this.descricaomensagem = descricaoMensagem;
	}

	public int getAreaMensagem() {
		return areaMensagem;
	}

	public void setAreaMensagem(int areaMensagem) {
		this.areaMensagem = areaMensagem;
	}

	


}
