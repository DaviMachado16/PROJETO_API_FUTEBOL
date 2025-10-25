package com.api.futebol.API_FUTEBOL.controller;

import com.api.futebol.API_FUTEBOL.model.JogadorClube;
import com.api.futebol.API_FUTEBOL.repository.JogadorClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogadoresclube")
public class JogadorClubeController {

    @Autowired
    private JogadorClubeRepository jogadorClubeRepository;

    @GetMapping
    public List<JogadorClube> getAllJogadorClube() {
        return jogadorClubeRepository.findAll();
    }
}
