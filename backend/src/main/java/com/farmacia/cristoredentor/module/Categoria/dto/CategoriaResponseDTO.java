package com.farmacia.cristoredentor.module.Categoria.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoriaResponseDTO {
    private Long id;
    private String nombre;
    private String descripcion;     
    private Boolean activo;
}
