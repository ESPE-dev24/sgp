/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.examples.sgp_tics;

/**
 *
 * @author Steven
 */
public class SGP_TICs {
   
    public static void main(String[] args) {
        SistemaGestionProyectos sgp = new SistemaGestionProyectos();
        System.out.print("\n\n");
        // Registrar un proyecto
        sgp.registrarProyect("Sistema Contable ERP", "Jose Luis Zapata");

        // Asignar tareas al proyecto
        sgp.asignarTarea("Sistema Contable ERP", "Diseño de la base de datos.");
        sgp.asignarTarea("Sistema Contable ERP", "Implementación de la lógica de negocio.");
        sgp.asignarTarea("Sistema Contable ERP", "Pruebas y despliegue.");

        // Mostrar el estado del proyecto
        sgp.mostrarEstadoProyectos();
        System.out.print("\n\n");
        
    }
    
}
