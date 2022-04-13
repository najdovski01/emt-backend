package com.example.emtbackend.service;

import com.example.emtbackend.model.Book;
import com.example.emtbackend.model.dto.BookDto;
import com.example.emtbackend.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> create(String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> save(BookDto bookDto);
    Optional<Book> edit(Long id, BookDto bookDto);
    Optional<Book> delete(Long id);
    Optional<Book> setAvailableCopies(Long id);
}
