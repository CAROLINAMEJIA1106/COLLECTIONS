/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class PerroService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> listados = new ArrayList();
    
    public Perro crearPerro(){
        Perro p = new Perro();//instancio objeto dentro de mi método
        System.out.println("Por favor ingrese la raza del perro: ");
        p.setRaza(read.next());
        return p;
    }
    
    public ArrayList<String> crearlistado(Perro p){
        
        listados.add(p.getRaza()); 
        return listados;
    }
    
    public void mostrarlistado(ArrayList<String> listadosRazas) {
        Iterator<String> it = listadosRazas.iterator();
        
        for(String lis:listadosRazas){
            System.out.println(" " + lis);
        }
        
        
        
    }
    public void eliminarraza(ArrayList<String> listadosRazas, String razaelim){
        Iterator<String> ite = listadosRazas.iterator();
        boolean si=false;
        
        while(ite.hasNext()){
            if(ite.next().equalsIgnoreCase(razaelim)){
                ite.remove();
                si = true;
            }
        }
        if(si){
            Collections.sort(listadosRazas);
            System.out.println("El listado de razas ordenado es: ");
            for(String raz:listadosRazas){
                
                System.out.println(" " + raz);
            }
            
        }else{
            
            System.out.println("La raza no se encuentra");
            Collections.sort(listadosRazas);
            System.out.println("El listado de razas ordenado es: ");
            for(String raz:listadosRazas){
                
                System.out.println(" " + raz);
            }
        }
        
    }
    
}
