

package EdadMama;

import java.util.Scanner;

public class EdadMama {
    public static void main(String[] args) {
        int edad_juan, edad_ana, edad_alberto, edad_mama;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola Juan, por favor ingresa tu edad: ");
        edad_juan = entrada.nextInt();

        edad_alberto = 2 * (edad_juan / 3);
        edad_ana = 4 * (edad_juan / 3);
        edad_mama = edad_juan + edad_alberto + edad_ana;

        System.out.println("La edad de Alberto es: " + edad_alberto + " años");
        System.out.println("La edad de Ana es: " + edad_ana + " años");
        System.out.println("La edad de la Mamá es: " + edad_mama + " años");

    }
}