//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        
        int valorLim, a, i;
        
        System.out.println("ingrese un valor positivo como limite");
        Scanner num = new Scanner(System.in);
        valorLim = num.nextInt();
        
        i = 0;
        
        do {
            System.out.println("Ingrese un valor");
            Scanner valor1 = new Scanner( System.in);
            a = valor1.nextInt();
            
            i = i + a;
        }while( i <= valorLim);
        
        System.out.println("La suma de los valores ingresados supero el limite");
            
        }
        
    }
    

