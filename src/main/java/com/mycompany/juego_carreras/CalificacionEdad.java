/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class CalificacionEdad {
    public int edadMinimaRecomendada;
    
    public CalificacionEdad(int edadMinimaRecomendada) {
        this.edadMinimaRecomendada=edadMinimaRecomendada;
    }
    
    public String mostrarCalificacionEdad() {
        String devuelve = "";
        if (this.edadMinimaRecomendada>0 && this.edadMinimaRecomendada<=18) {
            devuelve = "No recomendado para menores de " + this.edadMinimaRecomendada + " años.";
        } else if (this.edadMinimaRecomendada==0){
            devuelve = "Apto para todos los públicos";
        } else {
            System.err.println("La edad no es valida");
            System.exit(0);
        }
        return devuelve;
    }
}
