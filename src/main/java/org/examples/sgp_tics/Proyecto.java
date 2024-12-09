/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.sgp_tics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class Proyecto {
    private final String nombre;
    private final String jefe;
    private List<Tarea> tareas;

    public Proyecto(String nombre, String jefe) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.tareas = new ArrayList<>();
    }
    
    public void agregarTarea(String descripcion){
        Tarea tarea = new Tarea(descripcion);
        this.tareas.add(tarea);
    }
    
    public void mostrarEstado(){
        System.out.print("\n\n");
        System.out.println("Proyecto: " + this.nombre);
        for(int i = 0;i < this.tareas.size();i++){
            Tarea tarea = tareas.get(i);
            System.out.println(" Tarea "+(i+1)+":"+tarea.getDescripcion() + " - Estado: "+tarea.getEstado());
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getJefe() {
        return this.jefe;
    }

    public List<Tarea> getTareas() {
        return this.tareas;
    }
    
}
