package app.database;

import app.models.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class UserStorage {
    private static final String FILE = "/mnt/data/usuarios.json";

    public static void saveUsers() {
        try {
            Gson g = new Gson();
            FileWriter fw = new FileWriter(FILE);
            g.toJson(FakeDB.usuarios, fw);
            fw.close();
        } catch (Exception ignored) {}
    }

    public static void loadUsers() {
        try {
            Gson g = new Gson();
            FileReader fr = new FileReader(FILE);
            FakeDB.usuarios = g.fromJson(fr, new TypeToken<List<Usuario>>(){}.getType());
            fr.close();
        } catch (Exception e) {
            FakeDB.usuarios = new ArrayList<>();
        }
    }
}
