// Crear un programa que dado un numero determine si es par o impar.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio07 
{
    public static void main(String[] args) {
        
        int n;
        
        System.out.println("Ingrese un numero para saber si es par o impar");
        Scanner numero = new Scanner(System.in);
        n = numero.nextInt();
        
        if (n % 2 == 0){
            System.out.println(n+" es un numero par");
        }
        else {
            System.out.println(n+" es impar");
        }
        
        
    }
}
