package com.example.ProjectBookStore.service.impl;

import com.example.ProjectBookStore.controller.request.BookRequest;
import com.example.ProjectBookStore.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void create(BookRequest request) {
        System.out.println("Book created : "+request.getTitle());
    }

    @Override
    public void delete(BookRequest request) {
        System.out.println("Deleted Book Name : "+request.getTitle());

    }
}
