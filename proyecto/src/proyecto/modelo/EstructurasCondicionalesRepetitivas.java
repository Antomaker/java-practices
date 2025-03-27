/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class EstructurasCondicionalesRepetitivas {
    public String obtenerExplicacion() {
        return """
            En Java, las estructuras de control permiten ejecutar código de manera condicional o repetitiva.

            **Estructuras Condicionales (if, else, switch):**
            - `if`: Evalúa una condición y ejecuta el bloque si es verdadera.
            ```java
            int edad = 18;
            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
            ```
            - `switch`: Evalúa múltiples casos en función de un valor.
            ```java
            int dia = 2;
            switch (dia) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                default -> System.out.println("Día no válido");
            }
            ```

            **Estructuras Repetitivas (for, while, do-while):**
            - `for`: Se usa cuando se conoce el número exacto de iteraciones.
            ```java
            for (int i = 0; i < 5; i++) {
                System.out.println("Iteración: " + i);
            }
            ```
            - `while`: Se usa cuando la condición es evaluada antes de ejecutar el bloque.
            ```java
            int contador = 0;
            while (contador < 3) {
                System.out.println("Contador: " + contador);
                contador++;
            }
            ```
            - `do-while`: Ejecuta el bloque al menos una vez antes de evaluar la condición.
            ```java
            int numero;
            do {
                System.out.println("Ingrese un número positivo:");
                numero = scanner.nextInt();
            } while (numero < 0);
            ```
            """;
    }
}

