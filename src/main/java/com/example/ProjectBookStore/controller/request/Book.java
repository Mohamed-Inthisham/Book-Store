package com.example.ProjectBookStore.controller.request;

public class Book{
    private String title;
    private int id;

public Book(String title,int id){
    this.id=id;
    this.title=title;
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
