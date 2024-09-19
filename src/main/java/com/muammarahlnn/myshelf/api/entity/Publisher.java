package com.muammarahlnn.myshelf.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 * @Author Muammar Ahlan Abimanyu
 * @File Publisher, 19/09/2024 17.38
 */
@Entity
@Table(name = "publishers")
@NoArgsConstructor @AllArgsConstructor @Builder
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(
        mappedBy = "publisher",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private Set<Book> books;
}
