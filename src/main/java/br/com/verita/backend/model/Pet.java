package br.com.verita.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pet")
public class Pet implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomepet;
	private int idcustomer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomepet() {
		return nomepet;
	}

	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}

	public int getIdCustomer() {
		return idcustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idcustomer = idCustomer;
	}

	

}
