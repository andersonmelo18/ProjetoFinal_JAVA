package app.controllers;

import app.models.Usuario;

public class PerfilController {

    public static void mostrar(Usuario user) {

        System.out.println("\n=== MEU PERFIL ===");
        System.out.println("Nome:  " + user.getNome());
        System.out.println("Email: " + user.getEmail());

        if (user.getTelefone() != null) {
            System.out.println("Telefone: " + user.getTelefone());
        }

        if (user.getDataNascimento() != null) {
            System.out.println("Nascimento: " + user.getDataNascimento());
        }

        if (user.getCPF() != null) {
            System.out.println("CPF: " + user.getCPF());
        }

        System.out.println("---------------------------");
    }
}
