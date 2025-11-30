package app.database;

import app.models.Prescricao;
import app.models.Usuario;
import app.models.Consulta;
import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Consulta> consultas = new ArrayList<>();
    public static List<Prescricao> prescricoes = new ArrayList<>();

    public static void init() {
        UserStorage.loadUsers();
        ConsultaStorage.loadConsultas();
    }
}
