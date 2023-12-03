package com.example.ProjectBookStore.service.impl;

import com.example.ProjectBookStore.controller.request.AuthorRequest;
import com.example.ProjectBookStore.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Override
    public void create(AuthorRequest request) {
        System.out.println("Author Name : "+request.getName());

    }

    @Override
    public void delete(AuthorRequest request) {
        System.out.println("Deleted Author Name : "+request.getName());

    }
}
