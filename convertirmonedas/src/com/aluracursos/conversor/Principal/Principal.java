package com.aluracursos.conversor.Principal;

import com.aluracursos.conversor.modulos.Monedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double monto;


        while(true) {
            System.out.println("""
                    
                    
                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                    🤑🤑🤑                             🤑🤑🤑
                    🤑🤑🤑    Conversor de divisas     🤑🤑🤑
                    🤑🤑🤑                             🤑🤑🤑
                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                                    
                    1) 🇺🇸 Dolar =>> 🇲🇽 Peso Mexicano
                    2) 🇲🇽 Peso Mexicano =>> 🇺🇸 Dolar 
                    3) 🇺🇸 Dolar =>> 🇦🇷 Peso Argentino
                    4) 🇦🇷 Peso Argentino =>> 🇺🇸 Dolar
                    5) 🇺🇸 Dolar =>> 🇧🇷 Real Brasileño
                    6) 🇧🇷 Real Brasileño =>> 🇺🇸 Dolar
                    7) Salir
                    
                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                                    
                    Escoge una opción:
                    """);

            int opcion = teclado.nextInt();

            if (opcion == 7){
                break;
            } else if (opcion > 7 || opcion < 1){
                System.out.println("Opción no valida, intente de nuevo");
            } else {
                System.out.println("Ingresa el monto a convertir:");
                monto = teclado.nextDouble();
                Monedas convertir = new Monedas(opcion,monto);
                teclado.next();
            }


        }
    }
}
