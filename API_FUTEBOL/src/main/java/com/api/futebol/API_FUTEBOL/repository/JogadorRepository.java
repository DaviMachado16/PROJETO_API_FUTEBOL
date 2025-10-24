package com.api.futebol.API_FUTEBOL.repository;
import com.api.futebol.API_FUTEBOL.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Integer > {
}
