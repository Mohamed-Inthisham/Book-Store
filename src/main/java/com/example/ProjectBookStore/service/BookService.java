package com.example.ProjectBookStore.service;

import com.example.ProjectBookStore.controller.request.BookRequest;

public interface BookService {

    void create(BookRequest request);

    void delete(BookRequest request);
}
