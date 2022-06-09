package com.example.library_management.repository;

import com.example.library_management.models.AuthorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<AuthorModel, String> {
}
