package com.zunigatomas.barilibro.book_service.repository;

import com.zunigatomas.barilibro.book_service.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
