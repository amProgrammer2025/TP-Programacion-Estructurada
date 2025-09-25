/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.programación.estructurada;

import java.util.Scanner;

/**
 *
 * @author gauta
 */
public class ejercicio01 {
    
    /** Esta funcion le indica al usuario si el año que ingresó es bisiesto o no
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int anio;
        
        System.out.println("Ingrese un anio: ");
        anio = Integer.parseInt(sc.nextLine());
        
        if (anio % 4 == 0 && anio % 100 != 0){
            
            System.out.println("Es bisiesto");
            
        }else{
            
            if(anio % 400 == 0){
                
                System.out.println("Es bisiesto");
                
            } else{
                
                System.out.println("No es bisiesto");
                
            }
            
        }
    }
    
}
