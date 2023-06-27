/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class Alumno {
    //atributos
    private String nombrecompleto;
    private ArrayList<Integer> notas;
    
    //constructores

    public Alumno() {
        notas = new ArrayList();
    }

    public Alumno(String nombrecompleto, ArrayList<Integer> notas) {
        this.nombrecompleto = nombrecompleto;
        this.notas = notas;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public void recorrerListadoNotas(){
        for (Integer nota : notas) {
            System.out.println(" " + nota);
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombrecompleto=" + nombrecompleto + ", notas=" + notas + '}';
    }

    
    
}
