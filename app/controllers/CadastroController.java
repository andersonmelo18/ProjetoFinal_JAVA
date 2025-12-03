package app.controllers;

import app.database.FakeDB;
import app.database.UserStorage;
import app.models.Usuario;
import java.util.Scanner;

public class CadastroController {

    public static Usuario cadastrar(Scanner sc) {

        System.out.println("\n== CADASTRO ==");

        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        while (nome.isEmpty()) {
            System.out.print("Nome não pode ser vazio. Digite novamente: ");
            nome = sc.nextLine().trim();
        }

        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        while (email.isEmpty()) {
            System.out.print("Email não pode ser vazio. Digite novamente: ");
            email = sc.nextLine().trim();
        }

        for (Usuario u : FakeDB.usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Este email já está cadastrado.");
                return null;
            }
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine().trim();
        while (senha.isEmpty()) {
            System.out.print("Senha não pode ser vazia. Digite novamente: ");
            senha = sc.nextLine().trim();
        }

        Usuario novo = new Usuario(nome, email, senha);
        FakeDB.usuarios.add(novo);

        UserStorage.saveUsers();

        System.out.println("Cadastro concluído com sucesso!");
        return novo;
    }
}
