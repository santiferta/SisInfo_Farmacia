package com.farmacia.cristoredentor.module.ProductoProveedor;

import com.farmacia.cristoredentor.Entity.Producto;
import com.farmacia.cristoredentor.Entity.ProductoProveedor;
import com.farmacia.cristoredentor.Entity.Proveedor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoProveedorRepository
        extends JpaRepository<ProductoProveedor, Long> {

    List<ProductoProveedor> findByProducto(
            Producto producto);

    List<ProductoProveedor> findByProveedor(
            Proveedor proveedor);

    ProductoProveedor findByProductoAndEsPrincipalTrue(
            Producto producto);
}