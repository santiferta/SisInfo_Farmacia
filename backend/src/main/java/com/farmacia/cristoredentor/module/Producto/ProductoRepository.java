package com.farmacia.cristoredentor.module.Producto;

import com.farmacia.cristoredentor.Entity.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByActivoTrue();
    List<Producto> findByNombreIgnoringCase(String nombre);
    List<Producto> findByCategoriaId(Long categoriaId);
    List<Producto> findByLaboratorioIgnoringCase(String laboratorio);
    List<Producto> findByClasificacionABC(String clasificacionABC);
}
