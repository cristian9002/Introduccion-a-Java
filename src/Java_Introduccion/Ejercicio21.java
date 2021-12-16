//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//los muestre por pantalla en orden descendente.
package Java_Introduccion;


public class Ejercicio21 {
    public static void main(String[] args) {
        
        int i;
        
        int[] vec = new int[100];
        
        for( i = vec.length -1  ; i >= 0 ; i--){
            
            vec[i]= i + 1;
            
            System.out.println("valores del vector: "+vec[i]);
        }
    }
    
}
