package com.um.ejercicio_2_1to1Uni.repositorios;

import com.um.ejercicio_2_1to1Uni.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
