package model;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Adicionado Getter e Setter para permitir que o ProfessorService
    // possa ler e modificar o nome, conforme a lógica de atualização.
    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // Métodos Abstratos (Obrigatórios nas subclasses)
    public abstract void quemSouEu();
    public abstract void minhaAtividade();
}