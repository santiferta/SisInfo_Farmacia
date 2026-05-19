package com.farmacia.cristoredentor.module.Categoria;

import java.util.List;

import com.farmacia.cristoredentor.module.Categoria.dto.CategoriaCreateDTO;
import com.farmacia.cristoredentor.module.Categoria.dto.CategoriaResponseDTO;

public interface CategoriaService {
    CategoriaResponseDTO create(CategoriaCreateDTO dto);
    List<CategoriaResponseDTO> listar();

    CategoriaResponseDTO getById(Long id);

    CategoriaResponseDTO update(Long id, CategoriaCreateDTO dto);
    
    void delete(Long id);
} 
