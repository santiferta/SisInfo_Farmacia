package com.farmacia.cristoredentor.module.Proveedor;
import com.farmacia.cristoredentor.module.Proveedor.dto.*;
import java.util.List;

public interface ProveedorService {

    ProveedorResponseDTO crear(ProveedorCreateDTO dto);
    List<ProveedorResponseDTO> listar();
    ProveedorResponseDTO obtenerPorId(Long id);
    ProveedorResponseDTO actualizar(Long id, ProveedorUpdateDTO dto);
    void eliminar(Long id);
}
