/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.controladores;

import org.owl.hsystem.vistas.VistaPrincipal;
import org.owl.hsystem.vistas.Visualizable;
import org.owl.hsystem.vistas.articulos.VistaAdministrarArticulos;

/**
 *
 * @author huguito
 */
public class ControladorVistaAdministrarArticulos implements Controlador{
     public static enum Accion{
        CREAR_ARTICULO("Crear Articulos"),
        EDITAR_ARTICULO("Editar Articulos"),
        ELIMINAR_ARTICULO("Eliminar Articulos"),
        VOLVER("Volver");
        
        private final String nombre;
        
        Accion(String nombre){
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        Accion accion = Accion.values()[indiceAccion];
        Visualizable vista = null;
        switch(accion){
            case VOLVER:
                vista = new VistaPrincipal(new ControladorVistaPrincipal());
                break;
            default:
                  System.out.println("Opcion elegida aun no ha sido implementada");
                  vista = new VistaAdministrarArticulos(this);
                  break;
        }
        if (vista != null){
            vista.visualizar();
        }
        
    }
    
    public String[] obtenerNombresAcciones(){
        String[] nombres = new String[Accion.values().length];
        for(int i=0; i < nombres.length; i++){
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
    
    
}
