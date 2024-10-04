package Clases;

/*
* En esta clase vamos a ver los métodos básicos de la clase String en Java, los cuales son fundamentales para la manipulación de cadenas de texto.
* El objetivo es que te familiarices con estos métodos y aprendas a trabajar con strings en distintas situaciones comunes de la programación.
* */

public class Tercera_Strings {

    public static void main(String[] args) {

        // Creación de un String de ejemplo
        String texto = "Bienvenidos al curso de Java!";

        // Imprimir el String original
        System.out.println("String original: " + texto);

        // 1. length(): Devuelve la longitud del String
        int longitud = texto.length();
        System.out.println("1. Longitud del String: " + longitud);

        // 2. charAt(): Devuelve el carácter en una posición específica
        char caracter = texto.charAt(5);
        System.out.println("2. Carácter en la posición 5: " + caracter);

        // 3. substring(inicio): Devuelve una subcadena desde el índice especificado hasta el final
        String subcadena = texto.substring(13);
        System.out.println("3. Subcadena desde la posición 13: " + subcadena);

        // 4. substring(inicio, fin): Devuelve una subcadena entre los índices especificados
        String subcadena2 = texto.substring(13, 18);
        System.out.println("4. Subcadena entre la posición 13 y 18: " + subcadena2);

        // 5. indexOf(): Devuelve el índice de la primera aparición de un carácter o subcadena
        int indice = texto.indexOf("curso");
        System.out.println("5. Índice de la palabra 'curso': " + indice);

        // 6. lastIndexOf(): Devuelve el índice de la última aparición de un carácter o subcadena
        int ultimoIndice = texto.lastIndexOf('a');
        System.out.println("6. Último índice del carácter 'a': " + ultimoIndice);

        // 7. toUpperCase(): Convierte el String a mayúsculas
        String mayusculas = texto.toUpperCase();
        System.out.println("7. Texto en mayúsculas: " + mayusculas);

        // 8. toLowerCase(): Convierte el String a minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("8. Texto en minúsculas: " + minusculas);

        // 9. equals(): Compara si dos Strings son iguales (distingue entre mayúsculas y minúsculas)
        boolean sonIguales = texto.equals("Bienvenidos al curso de Java!");
        System.out.println("9. ¿El texto es igual a 'Bienvenidos al curso de Java!'?: " + sonIguales);

        // 10. equalsIgnoreCase(): Compara si dos Strings son iguales (sin distinguir entre mayúsculas y minúsculas)
        boolean sonIgualesIgnorandoCase = texto.equalsIgnoreCase("bienvenidos al curso de java!");
        System.out.println("10. ¿El texto es igual a 'bienvenidos al curso de java!' ignorando mayúsculas?: " + sonIgualesIgnorandoCase);

        // 11. contains(): Verifica si una subcadena está presente dentro del String
        boolean contiene = texto.contains("curso");
        System.out.println("11. ¿El texto contiene la palabra 'curso'?: " + contiene);

        // 12. replace(): Reemplaza todas las apariciones de un carácter o subcadena por otra
        String reemplazado = texto.replace("Java", "programación");
        System.out.println("12. Reemplazar 'Java' por 'programación': " + reemplazado);

        // 13. trim(): Elimina los espacios en blanco al inicio y al final del String
        String conEspacios = "   Hola Java   ";
        String sinEspacios = conEspacios.trim();
        System.out.println("13. Eliminar espacios en blanco del texto: '" + sinEspacios + "'");

        // 14. startsWith(): Verifica si el String empieza con una subcadena específica
        boolean empiezaCon = texto.startsWith("Bienvenidos");
        System.out.println("14. ¿El texto empieza con 'Bienvenidos'?: " + empiezaCon);

        // 15. endsWith(): Verifica si el String termina con una subcadena específica
        boolean terminaCon = texto.endsWith("Java!");
        System.out.println("15. ¿El texto termina con 'Java!'?: " + terminaCon);

        // 16. isEmpty(): Verifica si el String está vacío
        String textoVacio = "";
        boolean estaVacio = textoVacio.isEmpty();
        System.out.println("16. ¿El String está vacío?: " + estaVacio);

        // 17. concat(): Concatena el String con otro String
        String saludo = "Hola, ";
        String nombre = "Mundo";
        String concatenado = saludo.concat(nombre);
        System.out.println("17. Concatenar 'Hola, ' con 'Mundo': " + concatenado);

        // 18. split(): Divide el String en un array de Strings según un delimitador
        String[] palabras = texto.split(" ");
        System.out.println("18. Dividir el texto en palabras:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // 19. compareTo(): Compara dos Strings lexicográficamente
        int comparacion = texto.compareTo("Bienvenidos al curso de Python!");
        System.out.println("19. Comparar el texto con 'Bienvenidos al curso de Python!': " + comparacion);

        // 20. compareToIgnoreCase(): Compara dos Strings lexicográficamente, ignorando mayúsculas y minúsculas
        int comparacionIgnoreCase = texto.compareToIgnoreCase("bienvenidos al curso de java!");
        System.out.println("20. Comparar el texto con 'bienvenidos al curso de java!' (ignorando mayúsculas): " + comparacionIgnoreCase);
    }
}
//EJERCICIO -> En la carpeta "Ejercicios" encontrarás el tercer reto, suerte!!