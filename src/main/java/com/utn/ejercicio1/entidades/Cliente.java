package com.utn.ejercicio1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente extends BaseEntidad {
    private String nombre;

    private String apellido;
    private int edad;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name="cliente_id")

    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregardomicilios(Domicilio domi){
        domicilios.add(domi);
    }

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="cliente_id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

}
