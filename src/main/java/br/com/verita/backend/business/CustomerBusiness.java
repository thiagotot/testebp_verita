package br.com.verita.backend.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.com.verita.backend.dto.CustomerDto;
import br.com.verita.backend.model.Customer;
import br.com.verita.backend.repository.CustomerRepository;
import br.com.verita.backend.validation.ICustomerValidation;

@RestController
@CrossOrigin
@Service
public class CustomerBusiness {

	@Autowired
	private CustomerRepository repositoryCustomer;
	@Autowired
	private ICustomerValidation customerValidation;

	public String validCpf(String cpf) {
		return customerValidation.valida(cpf);
	}

	public String save(CustomerDto dto) {
		try {

			String sValidCpf = validCpf(dto.getCpf());

			if (sValidCpf != "")
				return sValidCpf;

			Customer msgObj = new Customer();
			msgObj.setId(dto.getId());
			msgObj.setCpf(dto.getCpf());
			msgObj.setEndereco(dto.getEndereco());
			msgObj.setNome(dto.getNome());
			repositoryCustomer.save(msgObj);

			return "OK";
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public List<CustomerDto> findAll() {

		List<Customer> lCustomer;
		List<CustomerDto> lCustomerDto = new ArrayList<CustomerDto>();
		CustomerDto dto;

		lCustomer = repositoryCustomer.findAll();

		for (Customer item : lCustomer) {
			dto = new CustomerDto();
			dto.setCpf(item.getCpf());
			dto.setEndereco(item.getEndereco());
			dto.setNome(item.getNome());
			dto.setId(item.getId());

			lCustomerDto.add(dto);
		}

		return lCustomerDto;
	}

	public boolean findByIdCount(int i) {
		Object obj = repositoryCustomer.findById((long) i);
		if (obj.equals(null))
			return true;
		else
			return false;
	}

	public long count() {
		return repositoryCustomer.count();
	}

	public String delete(Long id) {
		repositoryCustomer.deleteById(id);
		return "Ok";
	}

}
