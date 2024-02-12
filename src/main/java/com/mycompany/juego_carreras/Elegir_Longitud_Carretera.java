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
public class Elegir_Longitud_Carretera {
    
    //Declaración de variables.
    Scanner teclado = new Scanner (System.in);
    double metrosCarretera = 0;
    Carrera carrera = new Carrera();
    Persecucion persecucion = new Persecucion();
    
    public void elegir_longiitud_carretera (char opcionElegida, Coche cocheJugador, Coche cocheOponente) {
        
        //Petición de longitud de carretera por teclado.
        System.out.println("Por favor, indique la longitud de la carretera en metros (entre 100 metros y 10 kilometros).");
        metrosCarretera = teclado.nextInt();
        
        //Corte para la longitud.
        if(metrosCarretera<100) {
            metrosCarretera = 100;
        } else if (metrosCarretera>10000) {
            metrosCarretera = 10000;
        }
        
        //Switch para elegir el coche.
        switch (opcionElegida) {
            case 'C':
            case 'c':
                carrera.carrera(cocheJugador, cocheOponente, metrosCarretera);
                break;
            case 'P':
            case 'p':
                persecucion.persecucion(cocheJugador, cocheOponente, metrosCarretera);
                break;
        }
    }
}
