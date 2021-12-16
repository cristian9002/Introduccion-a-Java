// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
// por pantalla.

package Java_Introduccion;

import java.util.Scanner;

public class Ejercicio02 
{
    public static void main(String[] args) {
        
        String nombre;
        System.out.println("ingrese su nombre");
        Scanner letra = new Scanner(System.in );
        nombre = letra.nextLine();
        System.out.println("su nombre es: "+nombre);
        
    }
}
