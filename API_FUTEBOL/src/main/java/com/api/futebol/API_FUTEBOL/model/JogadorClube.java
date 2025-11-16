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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getJogador_id() {
        return jogador_id;
    }

    public void setJogador_id(BigInteger jogador_id) {
        this.jogador_id = jogador_id;
    }

    public BigInteger getClube_id() {
        return clube_id;
    }

    public void setClube_id(BigInteger clube_id) {
        this.clube_id = clube_id;
    }

    public BigInteger getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(BigInteger numero_camisa) {
        this.numero_camisa = numero_camisa;
    }
}
