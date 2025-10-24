package com.api.futebol.API_FUTEBOL.controller;
import com.api.futebol.API_FUTEBOL.model.Jogador;
import com.api.futebol.API_FUTEBOL.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping ("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    // Método para listar jogadores
    @GetMapping
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }
}
