package com.farmacia.cristoredentor.module.Producto.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoUpdateDTO {
    private String nombre;
    private Long categoriaId;
    private String laboratorio;
    private String concentracion;
    private String presentacion;
    private BigDecimal precioCosto;
    private BigDecimal precioVenta;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private String clasificacionABC;
    private Boolean activo;
    
}
