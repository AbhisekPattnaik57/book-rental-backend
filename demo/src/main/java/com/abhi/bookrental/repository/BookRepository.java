package com.abhi.bookrental.repository;

import com.abhi.bookrental.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
