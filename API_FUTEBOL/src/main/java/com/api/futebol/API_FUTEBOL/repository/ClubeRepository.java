package com.api.futebol.API_FUTEBOL.repository;

import com.api.futebol.API_FUTEBOL.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubeRepository extends JpaRepository<Clube, Integer> {
}
