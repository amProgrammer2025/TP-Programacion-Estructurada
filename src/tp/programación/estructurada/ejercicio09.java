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
public class ejercicio09 {
    
    /** Esta funcion devuelve el costo de envio en base a un peso y una zona
     * 
     * @param peso se trata del peso del envio
     * @param zona se trata de la zona de entrega del envio
     * @return 
     */
    
    public static double calcularCostoEnvio(double peso, String zona){
        
        double costoEnvio;
        
        if(zona.equalsIgnoreCase("Nacional")){
            
            costoEnvio = peso * 5;
            
        } else if (zona.equalsIgnoreCase("Internacional")){
            
            costoEnvio = peso * 10;
            
        } else{
            
            System.out.println("Zona no valida");
            costoEnvio = 0;
            
        }
        
        return costoEnvio;
        
    }
    
    /** Esta funcion devuelve el total de la compra en base a un precio y un costo de envio
     * 
     * @param precioProducto se trata del precio del producto
     * @param costoEnvio se trata del costo de envio
     * @return 
     */
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
            return precioProducto + costoEnvio;
        
    }
    
    /** Esta funcion calcula el total a pagar por el envio de un paquete
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double precioProducto, pesoPaquete;
        String zonaEnvio;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el peso del paquete: ");
        pesoPaquete = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la zona de envio (Nacional o Internacional): ");
        zonaEnvio = sc.nextLine();
        
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El total a pagar es: $" + precioFinal);
        
    }
    
}
