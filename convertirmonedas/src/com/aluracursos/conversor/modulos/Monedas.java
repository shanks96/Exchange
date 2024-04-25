package com.aluracursos.conversor.modulos;

import com.aluracursos.conversor.calculos.Conversiones;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Monedas {
    private int opcion;
    private double monto;
    private String json;
    private String monedas;

    public Monedas(int opcion, Double monto) {
        Exchange obtenerExchance = new Exchange();

        try {
            json = obtenerExchance.Exchange();
            Gson gson = new GsonBuilder().create();
            MonedasExchange conversionExchange = gson.fromJson(json, MonedasExchange.class);
            Conversiones convertir = new Conversiones(conversionExchange, opcion, monto);
            //System.out.println(convertir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(json);
    }
}
