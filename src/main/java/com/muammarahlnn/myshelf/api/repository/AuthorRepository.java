package com.muammarahlnn.myshelf.api.repository;

import com.muammarahlnn.myshelf.api.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AuthorRepository, 20/09/2024 01.06
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Page<Author> findByUserId(int userId, Pageable pageable);
}
