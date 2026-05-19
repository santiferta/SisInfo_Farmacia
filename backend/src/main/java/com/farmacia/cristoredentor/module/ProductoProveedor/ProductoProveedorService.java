package com.farmacia.cristoredentor.module.ProductoProveedor;

import com.farmacia.cristoredentor.module.ProductoProveedor.dto.*;

import java.util.List;

public interface ProductoProveedorService {

    ProductoProveedorResponseDTO relacionar(
            ProductoProveedorCreateDTO dto);

    List<ProductoProveedorResponseDTO>
            listarPorProducto(Long productoId);

    List<ProductoProveedorResponseDTO>
            listarPorProveedor(Long proveedorId);

    void eliminarRelacion(Long id);

    List<ProductoProveedorResponseDTO> listar();
}