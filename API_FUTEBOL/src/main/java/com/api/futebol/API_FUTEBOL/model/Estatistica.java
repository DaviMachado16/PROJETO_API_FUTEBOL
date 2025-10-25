package com.api.futebol.API_FUTEBOL.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="estatistica")
public class Estatistica {
    /*CREATE TABLE IF NOT EXISTS "Estatistica" (
    "id" serial NOT NULL UNIQUE,
    "jogador_id" bigint NOT NULL,
    "jogos" bigint NOT NULL,
    "gols" bigint NOT NULL,
    "assistencias" bigint NOT NULL,
    "cartoes_amarelo" bigint NOT NULL,
    "cartoes_vermelho" bigint NOT NULL,
    PRIMARY KEY ("id")
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "jogadoId", unique = true)
    private BigInteger jogador_id;

    @Column(name="jogos", nullable = false)
    private BigInteger jogos;

    @Column(name="gols", nullable = false)
    private BigInteger gols;

    @Column(name="assistencias", nullable = false)
    private BigInteger assistencias;

    @Column(name="cartoes_amarelo", nullable = false)
    private BigInteger cartoes_amarelo;

    @Column(name="cartoesVermelho", nullable = false)
    private BigInteger cartoes_vermelho;

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

    public BigInteger getJogos() {
        return jogos;
    }

    public void setJogos(BigInteger jogos) {
        this.jogos = jogos;
    }

    public BigInteger getGols() {
        return gols;
    }

    public void setGols(BigInteger gols) {
        this.gols = gols;
    }

    public BigInteger getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(BigInteger assistencias) {
        this.assistencias = assistencias;
    }

    public BigInteger getCartoes_amarelo() {
        return cartoes_amarelo;
    }

    public void setCartoes_amarelo(BigInteger cartoes_amarelo) {
        this.cartoes_amarelo = cartoes_amarelo;
    }

    public BigInteger getCartoes_vermelho() {
        return cartoes_vermelho;
    }

    public void setCartoes_vermelho(BigInteger cartoes_vermelho) {
        this.cartoes_vermelho = cartoes_vermelho;
    }
}
