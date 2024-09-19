package com.muammarahlnn.myshelf.api.repository;

import com.muammarahlnn.myshelf.api.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BookRepository, 20/09/2024 01.05
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    Page<Book> findByUserId(int userId, Pageable pageable);
}
