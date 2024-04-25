# Exchange (Conversor de Divisas)
Challege No 1 para BackEnd del programa ONE G6

## 🏁 Introducción 🏁

Esta es mi solución a el primer desafío del programa para BackEnd de ONE G6, el challenge, consiste en desplegar un menú de usuario el cual le mostrará las posibles conversiones de monedas.
Justo después de la ventana principal, pasamos a consultar desde la API de https://www.exchangerate-api.com/, para obtener el valor actual de las divisas. Se seleccionan las Monedas que se usan en el menú principal. Una vez obtenias se procede a convertir el monto dado por el usuario para después mostrar la equivalencia de las monedas. A continuación se comenta el procedimiento realizado para resolver este challenge. Aclaro que aún no he implementado los extras, así que esto no se considera de ninguna manera una versión final del proyecto.

Dividiremos la explicación en las siguientes etapas:
1. Menú principal
2. Consulta de divisas vía API
3. Obtención de monedas necesarias
   1. JSON de exchange
   2. Extracción de conversion_rates
   3. Extracción de monedas
5. Conversión
6. Conclusiones

## 1. Menú principal 📝
El menú pricipal se genera con un sout y un Scanner



                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                    🤑🤑🤑                             🤑🤑🤑
                    🤑🤑🤑    Conversor de divisas     🤑🤑🤑
                    🤑🤑🤑                             🤑🤑🤑
                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                                    
                    1) 🇺🇸 Dolar =>> 🇲🇽 Peso Mexicano
                    2) 🇲🇽 Peso Mexicano =>> 🇺🇸 Dolar 
                    3) 🇺🇸 Dolar =>> 🇦🇷 Peso Argentino
                    4) 🇦🇷 Peso Argentino =>> 🇺🇸 Dolar
                    5) 🇺🇸 Dolar =>> 🇧🇷 Real Brasileño
                    6) 🇧🇷 Real Brasileño =>> 🇺🇸 Dolar
                    7) Salir
                    
                    🤑🤑🤑💰💰💰💰💰💰💰💰💰💰💰💰💰🤑🤑🤑
                                    
                    Escoge una opción:


Para evitar que el usuario introduzca una opción distinta a las mostradas se utiliza sentencias **if else**


            if (opcion == 7){
                break;
            } else if (opcion > 7 || opcion < 1){
                System.out.println("Opción no valida, intente de nuevo");
            } else {
                //Pedir monto a convertir y convertirlo
            }
