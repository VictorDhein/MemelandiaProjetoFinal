package com.victordhein.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaMeme salvarCategoria(CategoriaMeme categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<CategoriaMeme> listarTodas() {
        return categoriaRepository.findAll();
    }
}