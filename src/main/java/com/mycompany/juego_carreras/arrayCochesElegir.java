/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class arrayCochesElegir {
    public Coche[] getArrayCochesElegir () {
        
        //Lista coches a elegir.
        Coche ferrari = new Coche("Ferrari", "458 Italia", 320);
        Coche honda = new Coche("Honda", "Civic Type-R", 275);
        Coche nissan = new Coche("Nissan", "Skyline GT-R V-Spec 1993", 250);
        Coche toyota = new Coche("Toyota", "GT86", 225);
        Coche BMW1 = new Coche("BMW", " M3 E92", 315);
        Coche dodge1 = new Coche("Dodge", "Viper SRT 10 Coupé", 300);
        Coche mercedes = new Coche("Mercedes", "AMG GT", 316);
        Coche porsche = new Coche("Porsche", "911 Carrerra S", 308);
        Coche BMW2 = new Coche("BMW", "M3 E46", 250);
        Coche ford = new Coche("Ford", "Mustang", 262);
        Coche dodge2 = new Coche("Dodge", "Challenger", 312);
        
        //Declaración del array.
        Coche[] arrayCochesElegir = {ferrari, honda, nissan, toyota, BMW1, dodge1, mercedes, porsche, BMW2, ford, dodge2};
        
        //Devolución.
        return arrayCochesElegir;
    }
    
}
