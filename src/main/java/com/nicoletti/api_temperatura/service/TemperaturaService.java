package com.nicoletti.api_temperatura.service;

import org.springframework.stereotype.Service;

import com.nicoletti.api_temperatura.dto.ConversaoTemperatura;
import com.nicoletti.api_temperatura.dto.ResultadoTemperatura;

@Service
public class TemperaturaService {

    public ResultadoTemperatura converter(ConversaoTemperatura conversao) {

        double temperatura = conversao.getTemperatura();

        String de = conversao.getDe().toUpperCase();
        String para = conversao.getPara().toUpperCase();

        double resultado;

        if (de.equals(para)) {

            resultado = temperatura;

        } else if (de.equals("CELSIUS") && para.equals("FAHRENHEIT")) {

            resultado = (temperatura * 9.0 / 5.0) + 32;

        } else if (de.equals("FAHRENHEIT") && para.equals("CELSIUS")) {

            resultado = (temperatura - 32) * 5.0 / 9.0;

        } else if (de.equals("CELSIUS") && para.equals("KELVIN")) {

            resultado = temperatura + 273.15;

        } else if (de.equals("KELVIN") && para.equals("CELSIUS")) {

            resultado = temperatura - 273.15;

        } else if (de.equals("FAHRENHEIT") && para.equals("KELVIN")) {

            resultado = (temperatura - 32) * 5.0 / 9.0 + 273.15;

        } else if (de.equals("KELVIN") && para.equals("FAHRENHEIT")) {

            resultado = (temperatura - 273.15) * 9.0 / 5.0 + 32;

        } else {
            throw new IllegalArgumentException("Unidade de temperatura inválida.");
        }

        return new ResultadoTemperatura(resultado, para);
    }
}
