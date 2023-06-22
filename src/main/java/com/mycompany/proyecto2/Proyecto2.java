/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;
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
    
    //Funciones
    
    //Funcion añadir docente (rut y nombre)
    public static void addDocente(List<Map<String, String>> listaD, Docente d){
        Map<String, String> par= new HashMap<>();
        par.put("rut",d.getRut());
        par.put("nombre",d.getNombre());
        listaD.add(par);
    }
    
    //Función imprimir por pantalla docentes
    public static void mostrarDocentes(List<Map<String, String>> listaD){
       for (Map<String, String> par: listaD){
           String rut= par.get("rut");
           String nombre= par.get("nombre");
           System.out.println("Rut: "+rut+", nombre: "+nombre);
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
    
    
    
    
   
    
   



