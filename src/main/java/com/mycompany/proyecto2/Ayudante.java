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
                 Asignatura.addCalificacion(listaN,rut,tarea,nota);
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
                    Asignatura.addCalificacion(listaN,rut,evaluacion,nota);
                    System.out.println(evaluacion +" del alumno con rut "+ rut + " ha sido calificada con nota "+ nota);
                }
            }
        }
    }
    
    //Funcion añadir ayudante (rut y nombre)
    public static void addAyudante(List<Map<String, String>> listaA, Ayudante a){
        Map<String, String> par= new HashMap<>();
        par.put("rut",a.getRut());
        par.put("nombre",a.getNombre());
        listaA.add(par);
    }
    
    //Función imprimir por pantalla ayudantes
    public static void mostrarAyudantes(List<Map<String, String>> listaA){
       for (Map<String, String> par: listaA){
           String rut= par.get("rut");
           String nombre= par.get("nombre");
           System.out.println("Rut: "+rut+", nombre: "+nombre);
          }
    }
    
@Override
public String toString() {
        return "Ayudante{" + "hrsAyudantia=" + hrsAyudantia + '}';
    }
}

