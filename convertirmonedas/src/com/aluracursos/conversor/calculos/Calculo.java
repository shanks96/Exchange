package com.aluracursos.conversor.calculos;

public class Calculo {
    private double convertido;

    public double calcular(double origen, double destino, double valor) {

        convertido = valor * destino / origen;

        return convertido;
    }
}
