
package com.mycompany.proyecto2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Perfil {
    
    //Atributos
    private String IDPerfil;
    private String gradoAcademico;
    private String Capacitaciones;
    
    //Constructor
    public Perfil(String IDPerfil, String CV, String Capacitaciones) {
        this.IDPerfil=IDPerfil;
        this.gradoAcademico = CV;
        this.Capacitaciones = Capacitaciones;
    }
    
    //Getters y setters

    public String getIDPerfil() {
        return IDPerfil;
    }

    public void setIDPerfil(String IDPerfil) {
        this.IDPerfil = IDPerfil;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getCapacitaciones() {
        return Capacitaciones;
    }

    public void setCapacitaciones(String Capacitaciones) {
        this.Capacitaciones = Capacitaciones;
    }

    
//Métodos

    @Override
    public String toString() {
        return "Perfil{" + "CV=" + gradoAcademico + ", Capacitaciones=" + Capacitaciones + '}';
    }
    
    //Función para almacenar perfil y docente
    public static void asignarPerfil(List<Map<String, String>> listaP, Perfil perfil, Persona pers){
        Map<String, String> par= new HashMap<>();
        par.put("rut", pers.getRut());
        par.put("idperfil", perfil.getIDPerfil());
        listaP.add(par);
    }
}
