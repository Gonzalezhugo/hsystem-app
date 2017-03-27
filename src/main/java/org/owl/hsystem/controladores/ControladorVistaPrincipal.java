/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.controladores;

import org.owl.hsystem.vistas.Visualizable;
import org.owl.hsystem.vistas.articulos.VistaAdministrarArticulos;

/**
 *
 * @author huguito
 */
public class ControladorVistaPrincipal implements Controlador{
    
    public static enum Accion{
        ADMINISTRAR_ARTICULOS("Administrar Articulos"),
        ADMINISTRAR_CLIENTES("Administrar Clientes"),
        ADMINISTRAR_PROVEEDORES("Administrar Proveedores"),
        REGISTRAR_COMPRA("Registrar Compra"),
        REGISTRAR_VENTA("Registrar Venta"),
        CONSULTAR_COMPRAS("Consultar Compras"),
        CONSULTAR_VENTAS("Consultar Ventas"),
        SALIR("Salir");
        
        private final String nombre;
        
        Accion (String nombre){
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
    }    
    
    public void procesarAccion(int indiceAccion){
        Accion accion = Accion.values()[indiceAccion];
        Visualizable vista = null;
        switch(accion){
            case ADMINISTRAR_ARTICULOS:
                vista = new VistaAdministrarArticulos(new ControladorVistaAdministrarArticulos());
                break;
            case SALIR:
                System.out.print("Hasta Luego");
                System.exit(0);
                /*
                vista = new Visualizable() {
                                @Override
                                public void visualizar() {
                                    throw new UnsupportedOperationException("Vista no implementada"); 
                                }
                            };
                break;
                */
        }
        if (vista != null){
            vista.visualizar();
        }        
    }
    
     public String[] obtenerNombresAcciones(){
        String[] nombres = new String[Accion.values().length];
        for (int i=0; i < nombres.length; i++){
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
}
