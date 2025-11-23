package app.controllers;

import app.database.FakeDB;
import app.database.UserStorage;
import app.models.Usuario;
import java.util.Scanner;

public class LoginController {
    public static Usuario login(Scanner sc) {
        UserStorage.loadUsers();

        String email = sc.nextLine();
        String senha = sc.nextLine();

        for (Usuario u : FakeDB.usuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }

        return null;
    }
}
