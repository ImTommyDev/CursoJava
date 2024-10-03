package Clases.Segunda_Variables;

/**
 * Esta clase demuestra cómo declarar, mostrar, modificar y volver a mostrar
 * variables de los tipos básicos en Java.
 */
public class Segunda_Variables {

    public static void main(String[] args) {

        // Declaración de variables con valores iniciales
        int numeroEntero = 10;             // Variable de tipo entero
        double numeroDecimal = 20.5;       // Variable de tipo decimal
        char letra = 'A';                  // Variable de tipo carácter
        boolean esVerdadero = true;        // Variable de tipo booleano
        String texto = "Hola, Java!";      // Variable de tipo cadena de texto (String)

        // Mostrar valores originales de las variables
        System.out.println("Valores iniciales:");
        System.out.println("Número Entero: " + numeroEntero);   // Imprime el valor entero
        System.out.println("Número Decimal: " + numeroDecimal); // Imprime el valor decimal
        System.out.println("Carácter: " + letra);               // Imprime el valor carácter
        System.out.println("Booleano: " + esVerdadero);         // Imprime el valor booleano
        System.out.println("Cadena de texto: " + texto);        // Imprime la cadena de texto

        // Modificación de las variables
        numeroEntero = 100;               // Cambiar valor del entero
        numeroDecimal = 50.75;            // Cambiar valor del decimal
        letra = 'B';                      // Cambiar valor del carácter
        esVerdadero = false;              // Cambiar valor del booleano
        texto = "Adiós, Java!";           // Cambiar valor de la cadena de texto

        // Mostrar valores modificados de las variables
        System.out.println("\nValores modificados:");
        System.out.println("Número Entero: " + numeroEntero);   // Imprime el nuevo valor entero
        System.out.println("Número Decimal: " + numeroDecimal); // Imprime el nuevo valor decimal
        System.out.println("Carácter: " + letra);               // Imprime el nuevo valor carácter
        System.out.println("Booleano: " + esVerdadero);         // Imprime el nuevo valor booleano
        System.out.println("Cadena de texto: " + texto);        // Imprime la nueva cadena de texto
    }
}

//EJERCICIO -> En la carpeta "Ejercicios" encontrarás el segundo reto, suerte!!