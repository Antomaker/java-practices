/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class Excepciones {
    public String obtenerExplicacion() {
        return """
            En Java, una **excepción** es un evento que interrumpe el flujo normal del programa. 
            Java maneja las excepciones mediante `try`, `catch` y `finally`.

            **Manejo de Excepciones:**
            ```java
            try {
                int resultado = 10 / 0; // Esto genera una excepción
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero.");
            } finally {
                System.out.println("Este bloque siempre se ejecuta.");
            }
            ```

            **Tipos de Excepciones Comunes en Java:**
            - `ArithmeticException` → División por cero.
            - `NullPointerException` → Intentar acceder a un objeto nulo.
            - `ArrayIndexOutOfBoundsException` → Índice fuera de los límites del array.
            - `IOException` → Error en entrada/salida de datos.

            **Propagación de Excepciones con `throws`:**
            ```java
            public void metodo() throws IOException {
                throw new IOException("Error de entrada/salida");
            }
            ```

            **Creación de Excepciones Personalizadas:**
            ```java
            class MiExcepcion extends Exception {
                public MiExcepcion(String mensaje) {
                    super(mensaje);
                }
            }
            
            public void lanzarExcepcion() throws MiExcepcion {
                throw new MiExcepcion("Ocurrió un error personalizado.");
            }
            ```

            Es importante manejar las excepciones correctamente para evitar fallos inesperados en el programa.
            """;
    }
}

