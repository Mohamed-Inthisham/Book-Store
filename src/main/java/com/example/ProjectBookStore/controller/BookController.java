package com.example.ProjectBookStore.controller;

import com.example.ProjectBookStore.controller.request.BookRequest;
import com.example.ProjectBookStore.controller.response.BookResponse;
import com.example.ProjectBookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public BookResponse addBook(@RequestBody BookRequest bookRequest){
        //System.out.println("Book added Successfully : "+bookRequest.getTitle());
        bookService.create(bookRequest);
        BookResponse bookResponse=new BookResponse();
        bookResponse.setTitle(bookRequest.getTitle());
        bookResponse.setId(bookRequest.getId());
        bookResponse.setIsbn(bookRequest.getIsbn());
        bookResponse.setPages(bookRequest.getPages());
        bookResponse.setAuthor(bookRequest.getAuthor());
        bookResponse.setGenre(bookRequest.getGenre());
        bookResponse.setPublish_date(bookRequest.getPublish_date());
        bookResponse.setLanguage(bookRequest.getLanguage());
        return bookResponse;
    }
    
}
