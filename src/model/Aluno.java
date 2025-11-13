package model;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    // Métodos herdados de Pessoa
    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um aluno, meu nome é " + nome + " e minha matrícula é " + matricula);
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Minhas atividades incluem estudar e participar de aulas.");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}