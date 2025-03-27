/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class EstructuraProgramaJava {
     public String obtenerExplicacion() {
         return """
        Un programa en Java consta de las siguientes partes:
        1. **Paquete**: Define el paquete al que pertenece la clase.
        2. **Importaciones**: Permiten el uso de clases de otros paquetes.
        3. **Clase Principal**: Contiene el método main.
        4. **Método main**: Es el punto de entrada de ejecución del programa.
        
        Ejemplo de un programa en Java:
        ```java
        public class MiPrograma {
            public static void main(String[] args) {
                System.out.println("¡Hola, mundo!");
            }
        }
        ```
        """;
    }
}
