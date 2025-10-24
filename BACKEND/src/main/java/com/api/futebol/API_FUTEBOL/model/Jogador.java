package com.api.futebol.API_FUTEBOL.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name= "id")
    private Integer id;

    @Column(name= "nomeCompleto", length = 200, nullable = false, unique = true)
    private String nome_completo;

    @Column(name= "apelido", length = 100, nullable = false)
    private String apelido;

    @Column(name= "dataNascimento", nullable = false)
    private LocalDateTime data_nascimento;

    @Column(name= "nacionalidade", length = 100, nullable = false)
    private String nacionalidade;

    @Column(name= "altura", nullable = false)
    private Double altura;



}
