package com.farmacia.cristoredentor.module.ProductoProveedor.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoProveedorCreateDTO {

    private Long productoId;


    private Long proveedorId;

    private Boolean esPrincipal;
}