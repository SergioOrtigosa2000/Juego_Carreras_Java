/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class arrayCochesPolicia {
    public Coche[] getArrayCochesPolicia () {
        //Lista coches de policia.
        Coche BMW = new Coche("BMW","M8 Competition", 330);
        Coche audi = new Coche("Audi","A5", 290);
        Coche mercedes = new Coche("Mercedes-benz", "Clase c", 280);
        Coche lamborghini = new Coche("Lamborghini", "Veneno", 355);
        
        //Declaración de array.
        Coche[] arrayCochesPolicia = {BMW, audi, mercedes, lamborghini};
        
        //Devolución.
        return arrayCochesPolicia;
    }
}
