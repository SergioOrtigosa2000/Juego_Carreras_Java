/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Eleccion_vehiculo {
    //Declaración de variables.
    arrayCochesElegir arrayCochesElegir = new arrayCochesElegir();
    arrayCochesPolicia arrayCochesPolicia = new arrayCochesPolicia();
    Elegir_Longitud_Carretera elegir_longitud_carretera = new Elegir_Longitud_Carretera();
    Scanner teclado = new Scanner (System.in);
    int cocheElegido = 0;
    int cocheOponente = 0;
    
    //Método.
    public void eleccion_vehiculo (char opcionElegida){
        
        try {
            //Petición de coche por teclado.
            System.out.println("Por favor, elija un coche.");

            //Bucle para imprimir el array.
            for (int i=0; i<arrayCochesElegir.getArrayCochesElegir().length; i++) {
                System.out.println(i + ". " + arrayCochesElegir.getArrayCochesElegir ()[i].toString());
            }

            //Petición de coche por teclado.
            cocheElegido = teclado.nextInt();

            //Si coge un coche fuera del rango pedimos que elija otro.
            while (cocheElegido<0 || cocheElegido>arrayCochesElegir.getArrayCochesElegir().length-1) {
                System.out.println("Ese coche no existe, elija dentro del rango.");
                cocheElegido = teclado.nextInt();
            }

            //Switch para elegir el coche y passar a la siguiente pantalla.
            switch (opcionElegida) {
                case 'C':
                case 'c':
                    cocheOponente = (int) (Math.random()*arrayCochesElegir.getArrayCochesElegir().length);
                    elegir_longitud_carretera.elegir_longiitud_carretera(opcionElegida, arrayCochesElegir.getArrayCochesElegir()[cocheElegido], arrayCochesElegir.getArrayCochesElegir()[cocheOponente]);
                    break;
                case 'P':
                case 'p':
                    cocheOponente = (int) (Math.random()*arrayCochesPolicia.getArrayCochesPolicia().length);
                    elegir_longitud_carretera.elegir_longiitud_carretera(opcionElegida, arrayCochesElegir.getArrayCochesElegir()[cocheElegido], arrayCochesPolicia.getArrayCochesPolicia()[cocheOponente]);
                    break;
            }
        } catch (NumberFormatException e) {
            System.err.println("Solo puede meter números a la hora de elegir el coche.");
        }
    }
}
