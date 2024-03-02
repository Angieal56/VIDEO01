/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

/**
 *
 * @author DELL
 */
class Estudiante extends Persona{
    private String numeroEstudiante;
    public double notaMedia;
    
    public Estudiante(String nombre, String numeroTelefono); String correoElectronico,String numeroEstudiante,double notaMedia){
        super(nombre,numeroTelefono,correoElectronico);
        this.numeroEstudiante= numeroEstudiante;
        this.notaMedia= notaMedia;
}

    @Override
    public void comprarPaseEstacionamiento() {
        System.out.printIn(nombre+"ha comprado un pase de estacionamiento");
    }
    public void estudiar(String asignatura){
        System.out.println(nombre+ "esta estudiando"+asignatura+".");
    }
    public void estudiar(String asignatura, int horas){
        System.out.printIn(nombre+"esta estudiando"+asignatura+"durante"+horas+"horas.");
    }
}
