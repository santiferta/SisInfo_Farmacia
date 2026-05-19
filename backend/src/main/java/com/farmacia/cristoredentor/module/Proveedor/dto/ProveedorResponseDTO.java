package com.farmacia.cristoredentor.module.Proveedor.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
public class ProveedorResponseDTO {
    private Long id;
    private String nombre;
    private String contactoNombre;
    private String telefono;    
    private String email;
    private String direccion;
    private boolean activo;
}
