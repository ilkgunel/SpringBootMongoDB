package com.ilkaygunel.api;

import com.ilkaygunel.entity.Characters;
import com.ilkaygunel.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/characters")
public class CharactersApi {

    @Autowired
    private CharactersService characterService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity<String> postCharacter(@RequestBody Characters characters) {
        characterService.saveCharacter(characters);
        return new ResponseEntity<>("Kayıt İşlemi Başarılı!", HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Characters>> allCharacters() {
        List<Characters> characters = characterService.findAllCharacters();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }
}
