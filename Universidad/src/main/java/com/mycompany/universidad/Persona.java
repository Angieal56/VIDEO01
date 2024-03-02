/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

/**
 *
 * @author DELL
 */
public abstract class Persona {
    String nombre;
    String numeroTelefono;
    String correoElectronico;
    
    public Persona(String nombre, String numeroTelefono, String correoElectronico){
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }
    public abstract void comprarPaseEstacionamiento();
}
