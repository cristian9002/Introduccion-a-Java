//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
package Java_Introduccion;

import java.util.Scanner;


public class Ejercicio15 {
    public static void main(String[] args) {
        
        int num, i, sumador;
        boolean band;
        
        
        sumador = 0;
        
        for(  i=0 ; i<=20 ; i++){
            
             System.out.println("Ingrese una numero a sumar o 0 para finalizar");
        Scanner valor = new Scanner(System.in);
        num = valor.nextInt();
        
            
        if (num == 0){
            System.out.println("El numero 0 se ah encontrado");
            break;
           
        }else if(num > 0){  
         
            sumador= num + sumador;
            System.out.println("La suma de los numero ingresados es: "+sumador);
            
        }
              
        }
    }
    
}
