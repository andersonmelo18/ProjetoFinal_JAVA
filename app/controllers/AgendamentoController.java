package app.controllers;

import app.database.FakeDB;
import app.database.ConsultaStorage;
import app.models.Consulta;
import app.models.Usuario;

import java.util.Scanner;

public class AgendamentoController {

    public static void agendar(Usuario user, Scanner sc) {

        System.out.println("\n== AGENDAR CONSULTA ==");
        System.out.print("Data (AAAA-MM-DD): ");
        String data = sc.nextLine();

        System.out.println("Tipo:");
        System.out.println("1 - Presencial");
        System.out.println("2 - Vídeo");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        sc.nextLine();

        String tipo = (op == 1) ? "presencial" : "video";

        Consulta c = new Consulta(user.getEmail(), data, tipo);
        FakeDB.consultas.add(c);
        ConsultaStorage.saveConsultas();

        System.out.println("Consulta agendada.");
    }
}
