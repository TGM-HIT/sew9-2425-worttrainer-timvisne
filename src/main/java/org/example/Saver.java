package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Speichert die Daten
 * @author timur
 * @version 2025-01-10
 */
public class Saver {
    private static final Gson gson = new Gson();

    public static void saveTrainerToFile(Trainer trainer) throws IOException {
        String filePath = "SAVE.json";
        if (trainer == null || filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("Trainer not null");
        }
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(trainer, writer);
        }
    }

    public static Trainer loadTrainerFromFile() throws IOException {
        String filePath = "SAVE.json";
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path null");
        }
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, Trainer.class);
        } catch (IOException e) {
            Trainer newTrainer = new Trainer();
            saveTrainerToFile(newTrainer);
            return newTrainer;
        } catch (JsonSyntaxException e) {
            throw new IOException("Invalid", e);
        }
    }
}
