package app.models;

public class Usuario {

    private String nome;
    private String email;
    private String senha;

    private String telefone;
    private String dataNascimento;
    private String cpf;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    public String getTelefone() { return telefone; }
    public String getDataNascimento() { return dataNascimento; }
    public String getCPF() { return cpf; }

    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public void setCPF(String cpf) { this.cpf = cpf; }
}
