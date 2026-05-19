package com.farmacia.cristoredentor.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orden_compra_detalle", schema = "farmacia")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCompraDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orden_compra_id", nullable = false)
    private OrdenCompra ordenCompra;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @Column(name = "cantidad_solicitada", nullable = false)
    private Integer cantidadSolicitada;

    @Column(name = "costo_unitario")
    private BigDecimal costoUnitario;

    @Column(name = "cantidad_recibida", nullable = false)
    private Integer cantidadRecibida;
}
