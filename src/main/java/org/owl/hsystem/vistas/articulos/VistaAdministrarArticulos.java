/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.vistas.articulos;

import org.owl.hsystem.controladores.ControladorVistaAdministrarArticulos;
import org.owl.hsystem.vistas.Visualizable;
import org.owl.hsystem.vistas.componentes.MenuDeConsola;
import org.owl.hsystem.vistas.componentes.utilitarios.UtilitarioConsola;

/**
 *
 * @author huguito
 */
public class VistaAdministrarArticulos implements Visualizable{
    
    private ControladorVistaAdministrarArticulos controlador;

    public VistaAdministrarArticulos(ControladorVistaAdministrarArticulos controlador){
        this.controlador = controlador;
    }   
        
    @Override
    public void visualizar() {
        UtilitarioConsola.limpiarPantalla();
        UtilitarioConsola.imprimirTituloPantalla("Administrar Articulos");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
