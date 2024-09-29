
package programas;
/* el programa permite ingresar varias veces los numeros de 1 al 9  y muestra cuántas veces se ingresó cada numero digitado para detener  digita "0"

*/
import java.util.Scanner;
public class ejercicio1 {
    //entrada de datos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frecuencia = new int[10];  
        int number;
        //proceso de datos
        do {
            System.out.print("Introduce un numero del 1 al 9 (0 para terminar): ");
            number = scanner.nextInt();

            if (number >= 1 && number <= 10) {
                frecuencia[number]++;
            }

        } while (number != 0);
        //salida de datos
        System.out.println("Frecuencia de números:");
        for (int i = 1; i < frecuencia.length; i++) {
            System.out.println(i + ": " + frecuencia[i] + " veces");
        }

    }
}
