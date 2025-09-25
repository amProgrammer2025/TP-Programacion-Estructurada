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
public class ejercicio05 {
    
    /** Esta funcion muestra por pantalla la suma de todos los numeros pares ingresados por el usuario
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        int acum = 0;
        
        System.out.println("Ingrese un numero: ");
        num = Integer.parseInt(sc.nextLine());
        
        while(num != 0){
            
            if (num % 2 == 0){
                
                acum += num;
                
            }
            
            System.out.println("Ingrese un numero: ");
            num = Integer.parseInt(sc.nextLine());
            
        }
        
        System.out.println("La suma de los numeros pares es: " + acum);
        
    }
    
}
