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
public class Persecucion {
    //Método.
    public void persecucion (Coche cocheElegido, Coche cocheOponente, double longitudCarretera) {
        
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
        System.out.println("Evita que te alcance el policia.");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("¡YA!");        
        
        //Bucle carrera.
        while (distanciaRecorridaJugador < longitudCarretera && distanciaRecorridaOponente < distanciaRecorridaJugador && numVecesEstrellado < 3|| distanciaRecorridaOponente == 0 && distanciaRecorridaJugador == 0) {
                    
            //Aceleración jugador.
            System.out.println("Introduzca aceleración de 0 a 9 (0 nada de aceleración y 9 máxima aceleración).");
            aceleracionJugador = teclado.nextInt();
            
            if (aceleracionJugador > 9){
                aceleracionJugador = 9;
            }
            
            //Se llama a la función de recorrer el tramo.
            tramoRecorridoPorPasoJugador = tramoRecorreJugador.tramoRecorreJugador(cocheElegido, aceleracionJugador);
            
            //Si se estrella, se mostrará al jugador por pantalla.
            if (aceleracionJugador > 0 && tramoRecorridoPorPasoJugador<=0) {
                System.out.println("¡ESTRELLADO!");
                System.out.println("Consejo, no vayas siempre a la máxima velocidad.");
            } 
            
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
        
        //Se muestra el resultado.
        if (numVecesEstrellado >= 3) {
            System.out.println("¡DERROTA! Has destrozado tu coche.");
        } else {
            if(distanciaRecorridaJugador>=longitudCarretera) {
                System.out.println("¡VICTORIA! Has escapado del policia.");
            } else if (distanciaRecorridaOponente>=distanciaRecorridaJugador) {
                System.out.println("¡DERROTA! Has sido arrestado por el policia.");
            }
        }
        
    }
}
