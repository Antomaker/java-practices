/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class EntradaSalidaConsola {
    public String obtenerExplicacion() {
        return """
            En Java, la entrada y salida de datos por consola se maneja mediante la clase `Scanner` y `System.out`.

            **Entrada de datos con `Scanner`:**
            ```java
            import java.util.Scanner;
            
            public class EjemploEntrada {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Hola, " + nombre + "!");
                    scanner.close();
                }
            }
            ```

            **Salida de datos con `System.out.println()`:**
            - `System.out.println("Texto")`: Imprime con salto de línea.
            - `System.out.print("Texto")`: Imprime sin salto de línea.
            - `System.out.printf("Formato", valores)`: Permite formato en la salida.

            **Ejemplo de salida formateada:**
            ```java
            double precio = 10.5;
            System.out.printf("El precio es: %.2f%n", precio);
            ```
            """;
    }
}

