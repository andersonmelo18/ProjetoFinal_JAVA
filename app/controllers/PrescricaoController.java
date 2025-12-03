package app.controllers;

import app.database.FakeDB;
import app.models.Prescricao;
import app.models.Usuario;

public class PrescricaoController {

    public static void exibir(Usuario user) {

        System.out.println("\n=== MINHAS PRESCRIÇÕES ===");

        // Verificação de segurança
        if (user == null) {
            System.out.println("Erro: usuário inválido.");
            return;
        }

        // Evita NullPointerException
        if (FakeDB.prescricoes == null || FakeDB.prescricoes.length == 0) {
            System.out.println("Nenhuma prescrição encontrada.");
            return;
        }

        boolean encontrou = false;

        for (Prescricao p : FakeDB.prescricoes) {

            // Evita null dentro do array
            if (p == null) continue;

            if (p.getEmailUsuario() != null &&
                    p.getEmailUsuario().equalsIgnoreCase(user.getEmail())) {

                encontrou = true;

                System.out.println("\nMédico: " + p.getMedico());
                System.out.println("Medicamento: " + p.getMedicamento());
                System.out.println("Dosagem: " + p.getDosagem());
                System.out.println("Instruções: " + p.getInstrucoes());
                System.out.println("--------------------------------------");
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma prescrição encontrada para o seu usuário.");
        }
    }
}
