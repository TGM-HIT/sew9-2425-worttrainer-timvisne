package org.example;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class GUI {
    private static Trainer trainer;

    public static void main(String[] args) {
        try {
            trainer = Saver.loadTrainerFromFile();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Laden der Trainer-Daten: " + e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
            trainer = new Trainer();
        }

        while (true) {
            trainer.selectRandom();
            WordPair currentPair = trainer.list[trainer.index];
            String imageUrl = currentPair.getUrl();
            String correctWord = currentPair.getWord();
            String resultMessage = "Richtige Antworten: " + trainer.getCorrect() + "\nFalsche Antworten: " + trainer.getIncorrect();

            ImageIcon icon = null;
            try {
                URL url = new URL(imageUrl);
                icon = new ImageIcon(url);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Fehler beim Laden des Bildes: " + e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
            }
            String message = resultMessage + "\n\nWas ist das Wort für das Bild?";
            String guess = JOptionPane.showInputDialog(null, message, "Wort eingeben", JOptionPane.QUESTION_MESSAGE, icon, null, "").toString();

            if (guess == null || guess.trim().isEmpty()) {
                break;
            }

            boolean isCorrect = trainer.guess(guess.trim());
            String feedback = isCorrect ? "Richtig!" : "Falsch! Das richtige Wort war: " + correctWord;
            JOptionPane.showMessageDialog(null, feedback, "Ergebnis", JOptionPane.INFORMATION_MESSAGE);
        }

        try {
            Saver.saveTrainerToFile(trainer);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Speichern der Trainer-Daten: " + e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "Das Spiel ist beendet. Die Daten wurden gespeichert.", "Spiel beendet", JOptionPane.INFORMATION_MESSAGE);
    }
}
