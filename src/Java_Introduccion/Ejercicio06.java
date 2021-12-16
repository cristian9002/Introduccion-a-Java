//Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio06
{
    public static void main(String[] args) {
        
        int num1, num2;
        
        System.out.println("ingrese un numero :");
        Scanner a = new Scanner(System.in);
        num1 = a.nextInt();
        
        System.out.println("ingrese otro numero :");
        Scanner b = new Scanner(System.in);
        num2 = b.nextInt();
        
        
        if (num1 > num2) {
            System.out.println("el numero mayor es :"+ num1);
        }
        else {
            System.out.println("El numero mayor es :"+ num2);
        }
                
    }
}