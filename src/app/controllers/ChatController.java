package app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatController {
    private static final List<String> mensagens = new ArrayList<>();

    public static void enviarMensagem(Scanner sc) {
        System.out.print("Digite sua mensagem: ");
        String msg = sc.nextLine();

        if (msg.isBlank()) {
            System.out.println("Mensagem vazia.");
            return;
        }

        mensagens.add("Você: " + msg);
        mensagens.add("Médico: Entendi. Vou analisar sua mensagem.");
        System.out.println("Mensagem enviada.");
    }

    public static void listar() {
        if (mensagens.isEmpty()) {
            System.out.println("Nenhuma mensagem no chat.");
            return;
        }

        System.out.println("\n=== CHAT ===");
        for (String m : mensagens) System.out.println(m);
    }
}
