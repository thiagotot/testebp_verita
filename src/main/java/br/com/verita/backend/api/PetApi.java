package br.com.verita.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.verita.backend.business.CustomerBusiness;
import br.com.verita.backend.business.PetBusiness;
import br.com.verita.backend.dto.PetDto;
import br.com.verita.backend.model.Customer;
import br.com.verita.backend.model.Pet;
import br.com.verita.backend.repository.PetRepository;

@RestController
@RequestMapping("/petapi")
public class PetApi {

	@Autowired
	private PetBusiness buPet;
	
	

	@RequestMapping(value = "/save", method = { RequestMethod.POST })
	public String save(@RequestBody PetDto message) throws Exception {

		String retorno = "";
		try {
			retorno = buPet.save(message);

		} catch (Exception e) {
			retorno = e.getMessage();
		}

		return retorno;
	}

	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public List<PetDto> findAll() {
		return buPet.findAll();
	}

	@RequestMapping(value = "/count", method = { RequestMethod.GET })
	public long count() {
		return buPet.count();
	}

	@RequestMapping(value = "/count", method = { RequestMethod.DELETE })
	public String delete(Long id) {
		return buPet.delete(id);
	}

}
