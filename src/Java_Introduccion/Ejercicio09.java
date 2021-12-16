//Realizar un programa que solo permita introducir frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio09 
{
    public static void main(String[] args) {
        
        String frase;
        
        System.out.println(" Ingrese una frase de 8 caracteres");
        Scanner palabra = new Scanner(System.in);
        frase = palabra.nextLine();
        
        if (frase.length()== 8) {
            System.out.println(" La frase ingresada tiene el tamaño correcto");
        }
        else {
            System.out.println(" Incorrecto");
            
        }
    }
}
