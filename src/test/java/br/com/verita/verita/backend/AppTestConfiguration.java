package br.com.verita.verita.backend;

import org.mockito.Mockito;

import br.com.verita.backend.api.CustomerApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


@Profile("test")
@Configuration
public class AppTestConfiguration {
	
	@Bean
    @Primary
    public CustomerApi api() {
        return Mockito.mock(CustomerApi.class);
    }
}
