package com.muammarahlnn.myshelf.api.repository;

import com.muammarahlnn.myshelf.api.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File CategoryRepository, 20/09/2024 01.07
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Page<Category> findByUserId(int userId, Pageable pageable);
}
