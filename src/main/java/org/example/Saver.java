package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    private static final Gson gson = new Gson();

    public static void saveTrainerToFile(Trainer trainer) throws IOException {
        String filePath = "SAVE.json";
        if (trainer == null || filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("Trainer object or file path cannot be null or empty");
        }
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(trainer, writer);
        }
    }

    public static Trainer loadTrainerFromFile() throws IOException {
        String filePath = "trainer.json";
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty");
        }
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, Trainer.class);
        } catch (JsonSyntaxException e) {
            throw new IOException("Invalid JSON format in file", e);
        }
    }
}
