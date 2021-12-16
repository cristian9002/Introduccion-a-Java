//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
//del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
//carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        
       
        Double suma, resta, multi, div, a , b;
        int op;
        boolean band;
        
        band = true;
        
        
        System.out.println("Ingrese un numero");
        Scanner valor1 = new Scanner(System.in);
        a = valor1.nextDouble();
        
        System.out.println("Ingrese otro numero");
        Scanner valor2 = new Scanner(System.in);
        b = valor2.nextDouble();
        
       suma = a + b;
       resta = a - b;
       multi = a + b;
       div = a / b;
              
        
        System.out.println("cual operacion desea realizar");
        System.out.println("1.suma");  
        System.out.println("2.resta");
        System.out.println("3.multiplicaion");
        System.out.println("4.division");
        System.out.println("5.salir");
        
        do{
        
        System.out.print("elija una opcion: ");
        Scanner opcion = new Scanner (System.in);
        op = opcion.nextInt();
        
        switch(op) {
            
            case 1: System.out.println("la suma de los valores ingresados es: "+suma);
            break;
            case 2: System.out.println("La resta de los valores ingresados es: "+resta);
            break;
            case 3: System.out.println("la multiplicacion de los valores ingresados es: "+multi);
            break;
            case 4: System.out.println("La division de los valores ingresados es: "+div);
            break;
            case 5: System.out.println("realmente desea salir?");
                System.out.println("ingrese S para si, N para no");
            String letra = opcion.next(); 
            switch(letra){
                case "s" :
                    band = false;
                    break;
                case "n":
                    band = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }             
    }
    
    }while(band = true);
  }
}




    
        
        
        
    

 
