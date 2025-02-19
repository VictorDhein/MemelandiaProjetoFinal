package com.victordhein.memelandia.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoria) {
        return categoriaService.salvarCategoria(categoria);
    }

    @GetMapping
    public List<CategoriaMeme> listarCategorias() {
        return categoriaService.listarTodas();
    }
}