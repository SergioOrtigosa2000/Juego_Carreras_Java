/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_carreras;

/**
 *
 * @author Sergio
 */
public class Coche {
    //Declaración variables.
    protected String marca;
    protected String modelo;
    protected int maxVelocidad;
    
    //Constructor.
    public Coche(String marca, String modelo, int maxVelocidad) {
        this.marca=marca;
        this.modelo=modelo;
        this.maxVelocidad=maxVelocidad;
    }
    
    //Getters.
    public String getMarca () {
        return marca;
    }
    
    public String getModelo () {
        return modelo;
    }
    
    public int getMaxVelocidad (){
        return maxVelocidad;
    }
    
    //Setters.
    public void setMarca(String marca) {
        this.marca=marca;
    }
    
    public void setModelo () {
        this.modelo=modelo;
    }
    
    public void setMaxVelocidad (){
        this.maxVelocidad=maxVelocidad;
    }
    
    public String toString() {
        return "Marca: " + this.marca + ", modelo: " + this.modelo + ", velocidad máxima: " + this.maxVelocidad;
    }
            
}
