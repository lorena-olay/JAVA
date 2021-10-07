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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Leer dos números enteros por teclado, a y b. Imprimir por pantalla el 
        resultado de las siguientes operaciones:
        a/b
        a mod b (operación módulo o residuo)*/
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Escribe el número: " + "\n");
        double a = entradaTeclado.nextDouble();
        Scanner entradaTeclado1 = new Scanner(System.in);
        System.out.print("Escribe el número: " + "\n");
        double b = entradaTeclado1.nextDouble();
        double div = a/b;
        double resto = a%b;
        System.out.println("División: " + div + "\n" + "el resto es: "+ resto);
        
        
    }
    
}
