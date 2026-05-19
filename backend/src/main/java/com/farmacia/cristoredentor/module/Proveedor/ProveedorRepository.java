package com.farmacia.cristoredentor.module.Proveedor;

import com.farmacia.cristoredentor.Entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    Optional<Proveedor> findByNombre(String nombre);
    List<Proveedor> findByActivoTrue();
    List<Proveedor> findByNombreIgnoringCase(String nombre);
    
}
