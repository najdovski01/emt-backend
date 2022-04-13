package com.example.emtbackend.service.impl;

import com.example.emtbackend.model.Author;
import com.example.emtbackend.model.exceptions.AuthorNotFoundException;
import org.springframework.stereotype.Service;
import com.example.emtbackend.service.AuthorService;
import com.example.emtbackend.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.of(this.authorRepository
                .findById(id).orElseThrow(() -> new AuthorNotFoundException(id)));
    }

    @Override
    public List<Author> findAll () {
        return this.authorRepository.findAll();
        }

    @Override
    public Optional<Author> create(Author author) {
        return Optional.of(this.authorRepository.save(author));
    }

    }
