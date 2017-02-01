/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miguel Mendez Nevarez A01411490
//IMT
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de area y perimetro de un rectangulo");
        //Variables
        double b, h, a, p;
        //teclado kb
       Scanner kb= new Scanner (System.in);
       System.out.println("Medida de la base");
       b= kb.nextDouble();
       System.out.println("Medida de la altura");
       h= kb.nextDouble();
       
       a= b*h;
       p= (2*b) + (2*h);
        
        //Mostrar resultados
        System.out.println("Area=" + a);
        System.out.println("perimetro=" + p);
    }
    
}
