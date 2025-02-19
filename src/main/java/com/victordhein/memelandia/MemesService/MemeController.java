package com.victordhein.memelandia.MemesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class MemeController {
    @Autowired
    private MemeService memeService;

    @PostMapping
    public Meme novoMeme(@RequestBody Meme meme) {
        return memeService.salvarMeme(meme);
    }

    @GetMapping
    public List<Meme> listarMemes() {
        return memeService.listarTodos();
    }
}