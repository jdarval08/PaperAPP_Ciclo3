
package com.example.PapperApp.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla_productos")

public class Producto implements Serializable{
    
    @Id
    @Column(name = "idProducto")
    private Integer idProducto;
    
    @Column(name = "nombreProducto")
    private String nombreProducto;
    
    @Column(name = "precioProducto")
    private Double precioProducto;
    
    @Column(name = "disponibilidadProducto")
    private Integer disponibilidadProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getDisponibilidadProducto() {
        return disponibilidadProducto;
    }

    public void setDisponibilidadProducto(Integer disponibilidadProducto) {
        this.disponibilidadProducto = disponibilidadProducto;
    }
    
}
