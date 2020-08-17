package br.com.verita.backend.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.verita.backend.dto.CustomerDto;
import br.com.verita.backend.model.Customer;
import br.com.verita.backend.repository.CustomerRepository;
import br.com.verita.backend.validation.ICustomerValidation;

@Service
public class CustomerBusiness {

	@Autowired
	private CustomerRepository repositoryCustomer;
	@Autowired
	private ICustomerValidation customerValidation;

	public String save(CustomerDto dto) {
		try {
			
			String sValidCpf = customerValidation.valida(dto.getCpf());
			
			if (sValidCpf!="")
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

	public List<Customer> findAll() {
		return repositoryCustomer.findAll();
	}

	public long count() {
		return repositoryCustomer.count();
	}

	public Optional<Customer> findById(String id) {
		return repositoryCustomer.findById(id);
	}

	public void delete(String id) {
		repositoryCustomer.deleteById(id);
	}

}
