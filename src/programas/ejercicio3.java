/*
El rograma que permita conocer  si ingresamos un numero  positivo o negativo,
finalizara el programa al  ingresar el numero 0.

*/

package programas;

import  java.util.Scanner;
public class ejercicio3 {
     public static void main(String[] args) {
         //declarar de variables
        Scanner scanner = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        //proceso de datos
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            if (numero > 0) positivos++;
            else if (numero < 0) negativos++;
            else ceros++;
        } while (numero != 0);
        //Salida de datos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}


    
