package app.controllers;

import app.database.FakeDB;
import app.database.UserStorage;
import app.models.Usuario;
import java.util.Scanner;

public class LoginController {

    public static Usuario login(Scanner sc) {
        UserStorage.loadUsers();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        while (email.isEmpty()) {
            System.out.print("Email não pode ser vazio. Digite novamente: ");
            email = sc.nextLine().trim();
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine().trim();
        while (senha.isEmpty()) {
            System.out.print("Senha não pode ser vazia. Digite novamente: ");
            senha = sc.nextLine().trim();
        }

        for (Usuario u : FakeDB.usuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }

        return null;
    }
}
