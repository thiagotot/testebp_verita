package br.com.verita.backend.repository;

import br.com.verita.backend.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}


