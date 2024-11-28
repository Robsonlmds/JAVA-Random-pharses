package br.com.robsonlmds.random_pharses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robsonlmds.random_pharses.dto.FraseDTO;
import br.com.robsonlmds.random_pharses.service.FraseService;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }

}
