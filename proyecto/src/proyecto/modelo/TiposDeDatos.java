/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class TiposDeDatos {
      public String obtenerExplicacion() {
         return """
        En Java, los tipos de datos se dividen en:

        **1. Tipos primitivos:**
        - `byte` (8 bits, -128 a 127)
        - `short` (16 bits, -32,768 a 32,767)
        - `int` (32 bits, -2^31 a 2^31-1)
        - `long` (64 bits, -2^63 a 2^63-1)
        - `float` (32 bits, números decimales)
        - `double` (64 bits, mayor precisión decimal)
        - `char` (16 bits, un solo carácter Unicode)
        - `boolean` (true o false)

        **2. Tipos Referenciados:**
        - `String` (cadenas de texto)
        - `Arrays` (colección de elementos del mismo tipo)
        - `Clases y Objetos`

        Ejemplo de declaración:
        ```java
        int numero = 10;
        double decimal = 5.5;
        boolean esVerdadero = true;
        char letra = 'A';
        String texto = "Hola, Java";
        ```
        """;
    }
}
