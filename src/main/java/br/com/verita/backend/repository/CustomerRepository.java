
package br.com.verita.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.verita.backend.model.*;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

