/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.vistas.clientes;

import org.owl.hsystem.controladores.ControladorVistaAdministrarClientes;
import org.owl.hsystem.vistas.Visualizable;
import org.owl.hsystem.vistas.componentes.MenuDeConsola;
import org.owl.hsystem.vistas.componentes.utilitarios.UtilitarioConsola;

/**
 *
 * @author Desarr_Hugo
 */
public class VistaAdministrarClientes implements Visualizable{
    ControladorVistaAdministrarClientes controlador;
    
    public VistaAdministrarClientes(ControladorVistaAdministrarClientes controlador){
        this.controlador = controlador;
    }
    
    
    @Override
    public void visualizar() {
        UtilitarioConsola.limpiarPantalla();
        UtilitarioConsola.imprimirTituloPantalla("Administrar Clientes");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
