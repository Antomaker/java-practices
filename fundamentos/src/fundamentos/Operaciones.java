/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author jocde
 */
import java.util.Scanner;

public class Operaciones {
    public void realizarOperaciones(Scanner scanner) {
        System.out.print("\nIngrese el primer número: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        int num2 = scanner.nextInt();

        System.out.println("\n--- Operaciones Matemáticas ---");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num2 != 0 ? (num1 / num2) : "No se puede dividir entre 0"));
        System.out.println("Módulo: " + (num2 != 0 ? (num1 % num2) : "No se puede calcular el módulo con 0"));
    }
}

