/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1guiacoleccionesrazasperros;

import Entidad.Perro;
import Service.PerroService;
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author Carolina
 */
public class Ejer1GuiaColeccionesRazasPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PerroService ps = new PerroService();
        Perro p;
        ArrayList<String> l = new ArrayList();
        String op,op2;
        String razaeliminar;
        
        do{
            p = ps.crearPerro();
            l = ps.crearlistado(p);
            
            System.out.println("Va a guardar otra raza de perro?: " + "S/N");
            op = read.next();
        }while(op.equalsIgnoreCase("S"));
        
        System.out.println("El listado de razas es: ");
        ps.mostrarlistado(l);
        
        do{
            System.out.println("Ingrese una raza de perro que desee eliminar: ");
            razaeliminar = read.next();
            
            ps.eliminarraza(l, razaeliminar);
            System.out.println("Desea seguir eliminando otra raza?: " + "S/N");
            op2 = read.next();
        }while(op2.equalsIgnoreCase("S"));
        
        System.out.println("!!! Exit !!!!");
    }
    
}
