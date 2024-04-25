package com.aluracursos.conversor.calculos;

import com.aluracursos.conversor.modulos.MonedasEx;
import com.aluracursos.conversor.modulos.MonedasExchange;
import com.google.gson.Gson;

public class Conversiones {
    private double USD;
    private double ARS;
    private double BRL;
    private double MXN;
    private String conversion_rates;
    private double convertido;

    public Conversiones(MonedasExchange monedas, int opcion, Double monto){
        Gson gson = new Gson();
        String conversion_rates = gson.toJson(monedas.conversion_rates());
//        return conversion_rates;
        conversionMonedas(gson.fromJson(conversion_rates, MonedasEx.class), opcion, monto);

    }

    private void conversionMonedas(MonedasEx monedasEx, int op, double valor) {
        this.USD = monedasEx.USD();
        this.ARS = monedasEx.ARS();
        this.BRL = monedasEx.BRL();
        this.MXN = monedasEx.MXN();
        String Origen;
        String Destino;

        Calculo calculo = new Calculo();
        switch (op){
            case 1:
                this.convertido = calculo.calcular(USD,MXN,valor);
                Origen = "Dolares";
                Destino = "Pesos Mexicanos";
                break;
            case 2:
                this.convertido = calculo.calcular(MXN,USD,valor);
                Origen = "Pesos Mexicanos";
                Destino = "Dolares";
                break;
            case 3:
                this.convertido = calculo.calcular(USD,ARS,valor);
                Origen = "Dolares";
                Destino = "Pesos Argentinos";
                break;
            case 4:
                this.convertido = calculo.calcular(ARS,USD,valor);
                Origen = "Pesos Argentinos";
                Destino = "Dolares";
                break;
            case 5:
                this.convertido = calculo.calcular(USD, BRL, valor);
                Origen = "Dolares";
                Destino = "Reales Brasileños";
                break;
            case 6:
                this.convertido = calculo.calcular(BRL,USD,valor);
                Origen = "Reales Brasileños";
                Destino = "Dolares";
                break;
            default:
                System.out.println("Eso no existe bro");
                Origen = "N/A";
                Destino = "N/A";
                break;

        }

        System.out.println("""
                💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰
                💰                                                                             💰
                💰   En valor de %.2f %s equivale a >>> %.2f %s          💰
                💰                                                                             💰
                💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰
                """.formatted(valor,Origen,convertido,Destino));
        System.out.println("             Presione una tecla para continuar...");


    }


}
