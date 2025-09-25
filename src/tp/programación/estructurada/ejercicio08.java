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
public class ejercicio08 {
    
    /** Esta funcion devuelve el precio final, incluyendo el impuesto y el descuento
     * 
     * @param precio se trata del precio base
     * @param impuesto se trata del porcentaje de impuesto
     * @param descuento se trata del procentaje de descuento
     * @return 
     */
    
    public static double calcularPrecioFinal(double precio, double impuesto, double descuento){
        
        return precio + (precio*(impuesto/100)) - (precio*(descuento/100));
        
    }
    
    /** Esta funcion muestra el precio final de un producto, en base a su precio base, el impuesto y el descuento
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double precio, impuesto, descuento, precioFinal;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje: ");
        impuesto = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el descuento en porcentaje: ");
        descuento = Double.parseDouble(sc.nextLine());
        
        precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);
        
    }
    
}
