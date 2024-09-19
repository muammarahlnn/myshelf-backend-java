package com.muammarahlnn.myshelf.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File Category, 19/09/2024 17.32
 */
@Entity
@Table(name = "categories")
@NoArgsConstructor @AllArgsConstructor @Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToMany(mappedBy = "categories")
    private Set<Book> books;
}
