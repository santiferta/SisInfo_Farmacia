package com.farmacia.cristoredentor.module.Compra;

import com.farmacia.cristoredentor.Entity.RecepcionMercaderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionMercaderiaRepository extends JpaRepository<RecepcionMercaderia, Long> {
}
