package br.com.verita.backend.repository;

import br.com.verita.backend.model.*;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}


