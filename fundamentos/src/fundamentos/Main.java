/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Operaciones operaciones = new Operaciones();
        EstructurasControl estructuras = new EstructurasControl();
        Colecciones colecciones = new Colecciones();
        boolean salir = false;

        usuario.pedirDatos(scanner);

        do {
            System.out.println("\n========= MENÚ =========");
            System.out.println("1. Mostrar datos del usuario");
            System.out.println("2. Operaciones matemáticas");
            System.out.println("3. Verificar edad y estructuras de control");
            System.out.println("4. Ejecutar bucles");
            System.out.println("5. Ingresar números en el Array");
            System.out.println("6. Ingresar nombres en ArrayList");
            System.out.println("7. Visualizar datos almacenados");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 1:
                        usuario.mostrarDatos();
                        break;
                    case 2:
                        operaciones.realizarOperaciones(scanner);
                        break;
                    case 3:
                        estructuras.verificarEdad(scanner);
                        break;
                    case 4:
                        estructuras.ejecutarBucles();
                        break;
                    case 5:
                        colecciones.manejarArrays(scanner);
                        break;
                    case 6:
                        colecciones.manejarArrayList(scanner);
                        break;
                    case 7:
                        colecciones.visualizarDatos();
                        break;
                    case 8:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Ingrese un número.");
                scanner.next();
            }

        } while (!salir);

        scanner.close();
    }
}
