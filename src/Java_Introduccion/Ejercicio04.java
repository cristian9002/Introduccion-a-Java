// Dada una cantidad de grados centígrados se debe mostrar su equivalente en
// grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package Java_Introduccion;


import java.util.Scanner;


public class Ejercicio04
{
    public static void main(String[] args) {
        
        float f, c;
        
        System.out.println("ingrese la cantidad de gª centigrados a convertir: ");
        Scanner num1 = new Scanner(System.in);
        c = num1.nextFloat();
        
        f = 32 + (9 * c / 5);
        
        
        System.out.println("La cantidad de gª Centidrados ingresados equivalen a :"+f+"gª fahrenheir");
        
    }
}
