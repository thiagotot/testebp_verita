package br.com.verita.verita.backend;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.verita.backend.business.CustomerBusiness;
import br.com.verita.backend.dto.CustomerDto;
import br.com.verita.backend.model.Customer;


public class AppTest {

	@Autowired
	private CustomerBusiness buCustomer;

	@Test
	public void shouldCreateWithSetId() {

		try {
			Long id = (long) 5;
			CustomerDto customer = new CustomerDto();
			customer.setCpf("11895952735");
			customer.setEndereco("AV DAS COUVES 2");
			customer.setNome("PRIME IT 1");
			customer.setId(id);
			String response = buCustomer.save(customer);
			assertTrue(response == "OK");

		} catch (Exception e) {
			e.getMessage();
		}

	}
}
