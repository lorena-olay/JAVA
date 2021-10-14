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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realiza un programa que calcule el espacio recorrido, en metros, 
        por un cuerpo que se deplaza a 200 km/h si está en movimiento 
        20 minutos. Realiza otro programa para calcular el espacio recorrido 
        del cuerpo en función de su velocidad y tiempo de movimiento.*/
        double v = 200*1000;
        double t = 20/60;
        double e = v*t;
        System.out.println("Distancia recorrida en 20 minutos: " + e);
        
        String v1 = JOptionPane.showInputDialog(null, "Escribe los km/h: ");
        double v11 = Double.parseDouble(v1);
        String t2 = JOptionPane.showInputDialog("Escribe el tiempo: ");
        double t22 = Double.parseDouble(t2);
        double d = t22*v11;
        JOptionPane.showMessageDialog(null, "Esta es la distancia recorrida en " + t22 + " : " + d);
    }

}
