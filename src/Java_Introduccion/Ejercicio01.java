
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio01 {

     public static void main(String[] args) {
        
        int num1, num2 ,resultado;
        
        System.out.println("ingrese un numero");
        Scanner leer1 = new Scanner (System.in);
        num1 = leer1.nextInt();
        
        System.out.println("ingrese otro numero");
        Scanner leer2 = new Scanner (System.in);
        num2 = leer2.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("La suma de sus numeros ingresados es: "+resultado);
    }
}