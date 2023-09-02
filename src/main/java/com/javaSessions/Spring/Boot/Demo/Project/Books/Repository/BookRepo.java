package com.javaSessions.Spring.Boot.Demo.Project.Books.Repository;

import com.javaSessions.Spring.Boot.Demo.Project.Books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
