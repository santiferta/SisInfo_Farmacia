package com.farmacia.cristoredentor.module.ProductoProveedor;

import com.farmacia.cristoredentor.module.ProductoProveedor.dto.*;
import com.farmacia.cristoredentor.module.ProductoProveedor.ProductoProveedorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto-proveedor")
public class ProductoProveedorController {

    private final ProductoProveedorService service;

    public ProductoProveedorController(
            ProductoProveedorService service) {

        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProductoProveedorResponseDTO>
            relacionar(
            @RequestBody
            ProductoProveedorCreateDTO dto) {

        return ResponseEntity.ok(
                service.relacionar(dto));
    }


    @GetMapping
        public ResponseEntity
                <List<ProductoProveedorResponseDTO>>
                listar() {
        
                return ResponseEntity.ok(
                        service.listar());
        }

        
    @GetMapping("/producto/{productoId}")
    public ResponseEntity
            <List<ProductoProveedorResponseDTO>>
            listarPorProducto(
            @PathVariable Long productoId) {

        return ResponseEntity.ok(
                service.listarPorProducto(
                        productoId));
    }

    @GetMapping("/proveedor/{proveedorId}")
    public ResponseEntity
            <List<ProductoProveedorResponseDTO>>
            listarPorProveedor(
            @PathVariable Long proveedorId) {

        return ResponseEntity.ok(
                service.listarPorProveedor(
                        proveedorId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>
            eliminarRelacion(
            @PathVariable Long id) {

        service.eliminarRelacion(id);

        return ResponseEntity.noContent()
                .build();
    }
}