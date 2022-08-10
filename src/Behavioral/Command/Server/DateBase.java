package Behavioral.Command.Server;

import java.util.HashMap;
import java.util.Map;

public class DateBase {
    private HashMap<String, String> data = new HashMap<>();

    public void createUser(String name, String password) {
        data.put(name, password);
    }

    public void deleteUser(String name, String password) {
        if (!data.containsKey(name)) {
            System.out.println("Not user");
        }

        else if(data.get(name) != password) {
            System.out.println("Delete is wrong (incorrect password)");
        }

        else {
            System.out.println("User deleted");
            data.remove(name, password);
        }
    }

    public void printUsers(){
        for(Map.Entry<String, String> entry : data.entrySet()) {
            System.out.printf("%8s : %8s %n", entry.getKey(), entry.getValue());
        }
    }
}
