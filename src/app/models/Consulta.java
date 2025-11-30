package app.models;

public class Consulta {
    private String emailUsuario;
    private String data;
    private String tipo;
    private boolean realizada;

    public Consulta(String emailUsuario, String data, String tipo) {
        this.emailUsuario = emailUsuario;
        this.data = data;
        this.tipo = tipo;
        this.realizada = false;
    }

    public String getEmailUsuario() { return emailUsuario; }
    public String getData() { return data; }
    public String getTipo() { return tipo; }
    public boolean isRealizada() { return realizada; }
    public void setRealizada(boolean r) { realizada = r; }
}
