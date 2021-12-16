// Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio08 
{
    public static void main(String[] args) {
        
        String frase1, frase2;
        
        System.out.println(" Ingrese una frase");
        Scanner a = new Scanner (System.in);
        frase1 = a.nextLine();
        
        frase2 = "eureka";
        
        if ( frase1.equals(frase2)) {
        System.out.println("correcto");
        }
        else {
                System.out.println("incorrecto");
                
        }
    }
}
