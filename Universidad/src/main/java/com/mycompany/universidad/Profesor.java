/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

/**
 *
 * @author DELL
 */
class Profesor extends Persona {
    private double salario;
    
    public Profesor(String nombre, String numeroTelefono, String correoElectronico, double salario){
        super(nombre, numeroTelefono, correoElectronico);
        this.salario = salario
    }

    @Override
    public void comprarPaseEstacionamiento() {
        System.out.printIn(nombre+"ha comprado un pase de estacionamiento.");
    }
    public void darClase(String asignatura){
        System.out.printIn(nombre+"esta dando clase de.."
        asignatura+".");
    }
}
