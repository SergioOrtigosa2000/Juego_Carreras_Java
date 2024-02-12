/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class TramoRecorreOponente {
    double tramoRecorridoPorPasoOponente = 0;
    public double tramoRecorreOponente (Coche cocheOponente) {
        double maximaVelocidadEnMPS = ((cocheOponente.maxVelocidad*5)/18);
        tramoRecorridoPorPasoOponente = Math.random()*(maximaVelocidadEnMPS);
        return tramoRecorridoPorPasoOponente;
    }
}
