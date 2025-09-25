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
public class ejercicio04 {
    
    /** Esta funcion calcula el precio final dado un precio inicial y una categoria de descuento
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double precio;
        char categoria;
        int descuento = 0;
        
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese su categoria (A, B o C): ");
        categoria = sc.nextLine().charAt(0);
        
        switch (categoria){
            
                case 'A':
                    descuento = 10;
                    break;
                case 'B':
                    descuento = 15;
                    break;
                case 'C':
                    descuento = 20;
                    break;
                default:
                    System.out.println("Categoria ingresada no valida");
                    
        }
        
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + (precio - precio * ((double) descuento / 100)));
        
    }
    
}
