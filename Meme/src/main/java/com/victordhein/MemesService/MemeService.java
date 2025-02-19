package com.victordhein.MemesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemeService {
    @Autowired
    private MemeRepository memeRepository;

    public Meme salvarMeme(Meme meme) {
        return memeRepository.save(meme);
    }

    public List<Meme> listarTodos() {
        return memeRepository.findAll();
    }
}