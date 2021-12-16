// Escribir un programa que lea un número entero por teclado y muestre por pantalla
// el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
// Math.sqrt().
package Java_Introduccion;

import java.util.Scanner;

public class Ejercicio05 
{
    public static void main(String[] args) {
        
        double num, doble, triple, raiz;
        
        System.out.println("ingrese un numero");
        Scanner valor = new Scanner ( System.in);
        num = valor.nextDouble();
        
        doble = num * 2;
        triple =  num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println("el doble del numero ingresado es :"+doble+" el triple del numero ingresado es :"+triple+" y la raiz cuadrada del numero ingresado es: "+raiz);
        
    }
}
