package HWCollection;
import java.util.*;

public class HWDatabase {
    private Map<String, String> db;
    public HWDatabase() { db = new HashMap<>(); }

    public void addData(String key, String value) {
        db.put(key, value);
    }

    public void removeData(String key) {
        db.remove(key);
    }

    public void updateData(String key, String value) {
        this.addData(key, value);
    }

    public String findData(String key) {
        return db.getOrDefault(key, "Null");
    }

    public void showData() {
        for (String key:
             db.keySet()) {
            System.out.println(key+": "+db.get(key));
        }
    }
}
