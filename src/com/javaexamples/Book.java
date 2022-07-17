package com.javaexamples;

public class Book {
    public Integer getId() {
        return id;
    }

    public String name, author, publisher;
    public Integer id;

    public Book(String name, Integer id, String author, String publisher) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.publisher = publisher;
    }
}
