package app.database;

import app.models.Consulta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ConsultaStorage {
    private static final String FILE = "/mnt/data/consultas.json";

    public static void saveConsultas() {
        try {
            Gson g = new Gson();
            FileWriter fw = new FileWriter(FILE);
            g.toJson(FakeDB.consultas, fw);
            fw.close();
        } catch (Exception ignored) {}
    }

    public static void loadConsultas() {
        try {
            Gson g = new Gson();
            FileReader fr = new FileReader(FILE);
            FakeDB.consultas = g.fromJson(fr, new TypeToken<List<Consulta>>(){}.getType());
            fr.close();
        } catch (Exception e) {
            FakeDB.consultas = new ArrayList<>();
        }
    }
}
