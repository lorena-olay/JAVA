/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras_control;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lorena
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Saber si un carácter es un dígito, una letra mayúscula o una letra 
        minúscula*/
        String valor_por_teclado = JOptionPane.showInputDialog("Escribe el número o letra: ");
        char valor = valor_por_teclado.charAt(0);
        if (valor>=48&&valor<=57){
            JOptionPane.showMessageDialog(null, "Es un número");
        }else if(valor>=65&&valor<=90){
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        }
    }
}


