/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class ModificadoresVisibilidad {
    public String obtenerExplicacion() {
        return """
            Los modificadores de visibilidad en Java controlan el acceso a las clases, atributos y métodos.

            **Tipos de modificadores:**
            - `public`: Accesible desde cualquier parte del programa.
            - `private`: Solo accesible dentro de la misma clase.
            - `protected`: Accesible en la misma clase, subclases y dentro del mismo paquete.
            - (sin modificador - paquete): Accesible solo dentro del mismo paquete.

            **Ejemplo de modificadores de visibilidad:**
            ```java
            public class Persona {
                private String nombre;
                protected int edad;
                public String getNombre() {
                    return nombre;
                }
            }
            ```
            """;
    }
}

