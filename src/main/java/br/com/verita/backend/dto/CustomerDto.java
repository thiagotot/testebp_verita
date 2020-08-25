package br.com.verita.backend.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import springfox.documentation.annotations.ApiIgnore;


@AllArgsConstructor
@NoArgsConstructor
@ApiIgnore
@Data
@ApiModel(description="Dto - Informações de Pet")
public class CustomerDto {


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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String nome;
	private String cpf;
	private String endereco;
	private Long id;

	
}
