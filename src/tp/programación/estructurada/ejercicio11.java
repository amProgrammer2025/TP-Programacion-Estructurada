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
public class ejercicio11 {
    
    public static final double DESCUENTO = 0.1;
    
    /** Esta funcion devuelve el total del descuento aplicado a un precio
     * 
     * @param precio se trata del precio
     * @return 
     */
    
    public static double calcularDescuentoEspecial(double precio){
        
        double descuentoAplicado = precio * DESCUENTO;
        
        return descuentoAplicado;   
        
    }
    
    /** Esta funcion muestra por pantalla el descuento especial aplicado a un producto y el total a pagar
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double precioProducto;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(sc.nextLine());
        
        double descuentoEspecial = calcularDescuentoEspecial(precioProducto);
        
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        System.out.println("El precio final del producto es: " + (precioProducto - descuentoEspecial));
        
    }
    
}
