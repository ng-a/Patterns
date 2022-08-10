package Behavioral.Iterator;

import java.util.HashMap;
import java.util.Map;

public class DateBase implements Collection{
    private HashMap<String, String> data = new HashMap<>();

    public void createUser(String name, String password) {
        if(data.containsKey(name)) {
            System.out.println("User already exist");
        }

        else {
            data.put(name, password);
        }
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

    @Override
    public Iterator getIterator() {
        return new DateIterator();
    }

    private class DateIterator implements Iterator {
        int index;
        String[] key = data.keySet().toArray(new String[0]);

        @Override
        public Object next() {
            return  key[index] + ":" + data.get(key[index++]);
        }

        @Override
        public boolean hasNext() {
            return key.length > index ? true : false;
        }
    }
}
