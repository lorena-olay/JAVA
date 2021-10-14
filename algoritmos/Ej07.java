/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lorena
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PRECIO = 3.78;
        final double PRECIO1 = 1.20;
        // TODO code application logic here
        /*Un productor de leche lleva el registro de lo que produce en litros, 
        pero cuando entrega la leche en la distribuidora le pagan según los 
        galones entregados (1 galón son 3,78 litros). Escribe un programa que 
        ayude al productor a saber cuánto recibirá por la entrega de su 
        producción de un día, sabiendo que el precio del galón es 1.20€.*/
        String b = JOptionPane.showInputDialog("Escribe el número de litros: " + "\n");
        double a = Double.parseDouble(b);
        double galones = a/PRECIO;
        double entrega = galones*PRECIO1;
        System.out.println("Este es el dinero que obtendrás hoy: " + entrega);
        
        
    }
    
}
