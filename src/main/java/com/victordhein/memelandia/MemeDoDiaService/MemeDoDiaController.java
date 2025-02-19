package com.victordhein.memelandia.MemeDoDiaService;

import com.victordhein.memelandia.MemesService.Meme;
import com.victordhein.memelandia.MemesService.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
import java.util.List;

@RestController
@RequestMapping("/meme-do-dia")
public class MemeDoDiaController {
    @Autowired
    private MemeService memeService;

    @GetMapping
    public Meme memeDoDia() {
        List<Meme> memes = memeService.listarTodos();
        if (memes.isEmpty()) {
            throw new RuntimeException("Nenhum meme encontrado");
        }
        Random random = new Random();
        return memes.get(random.nextInt(memes.size()));
    }
}