package com.javaSessions.Spring.Boot.Demo.Project.Books.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Bookdata")
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String publisher;

    public Book(long id, String name, String publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }

    public Book() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
