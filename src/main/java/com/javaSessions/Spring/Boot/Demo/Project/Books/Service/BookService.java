package com.javaSessions.Spring.Boot.Demo.Project.Books.Service;

import com.javaSessions.Spring.Boot.Demo.Project.Books.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book addBook(Book book);

    Book getBookById(long id);

    Book updateBook(long id, Book book);
}
