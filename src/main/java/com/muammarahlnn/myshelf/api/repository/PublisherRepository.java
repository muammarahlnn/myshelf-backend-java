package com.muammarahlnn.myshelf.api.repository;

import com.muammarahlnn.myshelf.api.entity.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PublisherRepository, 20/09/2024 01.10
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    Page<Publisher> findByUserId(int userId, Pageable pageable);
}
