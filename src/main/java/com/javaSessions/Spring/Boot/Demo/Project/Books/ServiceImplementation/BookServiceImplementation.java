package com.javaSessions.Spring.Boot.Demo.Project.Books.ServiceImplementation;

import com.javaSessions.Spring.Boot.Demo.Project.Books.Repository.BookRepo;
import com.javaSessions.Spring.Boot.Demo.Project.Books.Service.BookService;
import com.javaSessions.Spring.Boot.Demo.Project.Books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImplementation  implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book getBookById(long id) {
        Optional<Book> book =  bookRepo.findById(id);
        return book.get();
    }

    @Override
    public Book updateBook(long id, Book booktoBeDeleted) {
        Book bookFomDB = bookRepo.findById(id).get();
        bookFomDB.setName(booktoBeDeleted.getName());
        bookFomDB.setPublisher(booktoBeDeleted.getPublisher());

        return bookRepo.save(bookFomDB);
    }
}
