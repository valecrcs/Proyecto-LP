
package com.mycompany.proyecto2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Asignatura {
    
    //Atributos
    private String nombreAsig;
    private int hrsPorSemana;
    
    //Constructor

    public Asignatura(String nombreAsig, int hrsPorSemana) {
        this.nombreAsig = nombreAsig;
        this.hrsPorSemana = hrsPorSemana;
    }
    
    //Getters y setter

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public int getHrsPorSemana() {
        return hrsPorSemana;
    }

    public void setHrsPorSemana(int hrsPorSemana) {
        this.hrsPorSemana = hrsPorSemana;
    }
    
    //Métodos

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsig=" + nombreAsig + ", hrsPorSemana=" + hrsPorSemana + '}';
    }
    
    //Método para asignar asignaturas a docentes
    public static void asignarAsignatura(List<Map<String, String>> listaJ, Docente d, Asignatura a){
        Map<String, String> par= new HashMap<>();
        par.put("rut", d.getRut());
        par.put("asignatura",a.getNombreAsig());
        listaJ.add(par);
    }
    
    //Método para mostrar jefes de asignaturas
    public static void mostrarJefaturas(List<Map<String, String>> listaJ){
        for (Map<String, String> par: listaJ){
           String rut= par.get("rut");
           String asignatura= par.get("asignatura");
           System.out.println("Rut: "+rut+", asignatura: "+asignatura);
          }
    }
    
    //Función para añadir calificaciones (tareas o cert)
    public static void addCalificacion(List<Map<String, String>> listaN, String rut, String evaluación, int nota){
        Map<String, String> par= new HashMap<>();
        par.put("rut", rut);
        par.put("evaluacion",evaluación);
        par.put("nota", Integer.toString(nota));
        listaN.add(par);
    }   
    
    //Función para mostrar en pantalla calificaciones
    public static void mostrarCalificaciones(List<Map<String, String>> listaN){
    for (Map<String, String> par: listaN){
        String rut= par.get("rut");
        String evaluacion= par.get("evaluacion");
        String nota= par.get("nota");
        System.out.println("Rut: "+rut+", evaluacion: "+evaluacion+", nota: "+nota);     
    }
    }
    
    //Función para imprimir agenda de evaluaciones
    public static void imprimirAgenda(Map<String, List<String>> agenda){
        for (String asignatura: agenda.keySet()){
            System.out.println("Asignatura: "+asignatura);
            List<String> evaluaciones= agenda.get(asignatura);
            System.out.println("Fechas de evaluación: ");
            for (String fecha: evaluaciones){
                System.out.println("- "+fecha);
            }
            System.out.println();
        }
        
    }
}
