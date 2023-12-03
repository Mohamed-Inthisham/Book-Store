package com.example.ProjectBookStore.service.impl;

import com.example.ProjectBookStore.controller.request.Author;
import com.example.ProjectBookStore.controller.request.AuthorRequest;
import com.example.ProjectBookStore.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Author> getAllAuthors() {
        List<Author> allAuthors=new ArrayList<>();
        allAuthors.add(new Author(2,"shanaka"));
        allAuthors.add(new Author(3,"Dasun"));
        allAuthors.add(new Author(4,"helindu"));
        allAuthors.add(new Author(5,"madushan"));
        allAuthors.add(new Author(6,"Darshana"));
        return allAuthors;
    }

}
