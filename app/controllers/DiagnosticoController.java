package app.controllers;

import app.database.FakeDB;
import app.database.ConsultaStorage;
import app.models.Consulta;
import app.models.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class DiagnosticoController {

    public static void realizarDiagnostico(Usuario user, Scanner sc) {
        System.out.println("\n== DIAGNÓSTICO ==");
        System.out.print("Digite seus sintomas: ");
        String sintomas = sc.nextLine();

        String avaliacao;

        if (sintomas.toLowerCase().contains("febre") ||
                sintomas.toLowerCase().contains("forte") ||
                sintomas.toLowerCase().contains("dor intensa")) {
            avaliacao = "URGENCIA — consulta PRESENCIAL recomendada.";
        } else {
            avaliacao = "Consulta online recomendada.";
        }

        System.out.println("\nResultado: " + avaliacao);

        // cria uma consulta automática
        Consulta c = new Consulta(
                user.getEmail(),
                LocalDate.now().toString(),
                avaliacao.contains("URGENCIA") ? "presencial" : "video"
        );

        FakeDB.consultas.add(c);
        ConsultaStorage.saveConsultas();

        System.out.println("Consulta adicionada ao histórico.");
    }
}
