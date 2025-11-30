package app.controllers;

import app.database.FakeDB;
import app.models.Prescricao;
import app.models.Usuario;

public class PrescricaoController {

    public static void exibir(Usuario user) {

        System.out.println("\n=== MINHAS PRESCRIÇÕES ===");

        boolean encontrou = false;

        for (Prescricao p : FakeDB.prescricoes) {
            if (p.getEmailUsuario().equalsIgnoreCase(user.getEmail())) {
                encontrou = true;

                System.out.println("\nMédico: " + p.getMedico());
                System.out.println("Medicamento: " + p.getMedicamento());
                System.out.println("Dosagem: " + p.getDosagem());
                System.out.println("Instruções: " + p.getInstrucoes());
                System.out.println("--------------------------------------");
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma prescrição encontrada.");
        }
    }
}
