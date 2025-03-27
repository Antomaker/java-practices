/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author jocde
 */
public class ExpresionesOperadores {
    public String obtenerExplicacion() {
        return """
            En Java, las expresiones y operadores se utilizan para realizar cálculos y operaciones lógicas.

            **Tipos de Operadores en Java:**
            - **Aritméticos:** `+`, `-`, `*`, `/`, `%` (modulo)
            - **Relacionales:** `==`, `!=`, `>`, `<`, `>=`, `<=`
            - **Lógicos:** `&&` (AND), `||` (OR), `!` (NOT)
            - **Asignación:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`
            - **Incremento y Decremento:** `++`, `--`
            - **Ternario:** `condicion ? valor_si_true : valor_si_false`

            **Ejemplo de uso de operadores en Java:**
            ```java
            int a = 10, b = 5;
            int suma = a + b;
            boolean esMayor = a > b;
            boolean resultado = (a > 5) && (b < 10);
            System.out.println("Suma: " + suma);
            System.out.println("Es mayor?: " + esMayor);
            System.out.println("Resultado lógico: " + resultado);
            ```
            """;
    }
}
