//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido
package Java_Introduccion;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        int i, n, buscar, cont;
        
        System.out.println("Ingrese el tamaño que desea para el vector :");
        Scanner tamaño = new Scanner(System.in);
        n = tamaño.nextInt();

        int[] vec = new int[n];

        for (i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);

            System.out.println(" El numero en el indice " + i + " es : " + vec[i]);
           
        }

        System.out.println("Ingrese el numero que desee buscar en le vector: ");
        Scanner numero = new Scanner(System.in);
        buscar = tamaño.nextInt();

        cont = 0;
        
        for (i = 0; i < vec.length; i++) {

            if (buscar == vec[i]) {
                cont = cont + 1;
                System.out.println("El numero " + buscar + " se encuentra en la posicion : " + i);  
            }
        }
        System.out.println("El numero "+buscar+" se repitio "+cont+" veces");
        }
        }
    

