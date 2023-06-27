/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class AlumnoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Alumno alum = new Alumno();//instancio objeto tipo alumno
    public Alumno crearAlumno(){
        
        ArrayList<Integer> aux = new ArrayList(); //instancio arraylist auxliar
        String op;
        
        System.out.println("Por favor ingrese el nombre completo del alumno: ");
        alum.setNombrecompleto(read.next());
        System.out.println("Por favor ingrese las notas: ");
          
        do{
            System.out.print("Nota: ");
            aux.add(read.nextInt());
            alum.setNotas(aux);
            System.out.println("Ingresa más notas?: " + "Y/N");
            op = read.next();
        }while(op.equalsIgnoreCase("Y"));
        
        return alum;
    }
        
    public double notaFinal(ArrayList<Integer> lisnotas){
        double promedio;
        double prom = 0;
        System.out.println("El listado de las notas de este alumno es: ");
        alum.recorrerListadoNotas();
        for (Integer lisnota : lisnotas) {
            prom = (lisnota + prom);
        }
        promedio = prom/lisnotas.size();
        return promedio;
        
    }
    
}
