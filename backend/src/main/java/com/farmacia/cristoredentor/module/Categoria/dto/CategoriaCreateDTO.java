package com.farmacia.cristoredentor.module.Categoria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaCreateDTO {
    private String nombre;
    private String descripcion;
}
