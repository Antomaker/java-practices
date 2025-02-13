/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1.controller;

import caso1.model.User;
import caso1.view.UserView;

/**
 *
 * @author jocde
 */
public class UserController {
    private User model;
    private UserView view;

    // Constructor
    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos del controlador
    public void setUserName(String name) {
        model.setName(name);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserAge(int age) {
        model.setAge(age);
    }

    public int getUserAge() {
        return model.getAge();
    }

    public void updateView() {
        view.printUserDetails(model.getName(), model.getAge());
    }
}
