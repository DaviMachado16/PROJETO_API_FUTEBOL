package com.api.futebol.API_FUTEBOL.model;

import jakarta.persistence.*;

@Entity
@Table(name="clube")

public class Clube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="nome", length = 200, nullable = false)
    private String nome;

    @Column(name="pais", length = 100, nullable = false)
    private String pais;
}
