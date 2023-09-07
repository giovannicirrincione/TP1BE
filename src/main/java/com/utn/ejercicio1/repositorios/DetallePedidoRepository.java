package com.utn.ejercicio1.repositorios;

import com.utn.ejercicio1.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido,Long> {
}
