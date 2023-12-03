package com.example.ProjectBookStore.service;

import com.example.ProjectBookStore.controller.request.Author;
import com.example.ProjectBookStore.controller.request.AuthorRequest;

import java.util.List;

public interface AuthorService {
    void create(AuthorRequest request);

    void delete(AuthorRequest request);
    List<Author> getAllAuthors();
}
