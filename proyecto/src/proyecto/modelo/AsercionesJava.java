/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class AsercionesJava {
    public String obtenerExplicacion() {
        return """
            **Aserciones en Java**
            
            En Java, las **aserciones** (`assert`) son una herramienta de depuración utilizada para verificar 
            suposiciones en el código. Si la condición de la aserción es `false`, el programa lanza un `AssertionError`.

            **Sintaxis básica:**
            ```java
            assert condicion : "Mensaje de error";
            ```

            **Ejemplo 1: Comprobación de valores**
            ```java
            int edad = -5;
            assert edad >= 0 : "La edad no puede ser negativa";
            ```

            **Ejemplo 2: Uso en métodos**
            ```java
            public static int dividir(int a, int b) {
                assert b != 0 : "El divisor no puede ser cero";
                return a / b;
            }
            ```

            **Habilitación de aserciones:**  
            Por defecto, las aserciones están **desactivadas** en Java. Para activarlas, se usa la opción `-ea` al ejecutar:
            ```shell
            java -ea MiPrograma
            ```

            **Cuándo usar aserciones:**  
            - Para verificar condiciones en el código durante el desarrollo.  
            - Para evitar errores en cálculos o flujos lógicos.  
            - No se recomienda en validaciones de entrada de usuario.  

            Las aserciones son útiles para detectar errores en la fase de desarrollo sin afectar el rendimiento en producción.
            """;
    }
}

