package model;

public class Disciplina {
    private String nome;
    private String cargaHoraria;
    private Professor professor;
    private Aluno aluno;

    public Disciplina(String nome, String cargaHoraria, Professor professor, Aluno aluno) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", professor=" + professor +
                ", aluno=" + aluno +
                '}';
    }
}