package Homework3;

import java.io.*;

public class SaveService {
    public void saveData (String data) {
       try (Writer writer = new FileWriter("personalData.txt")) {
               writer.write(data + "\n");
           System.out.println("Your data saved.");
       } catch (IOException e) {
           e.getMessage();
       }
    }
}



// try (FileReader reader = new FileReader("/Users/annakudravceva/Desktop/GEEKBRAINS/Exceptions/src/main/java/names.txt");
//         FileWriter writer = new FileWriter("copy")) {
//         while (reader.ready()) {
//         writer.write(reader.read());
//         }
//         }catch (RuntimeException | IOException e) {
//         System.out.println("catch exception: " + e.getClass().getSimpleName());
//         }
//         System.out.println("Copy successfully");
//         }
//
//         }