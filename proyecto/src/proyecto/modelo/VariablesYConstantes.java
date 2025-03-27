/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class VariablesYConstantes {
    public String obtenerExplicacion() {
        return """
        En Java, una variable es un espacio en memoria con un nombre asignado donde se almacena un valor.
        El valor de una variable puede cambiar durante la ejecución del programa.

        **Declaración de variables:**
        ```java
        int edad = 25;
        double precio = 19.99;
        boolean activo = true;
        String nombre = "Juan";
        ```

        Las constantes son valores que no pueden cambiar después de ser asignados. Se declaran con la palabra clave `final`.

        **Ejemplo de constantes:**
        ```java
        final double PI = 3.1416;
        final int MAXIMO = 100;
        ```
        """;
    }
}
