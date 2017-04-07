/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.modelos.repositorios;


import java.util.List;
import org.owl.hsystem.modelos.Identificable;

/**
 *
 * @author Desarr_Hugo
 */
public class ListaPaginada {
    private int totalDatos;
    private List<Identificable> lista;
    
    public ListaPaginada(List<Identificable> lista, int totalDatos){
        this.totalDatos = totalDatos;
        this.lista = lista;
    }

    public int getTotalDatos() {
        return totalDatos;
    }

    public void setTotalDatos(int totalDatos) {
        this.totalDatos = totalDatos;
    }

    public List<Identificable> getLista() {
        return lista;
    }

    public void setLista(List<Identificable> lista) {
        this.lista = lista;
    }
}
