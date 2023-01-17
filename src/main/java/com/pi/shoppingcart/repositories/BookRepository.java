package com.pi.shoppingcart.repositories;

import com.pi.shoppingcart.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  BookRepository extends JpaRepository<Book, Long> {
}
