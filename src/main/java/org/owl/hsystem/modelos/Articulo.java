/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hsystem.modelos;

/**
 *
 * @author huguito
 */
public class Articulo implements Identificable{
    private String codigo;
    private String descripcion;
    private Double precio;
    private Double porcentajeImpuesto;
    private Long id;
    private int existencia;
    
    /*
        getter ans setter
    */
    public String getCodigo(){
        return codigo;
    }
    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = this.descripcion;
    }
    
    public Double getPrecio(){
        return precio;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    
    public Double getPorcentajeImpuesto(){
        return porcentajeImpuesto;
    }
    public void setPorcentajeImpuesto(Double porcentajeImpuesto){
        this.porcentajeImpuesto = porcentajeImpuesto;
    }
    
    public int getExistencia(){
        return existencia;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return id + "\t" + codigo + "\t" + descripcion + "\t" + precio + "\t" + porcentajeImpuesto;
    }
}
