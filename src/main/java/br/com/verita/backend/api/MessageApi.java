package br.com.verita.backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.verita.backend.business.MessageBusiness;
import br.com.verita.backend.dto.MessageDto;
import br.com.verita.backend.repository.MessageRepository;

@RestController
@RequestMapping("/messageapi")
public class MessageApi {
	
	@Autowired private MessageBusiness buMessage ;
	
	@RequestMapping(value ="/save", method = {RequestMethod.POST})
	public String save (@RequestBody MessageDto message) throws Exception{
		
		String retorno = "";
		try
		{
			retorno  = buMessage.save(message);

		} catch (Exception e)
		{
			retorno = e.getMessage();
		}
		
		
		
		return retorno;
	}

}
