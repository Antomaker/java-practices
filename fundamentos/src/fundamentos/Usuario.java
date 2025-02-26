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

public class Usuario {
    private String nombre;
    private int edad;
    private double altura;
    private boolean esMayor;

    public void pedirDatos(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        while (!scanner.hasNextInt()) { // Validación de entrada numérica
            System.out.println("Por favor, ingrese un número válido para la edad.");
            scanner.next();
        }
        this.edad = scanner.nextInt();

        System.out.print("Ingrese su altura en metros: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido para la altura.");
            scanner.next();
        }
        this.altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea pendiente

        this.esMayor = edad >= 18;
    }

    public void mostrarDatos() {
        System.out.println("\n--- Datos del Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Mayor de edad: " + esMayor);
    }
}

