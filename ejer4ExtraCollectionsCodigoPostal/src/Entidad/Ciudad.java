/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Ciudad {
    //atributos
    private String nombre;
    private Integer codigopostal;
    
    //constructores

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer codigopostal) {
        this.nombre = nombre;
        this.codigopostal = codigopostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(Integer codigopostal) {
        this.codigopostal = codigopostal;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", codigopostal=" + codigopostal + '}';
    }
    
}
