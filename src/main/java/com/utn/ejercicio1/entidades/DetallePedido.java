package com.utn.ejercicio1.entidades;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido extends BaseEntidad{
    private int cantidad;
    private double subtotal;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pedido_id")

    private Pedido esDe;
}
