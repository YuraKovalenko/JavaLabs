package Model;

import java.io.*;

public class ReadFile {

    public static String fileName = "file.txt";

    public Animal[] readFile() throws IOException {
        Animal[] animals = new Animal[10];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                String[] words = line.split(" ");
                animals[i] = new Animal(words[0], words[1], words[2], words[3], words[4], words[5], Integer.parseInt(words[6]), words[7]);
                line = reader.readLine();
                i++;
            }
        }
        return animals;
    }

    public void saveFile(Animal[] a) throws IOException {
        String fileName = "tempFile.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (Animal animal : a) {
                writer.write(animal.toString() + "\n");
            }
            writer.write("\n");
        }
    }
}