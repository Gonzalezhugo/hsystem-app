/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.vistas;

import org.owl.hsystem.controladores.ControladorVistaPrincipal;
import org.owl.hsystem.vistas.componentes.MenuDeConsola;
import org.owl.hsystem.vistas.componentes.utilitarios.UtilitarioConsola;

/**
 *
 * @author huguito
 */
public class VistaPrincipal implements Visualizable{
    private final ControladorVistaPrincipal controlador;
    
    public VistaPrincipal(ControladorVistaPrincipal controlador){
        this.controlador = controlador;
    }
    
    
    @Override
    public void visualizar() {
        UtilitarioConsola.limpiarPantalla();
        UtilitarioConsola.imprimirTituloPantalla("Applicacion POS");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.mostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
}
