package com.api.futebol.API_FUTEBOL.model;


import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="jogador_clube")

public class JogadorClube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="jogadorId", nullable = false)
    private BigInteger jogador_id;

    @Column(name="clubeId", nullable = false)
    private BigInteger clube_id;

    @Column(name="numeroCamisa", nullable = false)
    private BigInteger numero_camisa;
}
