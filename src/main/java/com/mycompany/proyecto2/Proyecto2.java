/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;
import static com.mycompany.proyecto2.Asignatura.imprimirAgenda;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* ESTE ES EL MAIN */
/* NO PUEDO CAMBIARLE EL NOMBRE NI CAMBIARLO DE PAQUETE PORQUE DEJA DE FUNCIONAR */

public class Proyecto2 {

    public static void main(String[] args) {
        
        
        //Creación de instancias de objetos
        Perfil perfil1 = new Perfil("1","Ingeniero civil","Ciberseguridad");
        
        Asignatura asig1 = new Asignatura("Programación",10);
        
        Ayudante ayud1= new Ayudante(6,"123456789","Pepito","Cruces","Molina","25/05/1999","correo@gmail.com");

        Persona p1= new Persona("000000000","Juanito","Pérez","Piedra","01/01/2000","mail@correo.com");
        
        Docente d1= new Docente("doc1","11111111","Pablito","Molina","Muñoz","03/08/1980","correo@mail.cl");
        
        Cargo cargoDocente= new Cargo("Docente");
        Cargo cargoAyudante= new Cargo ("Ayudante");
        Cargo cargoJefeCarrera= new Cargo("Jefe de carrera");
        Cargo cargoJefeDepartamento= new Cargo ("Jefe de departamento");
        
        //Creación de listas que almacenan
        
        List<Map<String, String>> listaDocentes;
        listaDocentes= new ArrayList<>();
        
        List<Map<String, String>> listaAyudantes;
        listaAyudantes= new ArrayList<>();
        
        List<Carrera> listaCarreras;
        listaCarreras= new ArrayList<>();
        
        List<Map<String, String>> listaPersonas;
        listaPersonas= new ArrayList<>();
        
        List<Map<String, String>> listaCargos;
        listaCargos= new ArrayList<>();
        
        List<Map<String, String>> listaJefaturas;
        listaJefaturas= new ArrayList<>();
        
        List<Map<String, String>> listaPerfiles;
        listaPerfiles= new ArrayList<>();
        
        List<Map<String, String>> listaNotasTareas;
        listaNotasTareas= new ArrayList<>();
        
        List<Map<String, String>> listaNotasCert;
        listaNotasCert= new ArrayList<>();
        
        Map<String, List<String>> agendaEvaluaciones;
        agendaEvaluaciones= new HashMap<>();
        
        Map<String, List<String>> alumnosInscritos;
        alumnosInscritos= new HashMap<>();
        
        //Instrucciones
        Docente.agendarEvaluacion(agendaEvaluaciones, "Matemáticas","31/07/2007");
        imprimirAgenda(agendaEvaluaciones);
    }
}
