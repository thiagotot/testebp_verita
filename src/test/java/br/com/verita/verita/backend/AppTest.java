package br.com.verita.verita.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.verita.backend.api.CustomerApi;
import br.com.verita.backend.business.CustomerBusiness;
import br.com.verita.backend.dto.CustomerDto;
import br.com.verita.backend.infra.CustomerValidations;
import br.com.verita.backend.repository.CustomerRepository;
import br.com.verita.backend.validation.ICustomerValidation;
import junit.framework.TestCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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
