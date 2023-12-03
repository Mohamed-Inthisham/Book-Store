package com.example.ProjectBookStore.service;

import com.example.ProjectBookStore.controller.request.AuthorRequest;
import com.example.ProjectBookStore.controller.request.BookRequest;

public interface AuthorService {
    void create(AuthorRequest request);

    void delete(AuthorRequest request);
}
