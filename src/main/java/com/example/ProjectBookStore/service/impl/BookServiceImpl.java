package com.example.ProjectBookStore.service.impl;

import com.example.ProjectBookStore.controller.request.Author;
import com.example.ProjectBookStore.controller.request.Book;
import com.example.ProjectBookStore.controller.request.BookRequest;
import com.example.ProjectBookStore.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Book> getAllBooks() {
        List<Book> allBooks=new ArrayList<>();
        allBooks.add(new Book("Heaven wings",98));
        allBooks.add(new Book("Charlie",156));
        allBooks.add(new Book("777",65));
        allBooks.add(new Book("Hello from the other side",268));
        allBooks.add(new Book("Dare Devil",50));
        allBooks.add(new Book("United Peoples",71));
        allBooks.add(new Book("Yakuza",150));

        return allBooks;
    }
}
