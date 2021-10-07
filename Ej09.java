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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Una empresa de juguetes se dedica a realizar cometas como las que 
        figuran en la imagen de la derecha. Necesitan saber el área de tela a 
        emplear según las medidas de las diagonales que hay entre los puntos 
        A y C, y entre B y D.*/
        String b = JOptionPane.showInputDialog("Escribe los cm de la diagonal más larga: ");
        double dl = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog("Escribe los cm de la diagonal más corta: ");
        double dc = Double.parseDouble(c);

        double area = (dl * dc) / 2;

        System.out.println("El área del cometa es: " + area);
    }

}
