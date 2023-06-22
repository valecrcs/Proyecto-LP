/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Ayudante extends Persona{
    //Atributos

    private int hrsAyudantia;
    
    //Constructor
    public Ayudante(int hrsAyudantia, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String correo) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, correo);
        this.hrsAyudantia = hrsAyudantia;
    }
    
    //Getters y setters

    public int getHrsAyudantia() {
        return hrsAyudantia;
    }

    public void setHrsAyudantia(int hrsAyudantia) {
        this.hrsAyudantia = hrsAyudantia;
    }


    
//Métodos
    public void calificarTarea(List<Map<String, String>> listaN, String rut, String tarea, int nota) {
        for (Map<String, String> par: listaN){
            if (par.get("rut").equals(rut)) {
                if (par.get("evaluacion").equals(tarea)){
                    System.out.println("Esta tarea ya ha sido calificada para este alumno");
                    break;
                }
            else{
                 Proyecto2.addCalificacion(listaN,rut,tarea,nota);
                 System.out.println(tarea +" del alumno con rut "+ rut + " ha sido calificada con nota "+ nota);  
                }
            }
        }
    }

    public void calificarEvaluacion(List<Map<String, String>> listaN, String rut, String evaluacion, int nota) {
        for (Map<String, String> par: listaN){
            if (par.get("rut").equals(rut)) {
                if (par.get("evaluacion").equals(evaluacion)){
                    System.out.println("Esta evaluación ya ha sido calificada para este alumno");
                    break;
                }
            else{
                    Proyecto2.addCalificacion(listaN,rut,evaluacion,nota);
                    System.out.println(evaluacion +" del alumno con rut "+ rut + " ha sido calificada con nota "+ nota);
                }
            }
        }
    }
    
@Override
public String toString() {
        return "Ayudante{" + "hrsAyudantia=" + hrsAyudantia + '}';
    }
}

