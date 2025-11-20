package br.com.fatec.api_filosofia.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FilosofiaController {

    @GetMapping("/frases")
    public List<String> frases() {
        return Arrays.asList(
            "Tudo sei, mas não sei que eu sei",
            "Penso, logo existo",
            "A vida é bela"
        );
    }
    
    @GetMapping("/filosofos")
    public List<String> filosofos() {
        return Arrays.asList(
            "Leonardo da Vinci",
            "Sócrates",
            "Platão",
            "Aristóteles"
        );
    }
    
    @GetMapping("/livros")
    public List<String> livros() {
        return Arrays.asList(
            "The complete paintings in detail",
            "A República",
            "Ética a Nicômaco"
        );
    }
}