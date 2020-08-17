package br.com.verita.backend.validation;

import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerValidation {
	public String valida(String cpf) ;
}
