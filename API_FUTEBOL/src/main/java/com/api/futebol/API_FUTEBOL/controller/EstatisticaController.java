package com.api.futebol.API_FUTEBOL.controller;

import com.api.futebol.API_FUTEBOL.model.Estatistica;
import com.api.futebol.API_FUTEBOL.repository.EstatisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {

    @Autowired
    public EstatisticaRepository estatisticaRepository;

    @GetMapping
    public List<Estatistica> getAllestatistica(){return estatisticaRepository.findAll();}
}
