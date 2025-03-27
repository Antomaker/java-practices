/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class PaquetesStringMath {
    public String obtenerExplicacion() {
        return """
            En Java, los paquetes `java.lang.String` y `java.lang.Math` proporcionan métodos útiles para trabajar 
            con cadenas de texto y cálculos matemáticos.

            **Manejo de Cadenas con `String`:**
            ```java
            String texto = "Hola, Java!";
            System.out.println(texto.length());  // Longitud de la cadena
            System.out.println(texto.toUpperCase());  // Convertir a mayúsculas
            System.out.println(texto.toLowerCase());  // Convertir a minúsculas
            System.out.println(texto.charAt(1));  // Obtener el carácter en la posición 1
            System.out.println(texto.replace("Java", "Mundo"));  // Reemplazar texto
            ```
            
            **Operaciones Matemáticas con `Math`:**
            ```java
            System.out.println(Math.PI);  // Valor de PI
            System.out.println(Math.sqrt(25));  // Raíz cuadrada de 25
            System.out.println(Math.pow(2, 3));  // Potencia 2^3
            System.out.println(Math.abs(-10));  // Valor absoluto de -10
            System.out.println(Math.random());  // Número aleatorio entre 0 y 1
            ```
            
            **Uso Combinado:**
            ```java
            int numero = (int) (Math.random() * 100);  // Número aleatorio entre 0 y 99
            String mensaje = "Número generado: " + numero;
            System.out.println(mensaje.toUpperCase());
            ```
            
            Estos paquetes son esenciales en el desarrollo de aplicaciones en Java, 
            permitiendo manipular texto y realizar cálculos avanzados.
            """;
    }
}
