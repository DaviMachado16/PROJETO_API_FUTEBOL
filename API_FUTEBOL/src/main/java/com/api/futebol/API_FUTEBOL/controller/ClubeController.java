package com.api.futebol.API_FUTEBOL.controller;

import com.api.futebol.API_FUTEBOL.model.Clube;
import com.api.futebol.API_FUTEBOL.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clube")
public class ClubeController {

    @Autowired
    public ClubeRepository clubeRepository;

    @GetMapping
    public List<Clube> getAllclube(){return clubeRepository.findAll();}
}
