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
public class ejercicio12 {
    
    /** Esta funcion modifica un elemento de un array tipo Double en determinada posicion
     * 
     * @param array se trata del arreglo
     * @param posicionPrecioViejo se trata de la posicion del arreglo que vamos a modificar
     * @param precioNuevo se trata del nuevo valor a almacenar
     */
    
    public static void modificarPrecio(double[] array, int posicionPrecioViejo, double precioNuevo){
        
        array[posicionPrecioViejo] = precioNuevo;
        
    }
    
    /** Esta funcion carga un arreglo tipo Double con inputs del usuario
     * 
     * @param array se trata del arreglo a cargar
     * @param sc se trata de un objeto tipo Scanner que va a permitir entradas del usuario
     */
    
    public static void cargarArray(double[] array, Scanner sc){
        
        for(int i = 0; i < array.length; i++){
            
            System.out.println("Ingrese el precio " + (i+1) + ": ");
            array[i] = Double.parseDouble(sc.nextLine());
            
        }
        
    }
    
    /** Esta funcion muestra por pantalla todos los elementos de un arreglo tipo Double
     * 
     * @param array se trata del arreglo a mostrar
     */
    
    public static void mostrarArray(double[] array){
        
        for(Double aux : array){
            System.out.println("Elemento: " + aux);
        }
        
    }
    
    /** Esta funcion inicializa el array con ceros
     * 
     * @param array se trata del arreglo a inicializar
     */
    
    public static void inicializarArray(double[] array){
        
        for(int i = 0; i < array.length; i++){
            
            array[i] = 0;
            
        }
        
    }
    
    /** Esta funcion inicializa un array double, lo carga, lo modifica y lo muestra por pantalla
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double[] precios = new double[5];
        
        inicializarArray(precios);
        cargarArray(precios, sc);
        mostrarArray(precios);
        
        int posicionPrecioViejo;
        double precioNuevo;

        System.out.println("Ingrese la posicion del precio viejo a modificar: ");
        posicionPrecioViejo = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio nuevo: ");
        precioNuevo = Double.parseDouble(sc.nextLine());
        
        modificarPrecio(precios, posicionPrecioViejo, precioNuevo);
        
        mostrarArray(precios);
        
    }
    
}
