/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.List;

public class Carrera {
    
    //Atributos
        
     private String nombreCarrera;

     private int duraciónSemestres;

     private String modalidad;
    
     //Constructor
    public Carrera(String nombreCarrera, int duraciónSemestres, String modalidad) {
        this.nombreCarrera = nombreCarrera;
        this.duraciónSemestres = duraciónSemestres;
        this.modalidad = modalidad;
    }
    
    //Getters y setters

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getDuraciónSemestres() {
        return duraciónSemestres;
    }

    public void setDuraciónSemestres(int duraciónSemestres) {
        this.duraciónSemestres = duraciónSemestres;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    //Métodos
    //Función para almacenar lista de carreras
    public static void addCarrera(List<Carrera> listaC, Carrera c){
        listaC.add(c);
    }
    
    //Función para imprimir por pantalla nombres de las carreras
    public static void mostrarCarreras(List <Carrera> listaC){
        for (Carrera c: listaC){
            System.out.println("Nombre: "+c.getNombreCarrera());
        }
    }
}
