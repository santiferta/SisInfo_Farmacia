package com.farmacia.cristoredentor.module.Proveedor.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorUpdateDTO {
    private String nombre;
    private String contactoNombre;
    private String telefono;
    private String email;
    private String direccion;   
    private boolean activo;
}
