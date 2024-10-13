/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego_carreras;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Pantalla_principal {

    public static void main(String[] args) {
        //Declaración de variables.
        CalificacionEdad calificacionEdad = new CalificacionEdad(12);
        Scanner teclado = new Scanner(System.in);
        Eleccion_vehiculo eleccion_vehiculo = new Eleccion_vehiculo();
        
        try {
            System.out.println(calificacionEdad.mostrarCalificacionEdad());
            Thread.sleep(5000);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
        try {
        
            //Menú principal en pantalla
            System.out.println("Elija una opción:");
            System.out.println("(C)arrera");
            System.out.println("(P)ersecución");
            System.out.println("(S)alir");

            //Petición de opción.
            char opcion = teclado.next().charAt(0);

            //Comprobación de la opción.
            switch (opcion) {
                case 'C':
                case 'c':
                case 'P':
                case 'p':
                    eleccion_vehiculo.eleccion_vehiculo(opcion);
                    break;
                case 'S':
                case 's':
                    System.out.println("Que tenga un buen dia.");
                    break;
                default:
                    System.out.println("Esa opción es inexistente.");
            }
        
        } catch (Exception e) {
            System.err.print("Fallo al arrancar el juego. Cod:" + e);
        }
    }
}
