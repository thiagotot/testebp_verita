package br.com.verita.verita.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.verita.backend.infra.CustomerValidations;
import br.com.verita.backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

import org.junit.Before;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	private CustomerValidations customerValidations;
	@Autowired
	private CustomerRepository repositoryCustomer;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldDatabaseHasRegistries() {

		try {
			Long response = repositoryCustomer.count();
			assertNotSame(0, response);

		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Test
	public void shouldCpfIsValidAccordingRules() {

		try {
			customerValidations = new CustomerValidations();
			String response = customerValidations.valida("11895952735");
			assertEquals("", response);
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
