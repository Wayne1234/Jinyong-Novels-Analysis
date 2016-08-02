package ReadFile;

import java.io.*;
import java.util.ArrayList;

public class ReadPerson {

    public static ArrayList<String> readToArray(String filename) throws IOException {
        ArrayList<String> person = new ArrayList<String>();
        File file = new File(filename);
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (!line.equals("")) {
                person.add(line);
            }
        }
        return person;
    }

    public static void main(String args[]) throws IOException {
        System.out.println(readToArray("person_list.txt").size());
    }
}
