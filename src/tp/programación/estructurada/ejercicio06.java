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
public class ejercicio06 {
    
    /** Esta funcion muestra por pantalla la cantidad de numeros positivos, negativos y ceros ingresados por el usuario
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numUsuario;
        int contPositivos = 0; 
        int contNegativos = 0; 
        int contCeros = 0;
        
        for(int i = 0; i < 10; i++){
            
            System.out.println("Ingrese un numero: ");
            numUsuario = Integer.parseInt(sc.nextLine());
            
            if(numUsuario > 0){
                
                contPositivos++;
                        
            } else if(numUsuario < 0){
                
                contNegativos++;
                
            } else{
                
                contCeros++;
                
            }
            
        }
        
        System.out.println("Resultados\n"
                + "Positivos: " + contPositivos 
                + "\nNegativos: " + contNegativos
                + "\nCeros: " + contCeros);
        
    }
    
}
