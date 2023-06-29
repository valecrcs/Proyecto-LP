/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

public class Alumno extends Persona{
    //Atributos
    private String credencialesAlumno;
    private String carrera;
    
    //Constructor

    public Alumno(String credencialesAlumno, String carrera, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String correo) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, correo);
        this.credencialesAlumno = credencialesAlumno;
        this.carrera = carrera;
    }

    //Métodos FALTÓ CREAR ESTE:(
    public void inscribirAsig(String rut, String nombreAsig) {}
}
