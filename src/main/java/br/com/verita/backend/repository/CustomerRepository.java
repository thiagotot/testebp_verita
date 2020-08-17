
package br.com.verita.backend.repository;

import br.com.verita.backend.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}

