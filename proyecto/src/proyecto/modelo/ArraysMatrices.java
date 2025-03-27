/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class ArraysMatrices {
    public String obtenerExplicacion() {
        return """
            En Java, un **array** es una estructura de datos que almacena múltiples valores del mismo tipo en posiciones contiguas de memoria.
            
            **Declaración y uso de Arrays:**
            ```java
            int[] numeros = {1, 2, 3, 4, 5};
            System.out.println("Primer elemento: " + numeros[0]); // Imprime 1
            ```
            
            También se pueden inicializar con un tamaño fijo:
            ```java
            int[] edades = new int[3];
            edades[0] = 20;
            edades[1] = 25;
            edades[2] = 30;
            ```

            **Recorrido de un Array con `for`:**
            ```java
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Elemento en índice " + i + ": " + numeros[i]);
            }
            ```
            
            **Matrices (Arrays Multidimensionales):**
            Una **matriz** es un array bidimensional que almacena valores en filas y columnas.
            ```java
            int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Elemento en fila 1, columna 2: " + matriz[1][2]); // Imprime 6
            ```

            **Recorrido de una Matriz con `for`:**
            ```java
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            ```
            """;
    }
}

