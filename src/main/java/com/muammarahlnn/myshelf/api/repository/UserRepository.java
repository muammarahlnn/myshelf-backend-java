package com.muammarahlnn.myshelf.api.repository;

import com.muammarahlnn.myshelf.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File UserRepository, 20/09/2024 00.34
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
