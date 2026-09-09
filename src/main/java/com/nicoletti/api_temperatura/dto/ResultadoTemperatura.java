package com.nicoletti.api_temperatura.dto;

public class ResultadoTemperatura {

    private double temperatura;
    private String unidade;

    public ResultadoTemperatura(double temperatura, String unidade) {
        this.temperatura = temperatura;
        this.unidade = unidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
