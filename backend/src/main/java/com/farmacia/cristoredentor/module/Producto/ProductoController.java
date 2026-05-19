package com.farmacia.cristoredentor.module.Producto;

import com.farmacia.cristoredentor.Entity.Producto;
import com.farmacia.cristoredentor.module.Producto.dto.*;
import com.farmacia.cristoredentor.module.Categoria.CategoriaRepository;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService service;
    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProductoResponseDTO> crear(@Valid @RequestBody ProductoCreateDTO productoCreateDTO) {
        ProductoResponseDTO producto = service.crear(productoCreateDTO);
        return ResponseEntity.ok(producto);
    }

    @GetMapping
    public ResponseEntity<List<ProductoResponseDTO>> listar() {
        List<ProductoResponseDTO> productos = service.listar();
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponseDTO> obtenerPorId(@PathVariable Long id) {
        ProductoResponseDTO producto = service.obtenerPorId(id);
        return ResponseEntity.ok(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoResponseDTO> actualizar(@PathVariable Long id, @Valid @RequestBody ProductoUpdateDTO productoUpdateDTO) {
        ProductoResponseDTO producto = service.actualizar(id, productoUpdateDTO);
        return ResponseEntity.ok(producto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/clasificar-abc")
    public ResponseEntity<Void> clasificarABC() {
        service.clasificarABC();
        return ResponseEntity.ok().build();
    }
}
