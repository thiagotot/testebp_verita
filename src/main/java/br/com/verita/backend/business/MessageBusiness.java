package br.com.verita.backend.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.verita.backend.dto.MessageDto;
import br.com.verita.backend.model.Message;
import br.com.verita.backend.repository.MessageRepository;

@Service
public class MessageBusiness {

	@Autowired private MessageRepository repositoryMessage ;
	
	
	 
	    public String save(MessageDto dto) {
	    	Message msgObj = new Message();
			msgObj.setAreaMensagem(dto.getAreaMensagem());
			msgObj.setDescricaoMensagem(dto.getDescricaoMensagem());
			
			repositoryMessage.save(msgObj);
			
			return "OK";
	    }
	 
	    public List<Message> findAll() {
	       return repositoryMessage.findAll();
	    }
	 
	    public long count() {
	        return repositoryMessage.count();
	    }
	 
	    public Optional<Message> findById(String id) {
	        return repositoryMessage.findById(id);
	    }
	 
	    public void delete(String id) {
	    	repositoryMessage.deleteById(id);
	    }
	
}
