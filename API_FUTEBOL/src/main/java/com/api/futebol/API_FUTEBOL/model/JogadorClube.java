package com.api.futebol.API_FUTEBOL.model;


import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="jogador_clube")

/*    "id" serial NOT NULL UNIQUE,
    "jogador_id" bigint NOT NULL,
    "clube_id" bigint NOT NULL,
    "numero_camisa" bigint NOT NULL,
    PRIMARY KEY ("id")
*/

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
