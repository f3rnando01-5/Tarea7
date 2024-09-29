/*
Este programa solicita el precio de un producto. Si el precio es mayor a 2500, se aplica un descuento del 10%. 
El ciclo se repite para calcular el descuento hasta .parar el ciclo
 */
package programas;

import java.util.Scanner;

public class ejercicio2 {
    //declarar variables
    public static void main(String[] args) {
   Scanner lectura = new Scanner(System.in);
        double precio, precioFinal;
        char continuar;
        
        do {
            System.out.print("Introduce el precio del producto: ");
            precio = lectura.nextDouble();
            
            if (precio >= 2500) {
                precioFinal = precio * 0.90;
                System.out.println("Se ha aplicado un 10% de descuento.");
            } else {
                precioFinal = precio;
                System.out.println("No se ha aplicado descuento.");
            }
            
            System.out.println("El precio final es: " + precioFinal);
            
            System.out.print("¿Quieres calcular el precio de otro producto? (s/n): ");
            continuar = lectura.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');

    }
}