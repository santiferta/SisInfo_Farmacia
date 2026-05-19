package com.farmacia.cristoredentor.module.Producto.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private String categoriaNombre;
    private String laboratorio;
    private String concentracion;
    private String presentacion;
    private BigDecimal precioCosto;
    private BigDecimal precioVenta;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private String clasificacionABC;
    private Integer stockTotal;
    private boolean activo;
    
}
