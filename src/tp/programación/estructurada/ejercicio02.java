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
public class ejercicio02 {
    
    /** Esta funcion compara tres numeros enteros ingresados por el usuario y devuelve cual es el mayor
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(sc.nextLine());
        
        if (num1 > num2 && num1 > num3){
            
            System.out.println("El mayor es: " + num1);
            
        } else if (num2 > num3){
            
            System.out.println("El mayor es: " + num2);
            
        } else{
            
            System.out.println("El mayor es: " + num3);
            
        }
    
    }
    
}
