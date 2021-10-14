/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Programa que pida el precio de un artículo y calcule su valor 
        aplicando un 16% de IVA. Realiza un programa para calcular el valor de 
        cualquier artículo aplicando cualquier IVA.*/
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Escribe el precio del artículo: " + "\n");
        double a = entradaTeclado.nextDouble();
        Scanner entradaTeclado1 = new Scanner(System.in);
        System.out.print("Escribe el porcertaje del IVA: " + "\n");
        double b = entradaTeclado1.nextDouble();
        double precio = (a * b) / 100;
        double resultado = a + precio;
        System.out.println("El precio del artículo con el IVA es " + resultado);
        
    }
    
}
