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

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        // Evitar cadastro com campos vazios
        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            System.out.println("Todos os campos são obrigatórios.");
            return null;
        }

        // Verificar usuário existente
        for (Usuario u : FakeDB.usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Este email já está cadastrado.");
                return null;
            }
        }

        // Criar usuário
        Usuario novo = new Usuario(nome, email, senha);
        FakeDB.usuarios.add(novo);

        // Salvar em arquivo
        UserStorage.saveUsers();

        System.out.println("Cadastro concluído com sucesso!");
        return novo;
    }
}
