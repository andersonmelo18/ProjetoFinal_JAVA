package service;

import model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private List<Professor> professores = new ArrayList<>();

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " cadastrado com sucesso.");
    }

    public List<Professor> listarProfessores() {
        return professores;
    }

    public void atualizarProfessor(String nome, String novoNome) {
        for (Professor professor : professores) {
            // Usa o método getNome() agora presente na superclasse Pessoa
            if (professor.getNome().equalsIgnoreCase(nome)) {
                // Usa o método setNome() agora presente na superclasse Pessoa
                professor.setNome(novoNome);
                System.out.println("Professor '" + nome + "' atualizado para '" + novoNome + "' com sucesso!");
                return;
            }
        }
        System.out.println("Professor não foi encontrado.");
    }

    public void deletarProfessor(String nome) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome().equalsIgnoreCase(nome)) {
                professores.remove(i);
                System.out.println("Professor '" + nome + "' deletado com sucesso!");
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
}