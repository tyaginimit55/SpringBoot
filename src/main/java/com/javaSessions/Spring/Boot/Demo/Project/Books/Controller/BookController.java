package com.javaSessions.Spring.Boot.Demo.Project.Books.Controller;

import com.javaSessions.Spring.Boot.Demo.Project.Books.Service.BookService;
import com.javaSessions.Spring.Boot.Demo.Project.Books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping ("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/books/{id}")
    public Book getBookById( @PathVariable long id){
        return bookService.getBookById(id);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }


}
