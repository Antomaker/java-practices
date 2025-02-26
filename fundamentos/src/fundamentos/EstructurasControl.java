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

public class EstructurasControl {
    public void verificarEdad(Scanner scanner) {
        System.out.print("\nIngrese su edad para verificar permisos: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }

        switch (edad) {
            case 18:
                System.out.println("Acabas de alcanzar la mayoría de edad.");
                break;
            case 30:
                System.out.println("Tienes 30 años, disfruta la madurez.");
                break;
            default:
                System.out.println("Edad no específica en el sistema.");
        }
    }

    public void ejecutarBucles() {
        System.out.println("\n--- Contador con for ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("\n--- Contador con while ---");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }
    }
}

