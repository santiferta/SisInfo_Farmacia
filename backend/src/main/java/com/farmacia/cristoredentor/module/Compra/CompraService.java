package com.farmacia.cristoredentor.module.Compra;

import com.farmacia.cristoredentor.module.Compra.dto.*;

import java.util.List;

public interface CompraService {
    OrdenCompraResponseDTO crearOrden(OrdenCompraCreateDTO dto);
    List<OrdenCompraResponseDTO> listarOrdenes();
    OrdenCompraResponseDTO obtenerOrdenPorId(Long id);
    OrdenCompraResponseDTO emitirOrden(Long id);
    RecepcionMercaderiaResponseDTO registrarRecepcion(RecepcionMercaderiaCreateDTO dto);
    List<RecepcionMercaderiaResponseDTO> listarRecepciones();
    RecepcionMercaderiaResponseDTO obtenerRecepcionPorId(Long id);
}
