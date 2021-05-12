package Model;

import java.io.*;
import java.util.Arrays;

import Exception.FileException;

public class ReadFile {

    public static String fileName = "file.txt";

    public Animal[] readFile() {
        Animal[] animals = new Animal[10];
        try {
            try {
                File file = new File(fileName);
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                int i = 0;
                while (line != null) {
                    String[] words = line.split(" ");
                    animals[i] = new Animal(words[0], words[1], words[2], words[3], words[4], words[5], Integer.parseInt(words[6]), words[7]);
                    line = reader.readLine();
                    i++;
                }
            } catch (IOException e) {
                throw new FileException("Помилка читання файлу");
            }
        } catch (FileException e) {
            System.out.println(e.getMessage());
        }
        return animals;
    }

    public void savaFile(String fileName,Animal[] a) {
        try {
            try {
                File file = new File(fileName);
                FileWriter fw = new FileWriter(file);
                file.delete();

                Arrays.stream(a).forEach(x -> {
                    try {
                        fw.write(x + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                fw.close();
            } catch (IOException e) {
                throw new FileException("Помилка запису в файл");
            }
        } catch (FileException e) {
            System.out.println(e.getMessage());
        }
    }
}
