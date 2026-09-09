package com.nicoletti.api_temperatura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicoletti.api_temperatura.dto.ConversaoTemperatura;
import com.nicoletti.api_temperatura.dto.ResultadoTemperatura;
import com.nicoletti.api_temperatura.service.TemperaturaService;

@RestController
@RequestMapping("/temperaturas")
public class TemperaturaController {

    @Autowired
    private TemperaturaService servico;

    @PostMapping("/converter")
    public ResultadoTemperatura converter(@RequestBody ConversaoTemperatura conversao) {
        return servico.converter(conversao);
    }
}
