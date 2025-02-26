/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author jocde
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {
    private int[] numeros = {1, 2, 3, 4, 5};
    private ArrayList<String> listaNombres = new ArrayList<>();

    // Método para manejar arrays (numéricos)
    public void manejarArrays(Scanner scanner) {
        System.out.println("\n--- Ingresar números al Array ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consumir salto de línea
    }

    // Método para manejar listas dinámicas
    public void manejarArrayList(Scanner scanner) {
        System.out.println("\nIngrese nombres a la lista (escriba 'salir' para terminar): ");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;
            listaNombres.add(nombre);
        }
    }

    // Método para visualizar datos almacenados en Array y ArrayList
    public void visualizarDatos() {
        System.out.println("\n--- Visualizando datos almacenados ---");

        // Mostrar números almacenados en el array
        System.out.println("📌 Números en el Array:");
        for (int num : numeros) {
            System.out.println("- " + num);
        }

        // Mostrar nombres almacenados en el ArrayList
        if (listaNombres.isEmpty()) {
            System.out.println("\n📌 La lista de nombres está vacía.");
        } else {
            System.out.println("\n📌 Nombres en el ArrayList:");
            for (String nombre : listaNombres) {
                System.out.println("- " + nombre);
            }
        }
    }
}
