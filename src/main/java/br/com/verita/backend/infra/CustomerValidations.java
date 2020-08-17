package br.com.verita.backend.infra;

import org.springframework.stereotype.Service;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.verita.backend.validation.ICustomerValidation;

@Service
public class CustomerValidations implements ICustomerValidation{
	
	public String valida(String cpf) { 
	    CPFValidator cpfValidator = new CPFValidator(); 
	    try{ cpfValidator.assertValid(cpf); 
	    return ""; 
	    }catch(InvalidStateException e){ 
	        return e.getMessage(); 
	        } 
	    }

}
