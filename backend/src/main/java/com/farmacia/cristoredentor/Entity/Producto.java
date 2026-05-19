package com.farmacia.cristoredentor.Entity;

import com.farmacia.cristoredentor.Entity.Categoria;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "producto", schema = "farmacia")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @Column(name = "laboratorio", nullable = false)
    private String laboratorio;

    @Column(name = "concentracion", nullable = false)
    private String concentracion;

    @Column(name = "presentacion", nullable = false)
    private String presentacion;

    @Column(name = "precio_costo", nullable = false)
    private BigDecimal precioCosto;

    @Column(name = "precio_venta", nullable = false)
    private BigDecimal precioVenta;

    @Column(name = "stock_minimo", nullable = false)
    private Integer stockMinimo;

    @Column(name = "stock_maximo", nullable = false)
    private Integer stockMaximo;

    @Column(name = "clasificacion_abc", nullable = false)
    private String clasificacionABC;

    @Column(name = "stock_total", nullable = false )
    private Integer stockTotal;

    @Column(name = "activo", nullable = false)
    private boolean activo;

    @OneToMany(mappedBy = "producto")
    private java.util.List<ProductoProveedor> proveedores;
}
