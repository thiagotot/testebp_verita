package br.com.verita.backend.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.verita.backend.dto.PetDto;
import br.com.verita.backend.model.Pet;
import br.com.verita.backend.repository.PetRepository;

@Service
public class PetBusiness {

	@Autowired
	private PetRepository repositoryPet;
	@Autowired
	private CustomerBusiness buCustomer;
	
	public String save(PetDto dto) {
		
		if (buCustomer.findByIdCount(dto.getIdCustomer())==true)
			return "Cliente não cadastrado";
		
		Pet msgObj = new Pet();
		msgObj.setNomepet(dto.getNomepet());
		msgObj.setIdCustomer(dto.getIdCustomer());
		repositoryPet.save(msgObj);

		return "OK";
	}

	public List<PetDto> findAll() {

		List<Pet> lPet;
		List<PetDto> lPetDto = new ArrayList<PetDto>();
		PetDto dto;

		lPet = repositoryPet.findAll();

		for (Pet item : lPet) {
			dto = new PetDto();
			dto.setNomepet(item.getNomepet());
			dto.setIdCustomer(item.getIdCustomer());
			
			lPetDto.add(dto);
		}

		return lPetDto;
	}
	


	public long count() {
		return repositoryPet.count();
	}

	public String delete(Long id) {
		repositoryPet.deleteById(id);
		return "Ok";
	}

}
