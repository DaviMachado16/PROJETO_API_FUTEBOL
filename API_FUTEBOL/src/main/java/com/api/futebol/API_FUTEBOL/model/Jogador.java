package com.api.futebol.API_FUTEBOL.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

//DEFININDO COMO ENTIDADE DO BANCO
@Entity
@Table(name="jogador")
public class Jogador {

    //ID = PRIMARY KEY
    //GENERATED VALUE = GERAR ID AUTOMÁTICO
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

    @Column(name= "peso", nullable = false)
    private Double peso;

    @Column(name= "posicao", length = 20, nullable = false)
    private String posicao;

    @Column(name= "fotoUrl", length = 250, nullable = false)
    private String foto_url;

    //GETTERS E SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }
}
