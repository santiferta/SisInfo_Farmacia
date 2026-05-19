package com.farmacia.cristoredentor.module.Producto;
import com.farmacia.cristoredentor.Entity.Producto;
import com.farmacia.cristoredentor.module.Producto.dto.*; 
import java.util.List;


public interface ProductoService {
    ProductoResponseDTO crear(ProductoCreateDTO productoCreateDTO);
    List<ProductoResponseDTO> listar();
    ProductoResponseDTO obtenerPorId(Long id);
    ProductoResponseDTO actualizar(Long id, ProductoUpdateDTO productoUpdateDTO);
    void eliminar(Long id);
    void clasificarABC();
}
