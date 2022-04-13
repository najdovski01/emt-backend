package com.example.emtbackend.service;

import com.example.emtbackend.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> findById(Long id);
    List<Author> findAll();
    Optional<Author> create(Author author);
}
