package br.com.verita.backend.infra;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.verita.backend.validation.ICustomerValidation;

public class CustomerValidations implements ICustomerValidation{
	
	public boolean valida(String cpf) { 
	    CPFValidator cpfValidator = new CPFValidator(); 
	    try{ cpfValidator.assertValid(cpf); 
	    return true; 
	    }catch(Exception e){ 
	        e.printStackTrace(); 
	        return false; 
	        } 
	    }

}
