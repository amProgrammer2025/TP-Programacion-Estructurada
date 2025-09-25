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
public class ejercicio03 {
    
    /** Esta funcion indica a que grupo etario pertenece la edad ingresada por el usuario
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        if (edad < 12){
            
            System.out.println("Ninio");
            
        } else if(edad < 18){
            
            System.out.println("Adolescente");
            
        } else if(edad < 60){
            
            System.out.println("Adulto");
            
        } else {
            
            System.out.println("Adulto mayor");
            
        }
    }
    
}
