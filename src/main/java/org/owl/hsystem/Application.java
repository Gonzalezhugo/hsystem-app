/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem;

import org.owl.hsystem.controladores.ControladorVistaPrincipal;
import org.owl.hsystem.vistas.VistaPrincipal;

/**
 *
 * @author huguito
 */
public class Application {
    public static void main (String[] args){
        ControladorVistaPrincipal controladorPrincipal = new ControladorVistaPrincipal();
        VistaPrincipal vistaPrincipal = new VistaPrincipal(controladorPrincipal);
        vistaPrincipal.visualizar();
    }
}
