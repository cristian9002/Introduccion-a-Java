// Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        
        int nota;
        
        Scanner valor = new Scanner (System.in);
        
        do
        {
            System.out.println("ingrese una valor entre 0 y 10");
            nota = valor.nextInt();
        }while(nota<0 || nota>10);
        
        System.out.println("el numero ingresado es correcto");
    }
    
}
