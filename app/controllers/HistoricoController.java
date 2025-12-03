package app.controllers;

import app.database.FakeDB;
import app.models.Consulta;
import app.models.Usuario;

public class HistoricoController {
    public static void listar(Usuario user) {
        boolean encontrou = false;

        System.out.println("\n=== HISTÓRICO DE CONSULTAS ===");

        for (Consulta c : FakeDB.consultas) {
            if (c.getEmailUsuario().equals(user.getEmail())) {
                encontrou = true;
                String status = c.isRealizada() ? "Realizada" : "Pendente";
                System.out.println(c.getData() + " - " + c.getTipo() + " - " + status);
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma consulta encontrada.");
        }
    }
}
