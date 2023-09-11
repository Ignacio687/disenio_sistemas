package com.um.ejercicio_2_1to1Uni.repositorios;

import com.um.ejercicio_2_1to1Uni.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
