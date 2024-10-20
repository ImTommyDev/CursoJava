package Clases;

/*
 * En esta clase vamos a explorar la clase Random de Java, que se utiliza para generar números aleatorios.
 * Aprenderemos a generar diferentes tipos de números aleatorios, como enteros, decimales y booleanos.
 * También veremos cómo establecer un número inicial (seed) para obtener una secuencia predecible de números aleatorios.
 * */

import java.util.Random;

public class Quinta_Random {

    public static void main(String[] args) {

        // Crear un objeto Random
        Random random = new Random();

        // 1. Generar un número entero aleatorio
        int numeroAleatorioEntero = random.nextInt();
        System.out.println("1. Número entero aleatorio: " + numeroAleatorioEntero);

        // 2. Generar un número entero aleatorio en un rango específico (0-9)
        int numeroAleatorioRango = random.nextInt(10); // 0 (inclusive) hasta 10 (exclusive)
        System.out.println("2. Número entero aleatorio entre 0 y 9: " + numeroAleatorioRango);

        // 3. Generar un número decimal aleatorio (double)
        double numeroAleatorioDecimal = random.nextDouble();
        System.out.println("3. Número decimal aleatorio (0.0 a 1.0): " + numeroAleatorioDecimal);

        // 4. Generar un número decimal aleatorio en un rango específico (0.0-5.0)
        double numeroAleatorioDecimalRango = random.nextDouble() * 5; // 0.0 (inclusive) hasta 5.0 (exclusive)
        System.out.println("4. Número decimal aleatorio entre 0.0 y 5.0: " + numeroAleatorioDecimalRango);

        // 5. Generar un booleano aleatorio
        boolean booleanoAleatorio = random.nextBoolean();
        System.out.println("5. Booleano aleatorio: " + booleanoAleatorio);

        // 6. Establecer una semilla para la secuencia de números aleatorios
        random.setSeed(12345); // Fijar la semilla
        System.out.println("\nSecuencia predecible con la semilla 12345:");

        // Generar una secuencia de números aleatorios utilizando la misma semilla
        for (int i = 0; i < 5; i++) {
            System.out.println("Número aleatorio con semilla: " + random.nextInt(100)); // 0-99
        }

        // 7. Generar un número entero aleatorio en un rango (10 a 50)
        int numeroAleatorioRangoPersonalizado = random.nextInt(41) + 10; // 10 (inclusive) hasta 50 (exclusive)
        System.out.println("\n6. Número entero aleatorio entre 10 y 50: " + numeroAleatorioRangoPersonalizado);
    }
}
// EJERCICIO -> En la carpeta "Ejercicios" encontrarás el quinto reto, suerte!!
