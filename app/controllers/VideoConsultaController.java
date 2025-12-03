package app.controllers;

import app.database.FakeDB;
import app.database.ConsultaStorage;
import app.models.Consulta;
import app.models.Usuario;

public class VideoConsultaController {
    public static void iniciar(Usuario user) {

        System.out.println("\n=== CONSULTA POR VÍDEO ===");

        for (Consulta c : FakeDB.consultas) {

            if (c.getEmailUsuario().equals(user.getEmail())
                    && c.getTipo().equalsIgnoreCase("video")
                    && !c.isRealizada()) {

                System.out.println("Conectando com o médico...");
                try { Thread.sleep(2000); } catch (Exception ignored) {}

                System.out.println("Consulta em andamento...");
                try { Thread.sleep(2000); } catch (Exception ignored) {}

                System.out.println("Consulta finalizada.");

                c.setRealizada(true);
                ConsultaStorage.saveConsultas();
                return;
            }
        }

        System.out.println("Nenhuma consulta por vídeo pendente.");
    }
}
