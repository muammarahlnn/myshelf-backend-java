package com.muammarahlnn.myshelf.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File Author, 19/09/2024 17.18
 */
@Entity
@Table(name = "authors")
@NoArgsConstructor @AllArgsConstructor @Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToMany(
        mappedBy = "authors",
        cascade = CascadeType.ALL
    )
    private Set<Book> books;
}
