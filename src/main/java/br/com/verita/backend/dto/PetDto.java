package br.com.verita.backend.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import springfox.documentation.annotations.ApiIgnore;


@AllArgsConstructor
@NoArgsConstructor
@ApiIgnore
@Data
@ApiModel(description="Dto - Mensagem unívoca do sistema veritá")
public class PetDto {

	public String getNomepet() {
		return nomepet;
	}
	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	private String nomepet;
	private int idCustomer;
	
	
}
