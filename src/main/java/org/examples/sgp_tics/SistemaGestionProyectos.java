/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.sgp_tics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven
 */
public class SistemaGestionProyectos {
    private final List<Proyecto> proyectos;

    public SistemaGestionProyectos() {
        this.proyectos = new ArrayList<>();
    }
    
    public void registrarProyect(String nombre,String jefe){
        Proyecto proyecto = new Proyecto(nombre,jefe);
        proyectos.add(proyecto);
        System.out.println("Proyecto '"+nombre+"' registrado correctamente :v");
    }
    
    public void asignarTarea(String nombreProyecto,String descripcionTarea){
        for(Proyecto proyecto : proyectos){
            if(proyecto.getNombre().equals(nombreProyecto)){
                proyecto.agregarTarea(descripcionTarea);
                System.out.println("Tarea '"+descripcionTarea+"' asignada al proyecto '" + nombreProyecto + "'.");
                return;
            }
        }
        System.out.println("Proyecto '"+nombreProyecto+"' no encontrado");
    }
    
    public void mostrarEstadoProyectos(){
        for(Proyecto proyecto:proyectos){
            proyecto.mostrarEstado();
        }
    }
}
