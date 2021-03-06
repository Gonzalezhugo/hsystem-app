/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.modelos.repositorios;

import org.owl.hsystem.modelos.Identificable;

/**
 *
 * @author huguito
 */
public class RepositorioArticulo extends Repositorio{
    private long secuencia;
    private static RepositorioArticulo INSTANCE;
    
    private RepositorioArticulo(){
        
    }
    
    public static RepositorioArticulo getInstance(){
        if (INSTANCE == null){
            INSTANCE = new RepositorioArticulo();
        }
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    }
}
