package org.exceptions;

import org.example.Inheritance.Dog;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        try {
//            readFile("test.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("файл не найден - " + e.getMessage());
//        }

        String text = "я помню чудное мгновенье";
        String text2 = "передо мной явилась ты";

//        FileWriter writer = null;

        try (FileWriter writer = new FileWriter("text.txt", true)) { //интерфейс autoclosable
            writer.write(text);
            System.out.println("done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            writer.close();
//            System.out.println("ресурс закрыт");
//        }
    }

//    static void readFile(String path) throws FileNotFoundException {
//        FileReader fileReader = new FileReader(path);
//
//        System.out.println("файл открыт");
//    }
}