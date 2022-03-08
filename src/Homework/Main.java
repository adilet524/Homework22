package Homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Alphabet.txt")) {
            for (char i = 'A';  i <= 'Z'; i++) {
                fileWriter.write(i + "" + Character.toLowerCase(i)+ "\n");
            }
            for (int i = 0; i <= 9; i++) {
                fileWriter.write(i + "\n");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("Alphabet.txt")){
            Scanner scanner = new Scanner(reader);
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(i + ": " + scanner.nextLine());
                i++;
            }
        }catch (IOException e) {
                System.out.println(e.getMessage());
        }
    }
}
