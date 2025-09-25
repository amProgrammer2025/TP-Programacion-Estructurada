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
public class ejercicio07 {
    
    /** Esta funcion le pide una nota al usuario hasta ingresar un valor dentro del rango (0:10)
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numUsuario;
        boolean bandera = true;
        
        do{
            
            System.out.println("Ingrese una nota (0-10): ");
            numUsuario = Integer.parseInt(sc.nextLine());
            
            if(numUsuario < 0 || numUsuario > 10){
                
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
                
            }else{
                
                bandera = false;
                
            }
            
        }while(bandera);
        
        System.out.println("Nota guardada correctamente");
        
    }
    
}
