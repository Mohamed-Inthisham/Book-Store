package com.example.ProjectBookStore.service;

import com.example.ProjectBookStore.controller.request.Author;
import com.example.ProjectBookStore.controller.request.Book;
import com.example.ProjectBookStore.controller.request.BookRequest;

import java.util.List;

public interface BookService {

    void create(BookRequest request);

    void delete(BookRequest request);
    List<Book> getAllBooks();
}
