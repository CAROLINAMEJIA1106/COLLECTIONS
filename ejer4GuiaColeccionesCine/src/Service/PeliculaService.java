/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Pelicula;

import static Entidad.Pelicula.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class PeliculaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public Pelicula crearPelicula(){
        int horas;
        int minutos;
        Integer totalTiempo;
        Pelicula p = new Pelicula();//instanco objeto pelicula
        
        System.out.println("Por favor ingrese el Título de la Película: ");
        p.setTitulo(read.next());
        System.out.println("Por favor ingrese el Director de la Película: ");
        p.setDirector(read.next());
        System.out.println("Por favor ingrese la Duración de la Película (en horas/minutos): ");
        System.out.println("Horas: ");
        horas = read.nextInt();
        System.out.println("Minutos: ");
        minutos = read.nextInt();
        totalTiempo = (horas*60) + minutos;
        p.setDuracion(totalTiempo);
        
        return p;
        
        
    }
    public void menuMostrar(ArrayList<Pelicula> listadopelis){
        int op;
        
        do{
            System.out.println("-------- MENÚ MOSTRAR --------");
            System.out.println("1. Mostrar películas ingresadas");
            System.out.println("2. Mostrar películas mayores de 1 hora");
            System.out.println("3. Ordenar y Mostrar películas por duración de Mayor a Menor");
            System.out.println("4. Orednar Mostrar películas por duración de Menor a Mayor");
            System.out.println("5. Ordenar y Mostrar películas por Títulos - Alfabéticamente");
            System.out.println("6. Ordenar y Mostrar películas por Director - Alfabéticamente");
            System.out.println("7. Exit");
            op = read.nextInt();
            
            switch (op) {
            case 1:
                System.out.println("Listado de películas ingresadas: ");
                for (Pelicula listadopeli : listadopelis) {
                    System.out.println(" " + listadopeli);
                }
                break;
            case 2:
                System.out.println("Listado de películas mayores de 1 hora: ");
                for (Pelicula listadopeli : listadopelis) {
                    if(listadopeli.getDuracion() > 60){
                        System.out.println(" " + listadopeli);
                    }
                }
                break;
            case 3:
                System.out.println("Listado de películas ordenadas por Duración de Mayor a Menor: ");
                Collections.sort(listadopelis,ordenarDuraciondesc);
                
                for (Pelicula listadopeli : listadopelis) {
                    
                        System.out.println(" " + listadopeli);
                    
                }
                break;
            case 4:
                System.out.println("Listado de películas ordenadas por Duración de Menor a Mayor: ");
                Collections.sort(listadopelis,ordenarDuracion);
                
                for (Pelicula listadopeli : listadopelis) {
                    
                        System.out.println(" " + listadopeli);
                    
                }
                break;
            case 5:
                System.out.println("Listado de películas ordenadas por Títulos Alfabéticamente: ");
                Collections.sort(listadopelis,ordenarTitulo);
                
                for (Pelicula listadopeli : listadopelis) {
                    
                        System.out.println(" " + listadopeli);
                    
                }
                break;
            case 6:
                System.out.println("Listado de películas ordenadas por Director Alfabéticamente: ");
                Collections.sort(listadopelis,ordenarDirector);
                
                for (Pelicula listadopeli : listadopelis) {
                    
                        System.out.println(" " + listadopeli);
                    
                }
                break;
            case 7:
                System.out.println("Exit");
                break;
                
            default:
                System.out.println("¡¡¡ Opción inválida !!!");
            }
            
        }while(op != 7);
        
        
    }
}
