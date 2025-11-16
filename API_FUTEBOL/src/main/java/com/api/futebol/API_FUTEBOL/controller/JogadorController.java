package com.api.futebol.API_FUTEBOL.controller;
import com.api.futebol.API_FUTEBOL.model.Jogador;
import com.api.futebol.API_FUTEBOL.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @GetMapping
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }
}
