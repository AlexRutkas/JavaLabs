package edu.labs.LAB11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWorker {
    public static void writeToFile(String inputStr) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("order.txt", true);
            writer.write(inputStr);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
