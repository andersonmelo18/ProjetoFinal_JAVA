package app;

import app.controllers.*;
import app.database.FakeDB;
import app.models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FakeDB.init();
        Scanner sc = new Scanner(System.in);
        Usuario user = null;

        System.out.println("===== SISTEMA MÉDICO =====");

        while (user == null) {
            System.out.println("\n1 - Login");
            System.out.println("2 - Cadastro");
            System.out.print("Escolha: ");

            String entrada = sc.nextLine();
            int op;

            try {
                op = Integer.parseInt(entrada);
            } catch (Exception e) {
                System.out.println("Opção inválida.");
                continue;
            }

            if (op == 1) {
                user = LoginController.login(sc);
            } else if (op == 2) {
                user = CadastroController.cadastrar(sc);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Diagnóstico");
            System.out.println("2 - Agendar Consulta");
            System.out.println("3 - Consulta por Vídeo");
            System.out.println("4 - Enviar Mensagem ao Médico");
            System.out.println("5 - Ver Chat");
            System.out.println("6 - Notificações");
            System.out.println("7 - Prescrição Médica");
            System.out.println("8 - Histórico de Consultas");
            System.out.println("9 - Perfil");
            System.out.println("10 - Sair");
            System.out.print("Escolha: ");

            String entrada = sc.nextLine();
            int op;

            try {
                op = Integer.parseInt(entrada);
            } catch (Exception e) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (op) {
                case 1 -> DiagnosticoController.realizarDiagnostico(user, sc);
                case 2 -> AgendamentoController.agendar(user, sc);
                case 3 -> VideoConsultaController.iniciar(user);
                case 4 -> ChatController.enviarMensagem(sc);
                case 5 -> ChatController.listar();
                case 6 -> NotificacaoController.lembretes();
                case 7 -> PrescricaoController.exibir(user);
                case 8 -> HistoricoController.listar(user);
                case 9 -> PerfilController.mostrar(user);
                case 10 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
