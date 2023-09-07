package com.utn.ejercicio1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido extends BaseEntidad {
    private String Estado;
    private Date fecha;
    private String tipoEnvio;
    private Double total;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name="pedido_id")
    @Builder.Default

    private List <DetallePedido> detalles = new ArrayList<>();
    @OneToOne(mappedBy = "esDe")
    private DetallePedido detallePedido;
}
