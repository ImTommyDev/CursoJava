package Clases.Segunda_Variables;

import java.util.Scanner;

/**
 * Esta clase guía al usuario a realizar operaciones básicas con variables de diferentes tipos en Java.
 * El usuario ingresará valores, realizará operaciones con ellos y verá el resultado.
 */
public class Tercera_UsandoVariables {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();

        // Pedir al usuario un número decimal
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Pedir al usuario un carácter
        System.out.print("Ingresa un carácter: ");
        char letra = scanner.next().charAt(0);

        // Pedir al usuario un valor booleano
        System.out.print("¿Es verdadero? (true/false): ");
        boolean esVerdadero = scanner.nextBoolean();

        // Limpiar el buffer para evitar problemas con el ingreso del String
        scanner.nextLine(); // Captura el salto de línea pendiente

        // Pedir al usuario una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        // Mostrar los valores ingresados
        System.out.println("\nHas ingresado los siguientes valores:");
        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Carácter: " + letra);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Cadena de texto: " + texto);

        // Operaciones con los valores ingresados
        // Suma del entero y el decimal
        double suma = numeroEntero + numeroDecimal;
        System.out.println("\nSuma del número entero y el número decimal: " + suma);

        // Concatenación de la cadena de texto con el carácter
        String concatenacion = texto + letra;
        System.out.println("Concatenación de la cadena de texto con el carácter: " + concatenacion);

        // Negación del valor booleano
        boolean negacion = !esVerdadero;
        System.out.println("Negación del valor booleano: " + negacion);
    }
}
