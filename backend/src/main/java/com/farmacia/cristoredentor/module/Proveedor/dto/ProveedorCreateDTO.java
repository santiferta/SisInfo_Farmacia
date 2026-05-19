package com.farmacia.cristoredentor.module.Proveedor.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorCreateDTO {

    @NotBlank(message = "El nombre del proveedor es obligatorio")
    private String nombre;

    private String contactoNombre;

    @NotBlank(message = "El número de teléfono del proveedor es obligatorio")
    private String telefono;

    @NotBlank(message = "El correo electrónico del proveedor es obligatorio")
    @Email(message = "El correo electrónico no es válido")
    private String email;

    private String direccion;

}

