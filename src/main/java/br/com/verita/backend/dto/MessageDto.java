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
@ApiModel(description="Dto - Mensagem unívoca do sistema veritá")
public class MessageDto {

	private String descricaoMensagem;
	private int areaMensagem;

	public String getDescricaoMensagem() {
		return descricaoMensagem;
	}
	public void setDescricaoMensagem(String descricaoMensagem) {
		this.descricaoMensagem = descricaoMensagem;
	}
	public int getAreaMensagem() {
		return areaMensagem;
	}
	public void setAreaMensagem(int areaMensagem) {
		this.areaMensagem = areaMensagem;
	}
	
	
}
