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
public class ejercicio10 {
    
    /** Esta funcion actualiza el valor del stock
     * 
     * @param stockActual se trata del valor del stock actual
     * @param cantidadVendida se trata de la cantidad de salidas de stock
     * @param cantidadRecibida se trata de la cantidad de ingresos de stock
     * @return 
     */
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        
        return stockActual - cantidadVendida + cantidadRecibida;
        
    }
    
    /** Esta funcion muestra por pantalla el valor actualizado del stock
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.println("Ingrese el stock actual: ");
        stockActual = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(sc.nextLine());
        
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + stockActual);
        
    }
    
}
