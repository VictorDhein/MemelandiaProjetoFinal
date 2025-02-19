package com.victordhein.memelandia.CategoriasService;

import jakarta.persistence.*;

@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
}