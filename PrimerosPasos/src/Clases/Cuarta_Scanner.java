package Clases;

// Importamos la clase Scanner desde el paquete java.util
import java.util.Scanner;

public class Cuarta_Scanner {

    public static void main(String[] args) {

        // 1. Crear un objeto Scanner para leer datos desde la consola
        Scanner sc = new Scanner(System.in);  // Inicialización del Scanner, leerá desde la consola (System.in)

        // Ejemplo 1: Leer un String (línea completa)
        System.out.println("Por favor, introduce tu nombre:");
        String nombre = sc.nextLine();  // nextLine() lee toda la línea escrita por el usuario
        System.out.println("Hola, " + nombre + "!");

        // Ejemplo 2: Leer un entero
        System.out.println("\nIntroduce tu edad:");
        int edad = sc.nextInt();  // nextInt() lee el siguiente número entero
        System.out.println("Tienes " + edad + " años.");

        // Ejemplo 3: Leer un número de tipo float (decimal)
        System.out.println("\nIntroduce tu altura en metros (ejemplo: 1.75):");
        float altura = sc.nextFloat();  // nextFloat() lee un número decimal de tipo float
        System.out.println("Tu altura es: " + altura + " metros.");

        // Ejemplo 4: Leer un solo carácter
        System.out.println("\nIntroduce tu inicial de nombre:");
        char inicial = sc.next().charAt(0);  // next() obtiene la siguiente cadena, charAt(0) selecciona el primer carácter
        System.out.println("Tu inicial es: " + inicial);

        // Ejemplo 5: Leer múltiples tipos de datos seguidos
        System.out.println("\nIntroduce tu nombre, edad y altura separados por espacios (ejemplo: Juan 25 1.80):");
        String nombreCompleto = sc.next();  // Primer string (nombre)
        int edadCompleta = sc.nextInt();    // Número entero (edad)
        double alturaCompleta = sc.nextDouble();  // Número decimal (altura)
        System.out.println("Nombre: " + nombreCompleto + ", Edad: " + edadCompleta + ", Altura: " + alturaCompleta);

        // Ejemplo 6: Comprobación de tipos de entrada
        System.out.println("\nVamos a comprobar si el siguiente valor que introduces es un número entero:");
        if (sc.hasNextInt()) {  // hasNextInt() verifica si el próximo valor es un número entero
            int numero = sc.nextInt();
            System.out.println("Has introducido el número entero: " + numero);
        } else {
            System.out.println("Lo siento, eso no es un número entero válido.");
        }

        // Ejemplo 7: Leer booleanos
        System.out.println("\nIntroduce 'true' o 'false' para continuar:");
        boolean continuar = sc.nextBoolean();  // nextBoolean() lee un valor booleano (true o false)
        if (continuar) {
            System.out.println("Has elegido continuar.");
        } else {
            System.out.println("Has elegido no continuar.");
        }

        // Ejemplo 8: Leer un número largo (long)
        System.out.println("\nIntroduce un número muy grande (tipo long):");
        long numeroGrande = sc.nextLong();  // nextLong() lee un número largo
        System.out.println("El número grande introducido es: " + numeroGrande);

        // Ejemplo 9: Manejar excepciones al introducir datos incorrectos
        System.out.println("\nVamos a intentar capturar un error si introduces un dato incorrecto.");
        try {
            System.out.println("Introduce un número entero:");
            int numeroEntero = sc.nextInt();  // Si no introduces un entero, lanzará una excepción
            System.out.println("Has introducido el número: " + numeroEntero);
        } catch (Exception e) {
            System.out.println("Error: Has introducido un valor no válido. Solo se permiten números enteros.");
            sc.nextLine();  // Limpiar el buffer de entrada después de un error
        }

        // Ejemplo 10: Uso de nextLine() después de nextInt()
        System.out.println("\nIntroduce tu código postal:");
        int codigoPostal = sc.nextInt();  // nextInt() deja un salto de línea en el buffer
        sc.nextLine();  // Consumir el salto de línea que queda en el buffer de entrada
        System.out.println("Introduce tu dirección completa:");
        String direccion = sc.nextLine();  // nextLine() ahora funcionará correctamente
        System.out.println("Tu dirección es: " + direccion + " y tu código postal es: " + codigoPostal);

        // Ejemplo 11: Leer valores decimales (double) con control
        System.out.println("\nIntroduce tu peso en kilogramos (ejemplo: 70.5):");
        while (!sc.hasNextDouble()) {  // Controlamos que la entrada sea un número decimal válido
            System.out.println("Error: Debes introducir un número decimal válido.");
            sc.next();  // Consumir el valor no válido
        }
        double peso = sc.nextDouble();
        System.out.println("Tu peso es: " + peso + " kilogramos.");

        // Cerrar el Scanner al final para liberar recursos
        sc.close();  // Es importante cerrar el Scanner una vez que terminemos de usarlo
    }
}

//EJERCICIO -> En la carpeta "Ejercicios" encontrarás el cuarto reto, suerte!!
