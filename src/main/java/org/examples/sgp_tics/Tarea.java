/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.sgp_tics;

/**
 *
 * @author Steven
 */
public class Tarea {
    private final String descripcion;
    private boolean estado = false;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void  actualizarEstado(boolean estado){
        this.estado = estado;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
}
