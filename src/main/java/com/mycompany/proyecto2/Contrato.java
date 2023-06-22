/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.List;
import java.util.Map;

public class Contrato {
    //Atributos
    private int nroContrato;

    private String jornada;

    private String fechaInicio;

    private String fechaTermino;
    
    //Constructor
    
    public Contrato(int nroContrato,String jornada, String fechaInicio, String fechaTermino) {
        this.nroContrato = nroContrato;
        this.jornada=jornada;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    
    //Getters y setters

    public int getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(int nroContrato) {
        this.nroContrato = nroContrato;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
    
    //Métodos

     @Override
    public String toString() {
        return "Contrato{" +
                "nroContrato= " + nroContrato +
                ", jornada= " + jornada +
                ", fechaInicio= " + fechaInicio +
                ", fechaTermino= " + fechaTermino +
                '}';
    }
    
    //Función para terminar un contrato(docentes)
    public void terminarContrato(List<Map<String, String>> listaD, Docente d){
        for (int i=0; i<listaD.size(); i++){
            Map<String, String> par= listaD.get(i);
            if (par.get("rut").equals(d.getRut())){
                listaD.remove(i);
                break;
            }
        }
    }
}
