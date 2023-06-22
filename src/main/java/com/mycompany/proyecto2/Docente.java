/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Docente extends Persona{
        //Atributos
    private String credencialesDocente;

    //Constructor
    public Docente(String credencialesDocente, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String correo) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, correo);
        this.credencialesDocente = credencialesDocente;
    }
    
    //Getters y setters

    public String getCredencialesDocente() {
        return credencialesDocente;
    }

    public void setCredencialesDocente(String credencialesDocente) {
        this.credencialesDocente = credencialesDocente;
    }

    
   //Métodos

    public void cargarMaterialAULA() {
        //NO es relevante almacenar 
        System.out.println("Material cargado exitosamente");
    }

    public static void agendarEvaluacion(Map<String,List<String>> agendaEvaluaciones, String asignatura, String fecha) {
        if (agendaEvaluaciones.containsKey(asignatura)){
            List<String> evaluaciones=agendaEvaluaciones.get(asignatura);
            evaluaciones.add(fecha);
        }
        else{
            List<String> evaluaciones= new ArrayList<>();
            evaluaciones.add(fecha);
            agendaEvaluaciones.put(asignatura, evaluaciones);
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
                    Proyecto2.addCalificacion(listaN, rut, evaluacion, nota);
                    System.out.println(evaluacion +" del alumno con rut "+ rut + " ha sido calificada con nota "+ nota);
                }
            }
        }
    }
}
