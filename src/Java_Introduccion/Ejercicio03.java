//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio03 
{
    public static void main(String[] args) {
        String frase;
        
        System.out.println("ingrese una frase");
        
        Scanner letra = new Scanner (System.in);
        frase = letra.nextLine();
        
        System.out.println("la frase ingresada transformada en mayuscula es: "+frase.toUpperCase());
        
    }
      
}
