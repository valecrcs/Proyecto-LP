
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
}
