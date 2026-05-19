package com.farmacia.cristoredentor.module.ProductoProveedor.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductoProveedorResponseDTO {

    private Long id;

    private String productoNombre;

    private String proveedorNombre;

    private Boolean esPrincipal;
}