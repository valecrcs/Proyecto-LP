
package com.mycompany.proyecto2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cargo {
    //Atributos
    private String tipoCargo;
    private List<Persona> personas;
    
    //Constructor
    public Cargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    
    //Getters y setters

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    
    
//Métodos
   
    @Override
    public String toString() {
        return "Cargo{" + "tipoCargo= " + tipoCargo + '}';
    }
    
    //Función para abandonar un cargo
    public void abandonarCargo(List<Map<String, String>> listaC, Persona p, String cargo){
        for (int i=0; i<listaC.size(); i++){
            Map<String, String> par= listaC.get(i);
            if (par.get("cargo").equals(cargo) && par.get("rut").equals(p.getRut())){
                listaC.remove(i);
                break;
            }
        }
    }
    
    //Función para almacenar quien ocupa cada cargo
    public static void addCargoPersona(List<Map<String, String>> listaC, Cargo c, Persona p){
        Map<String, String> par= new HashMap<>();
        par.put("cargo",c.getTipoCargo());
        par.put("rut",p.getRut());
        listaC.add(par);
    }
    
}


