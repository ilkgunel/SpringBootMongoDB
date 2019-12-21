package com.ilkaygunel.service;

import com.ilkaygunel.entity.Characters;
import com.ilkaygunel.repository.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharactersService {

    @Autowired
    private CharactersRepository charactersRepository;

    public void saveCharacter(Characters characters) {
        charactersRepository.save(characters);
    }

    public List<Characters> findAllCharacters() {
        return charactersRepository.findAll();
    }
}
