package euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

/**
 * Created by Michiel on 28-7-2016.
 */
public class P22 {

    public static void main(String args[]) {

        long millis_start = System.currentTimeMillis();

        Path file = Paths.get("C:\\Users\\Michiel\\IdeaProjects\\ProjectEuler\\src\\files\\p022_names.txt");
        //Path file = Paths.get("C:\\Users\\Michiel\\IdeaProjects\\ProjectEuler\\src\\files\\test.txt");

        TreeMap<String, Integer> namesList = new TreeMap<>();

        try (InputStream fis = Files.newInputStream(file);
             BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
            String line = null;

            while ((line = br.readLine()) != null) {
                String[] names = line.split(",");

                for (String fullName : names) {
                    String name = fullName.replace("\"","");
                    namesList.put(name, alphabeticalValue(name));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int pos = 1;
        long total = 0;

        for (String name : namesList.keySet()) {
            if (name.equals("COLIN")) {
                System.out.println("name: " + name + ", value: " + namesList.get(name) + ", position: " + pos);
            }

            total = total + pos * namesList.get(name);
            pos++;
        }

        System.out.println("total: " + total);

        long millis_stop = System.currentTimeMillis();
        System.out.println("Solution took " + (millis_stop - millis_start) + " milliseconds to complete");

    }

    static int alphabeticalValue(String name) {

        int value = 0;

        for (int i = 0; i < name.length(); i++) {
            value += (Character.getNumericValue(name.charAt(i)) - 9);
        }

        return value;
    }
}
