package com.victordhein.MemesService;

import Categorias.CategoriasService.CategoriaMeme;
import Usuario.UsuariosService.Usuario;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date dataCadastro;

    @ManyToOne
    @JoinColumn(name = "categoria_meme_id")
    private CategoriaMeme categoriaMeme;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}