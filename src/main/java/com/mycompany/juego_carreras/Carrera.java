/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Carrera {
    //Método.
    public void carrera (Coche cocheElegido, Coche cocheOponente, double longitudCarretera) {
        
        //Declaración variables.
        Scanner teclado = new Scanner (System.in);
        TramoRecorreJugador tramoRecorreJugador = new TramoRecorreJugador();
        TramoRecorreOponente tramoRecorreOponente = new TramoRecorreOponente();
        int numVecesEstrellado = 0;
        double distanciaRecorridaJugador = 0;
        double distanciaRecorridaOponente = 0;
        double tramoRecorridoPorPasoJugador = 0;
        double tramoRecorridoPorPasoOponente = 0;
        int aceleracionJugador = 0;
        DecimalFormat df = new DecimalFormat("#.00");
        
        //Muestra datos por pantalla.
        if(longitudCarretera>1000) {
            System.out.println("Longitud de la carretera: " + longitudCarretera/1000 + " kilometros.");
        } else {
            System.out.println("Longitud de la carretera: " + longitudCarretera + " metros.");
        }
        
        System.out.println("Tu coche: " + cocheElegido.marca + " " + cocheElegido.modelo + " velocidad máxima: " + cocheElegido.maxVelocidad);
        System.out.println("Coche oponente: " + cocheOponente.marca + " " + cocheOponente.modelo + " velocidad máxima: " + cocheOponente.maxVelocidad);
        
        //Salida.
        System.out.println("Llega antes que tu oponente a la meta.");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("¡YA!");
        
        //Bucle carrera.
        while (distanciaRecorridaJugador < longitudCarretera && distanciaRecorridaOponente < longitudCarretera && numVecesEstrellado < 3) {
            
            //Aceleración jugador.
            System.out.println("Introduzca aceleración de 0 a 9 (0 nada de aceleración y 9 máxima aceleración).");
            aceleracionJugador = teclado.nextInt();
            
            //Se llama a la función de recorrer el tramo.
            tramoRecorridoPorPasoJugador = tramoRecorreJugador.tramoRecorreJugador(cocheElegido, aceleracionJugador);
            
            //Si se estrella, se mostrará al jugador por pantalla.
            if (aceleracionJugador > 0 && tramoRecorridoPorPasoJugador<=0) {
                System.out.println("¡ESTRELLADO!");
                System.out.println("Consejo, no vayas siempre a la máxima velocidad.");
                numVecesEstrellado++;
            } 
            
            //Se sumaria al tramo recorrido.
            distanciaRecorridaJugador += tramoRecorridoPorPasoJugador;
            
            if(distanciaRecorridaJugador>1000) {
                System.out.println("Has recorrido " + df.format(distanciaRecorridaJugador/1000) + " km.");
            } else {
                System.out.println("Has recorrido " + df.format(distanciaRecorridaJugador) + " m.");
            }
            
            //Recorrido oponente.
            tramoRecorridoPorPasoOponente = tramoRecorreOponente.tramoRecorreOponente(cocheOponente);
            
            distanciaRecorridaOponente += tramoRecorridoPorPasoOponente;
            
            if(distanciaRecorridaOponente>1000) {
                System.out.println("Tu oponente ha recorrido " + df.format(distanciaRecorridaOponente/1000) + " km.");
            } else {
                System.out.println("Tu oponente ha recorrido " + df.format(distanciaRecorridaOponente) + " m.");
            }
        }
        
        //Se muestra el ganador.
        if(numVecesEstrellado>=3) {
            System.out.println("¡DERROTA! Has destrozado tu coche.");
        } else {
            if(distanciaRecorridaJugador>distanciaRecorridaOponente) {
                System.out.println("¡VICTORIA! Has ganado la carrera.");
            } else if (distanciaRecorridaJugador<distanciaRecorridaOponente) {
                System.out.println("¡DERROTA! Has perdido la carrera.");
            } else {
                System.out.println("¡EMPATE! Has quedado en empate.");
            }
        }
    }
}
