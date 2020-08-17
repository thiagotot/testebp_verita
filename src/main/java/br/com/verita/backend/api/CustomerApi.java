
package br.com.verita.backend.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.verita.backend.business.CustomerBusiness;
import br.com.verita.backend.dto.CustomerDto;
import br.com.verita.backend.model.Customer;

@RestController
@RequestMapping("/customerapi")
public class CustomerApi {

	@Autowired
	private CustomerBusiness buCustomer;

	@RequestMapping(value = "/post", method = { RequestMethod.POST })
	public String save(@RequestBody CustomerDto customer) throws Exception {

		String retorno = "";
		try {
			retorno = buCustomer.save(customer);
		} catch (Exception e) {
			retorno = e.getMessage();
		}

		return retorno;
	}

	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public List<Customer> findAll() {
		return buCustomer.findAll();
	}

	@RequestMapping(value = "/count", method = { RequestMethod.GET })
	public long count() {
		return buCustomer.count();
	}

	@RequestMapping(value = "/getById", method = { RequestMethod.GET })
	public Optional<Customer> findById(String id) {
		return buCustomer.findById(id);
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE })
	public void delete(String id) {
		buCustomer.delete(id);
	}

}
