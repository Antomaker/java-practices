/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import caso1.controller.UserController;
import caso1.model.User;
import caso1.view.UserView;

/**
 *
 * @author jocde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear el modelo (datos del usuario)
        User user = new User("Juan Pérez", 25);

        // Crear la vista (interfaz de usuario)
        UserView view = new UserView();

        // Crear el controlador (conecta modelo y vista)
        UserController controller = new UserController(user, view);

        // Mostrar datos iniciales
        controller.updateView();

        // Modificar el modelo
        controller.setUserName("Carlos López");
        controller.setUserAge(30);

        // Mostrar datos actualizados
        controller.updateView();
    }
    
}
