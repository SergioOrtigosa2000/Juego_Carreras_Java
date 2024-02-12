/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class TramoRecorreJugador {
    double tramoRecorridoPorPasoJugador = 0;
    double maximaDistanciaRecorridaJugador = 0;
    double minimaDistanciaRecorridaJugador = 0;
    int estrellado = 0;
    public double tramoRecorreJugador(Coche cocheElegido, int aceleracionJugador) {
        double maximaVelocidadEnMPS = ((cocheElegido.maxVelocidad*5)/18);
        if (aceleracionJugador > 9){
            aceleracionJugador = 9;
        }

        //Recorrido jugador.
        maximaDistanciaRecorridaJugador = ((maximaVelocidadEnMPS)/9)*(aceleracionJugador);
        minimaDistanciaRecorridaJugador = ((maximaVelocidadEnMPS)/9)*(aceleracionJugador-1);
        
        if (aceleracionJugador>0) {
            tramoRecorridoPorPasoJugador = (Math.random() * (maximaDistanciaRecorridaJugador - minimaDistanciaRecorridaJugador)) + minimaDistanciaRecorridaJugador;
            estrellado = (int) (Math.random()*aceleracionJugador);
            if (estrellado>=6) {
                tramoRecorridoPorPasoJugador = 0;
            }
        } else {
            tramoRecorridoPorPasoJugador = 0;
        }
        
        //Devolvemos el tramo.
        return tramoRecorridoPorPasoJugador;
    }
}
