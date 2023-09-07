package com.utn.ejercicio1.repositorios;

import com.utn.ejercicio1.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
