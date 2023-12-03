package com.example.ProjectBookStore.controller;

import com.example.ProjectBookStore.controller.request.Author;
import com.example.ProjectBookStore.controller.request.AuthorRequest;
import com.example.ProjectBookStore.controller.response.AuthorResponse;
import com.example.ProjectBookStore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/authors")
    public AuthorResponse addAuthor(@RequestBody AuthorRequest authorRequest){
        System.out.println("Author added Successfully  ");
        authorService.create(authorRequest);
        AuthorResponse authorResponse=new AuthorResponse();
        authorResponse.setName(authorRequest.getName());
        authorResponse.setId(authorRequest.getId());
        authorResponse.setAge(authorRequest.getAge());
        authorResponse.setBirth_date(authorRequest.getBirth_date());
        authorResponse.setNationality(authorRequest.getNationality());
        return authorResponse;
    }
    @DeleteMapping("/authors/{author-id}")
    public AuthorResponse removeAuthor(@PathVariable("author-id")Integer id, @RequestBody AuthorRequest authorRequest){
        System.out.println("Author Deleted Successfully");
        System.out.println("Deleted Author Id : "+id);
        authorService.delete(authorRequest);
        AuthorResponse authorResponse=new AuthorResponse();
        authorResponse.setName(authorRequest.getName());
        return authorResponse;
    }
    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();

    }


}
