package org.example.service;

import org.apache.catalina.LifecycleState;
import org.example.dto.Book;
import org.example.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<BookEntity> getBooks();
}
