package app.models;

public class Prescricao {
    private String emailUsuario;
    private String medico;
    private String medicamento;
    private String dosagem;
    private String instrucoes;

    public Prescricao(String emailUsuario, String medico, String medicamento, String dosagem, String instrucoes) {
        this.emailUsuario = emailUsuario;
        this.medico = medico;
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
    }

    public String getEmailUsuario() { return emailUsuario; }
    public String getMedico() { return medico; }
    public String getMedicamento() { return medicamento; }
    public String getDosagem() { return dosagem; }
    public String getInstrucoes() { return instrucoes; }
}
