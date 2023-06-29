/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persona {
    
    //Atributos
    private String rut;

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String fechaNacimiento;

    private String correo;
    
    //Constructor

    public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
    }
    
    //Getters y setters

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     //Función para almacenar personas (rut, nombre y apellido)
    public static void addPersona(List<Map<String, String>> listaP, Persona p){
        Map<String, String> par= new HashMap<>();
        par.put("rut",p.getRut());
        par.put("nombre",p.getNombre());
        par.put("apellido",p.getApellidoPaterno());
        listaP.add(par);
    }
    
    //Función para mostrar personas en pantalla
    public static void mostrarPersonas(List<Map<String, String>> listaP){
        for (Map<String, String> par: listaP){
           String rut= par.get("rut");
           String nombre= par.get("nombre");
           String apellido= par.get("apellido");
           System.out.println("Rut: "+rut+", nombre: "+nombre+ ", apellido: "+apellido);
          }
    }
    
    //Función para buscar personas por su rut
    public static String buscarNombrePersona(List<Map<String, String>> listaP, String rutbuscado){
        for (Map<String, String> par: listaP){
            if (par.get("rut").equals(rutbuscado)){
                return par.get("nombre")+" "+par.get("apellido");
            }
        }
      return "";  
    }
    
    //Función para eliminar personas por su rut (Sirve para cuando renuncian o abandonan cargo)
    public static void eliminarPersona(List<Map<String, String>> listaP, String rutbuscado){
        for (int i=0; i<listaP.size(); i++){
            Map<String, String> par= listaP.get(i);
            if (par.get("rut").equals(rutbuscado)){
                listaP.remove(i);
                break;
            }
        }
    }
    
    @Override
   public String toString(){
        return "Perfil{" + "rut=" + rut + ", Nombre=" + nombre + '}';
}
}
