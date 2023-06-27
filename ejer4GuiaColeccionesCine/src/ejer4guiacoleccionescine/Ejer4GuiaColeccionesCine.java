/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4guiacoleccionescine;

import Entidad.Pelicula;
import Service.PeliculaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer4GuiaColeccionesCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        PeliculaService ps = new PeliculaService();//instancio objeto tipo servicio
        Pelicula pel = new Pelicula();
        ArrayList<Pelicula> listadoPeliculas = new ArrayList();
        String op;
        
        do{
            pel = ps.crearPelicula();
            listadoPeliculas.add(pel);
            System.out.println("Desea ingresar otra Película? (Y/N): ");
            op = read.next();
        }while(op.equalsIgnoreCase("Y"));
        
        ps.menuMostrar(listadoPeliculas);
    }
    
}
