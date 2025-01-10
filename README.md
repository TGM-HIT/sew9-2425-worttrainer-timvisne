# Worttrainer - Java Anwendung

Dieses Projekt ist ein einfacher Worttrainer mit einer grafischen Benutzeroberfläche (GUI), der Benutzern hilft, Wörter zu lernen, indem sie Bilder zugeordnet werden.

## Features
- **Wort- und Bildpaare**: Bilder werden angezeigt, und der Benutzer muss das dazugehörige Wort erraten.
- **Statistiken**: Richtige und falsche Antworten werden gezählt.
- **Automatisches Speichern**: Fortschritte werden beim Beenden des Programms automatisch gespeichert.
- **Skalierte Bilder**: Bilder werden angepasst, um in das GUI-Fenster zu passen.

## Technologie
- **Java**: Programmiersprache
- **Swing (JOptionPane)**: Für die grafische Benutzeroberfläche
- **Gson**: Für das Speichern und Laden der Daten im JSON-Format

## Installation
1. **Voraussetzungen**:
    - Java Development Kit (JDK) 17 oder höher
2. **Projekt ausführen**:
    - Kompiliere und starte die `GUI`-Klasse:
      ```bash
      javac -d . *.java
      java org.example.GUI
      ```

## Nutzung
1. Beim Start wird versucht, gespeicherte Daten zu laden. Wenn keine Daten vorhanden sind, wird eine neue Trainer-Instanz erstellt.
2. Der Benutzer sieht ein Bild und gibt das dazugehörige Wort ein.
3. Das Programm prüft die Eingabe und gibt Feedback, ob die Antwort richtig oder falsch ist.
4. Fortschritte werden automatisch gespeichert, wenn das Programm beendet wird.

## Beispielbild
Die Bilder werden in einem skalierten Format (300x300 Pixel) angezeigt, um in das Fenster zu passen.

## Autor
Erstellt von Timur und ChatGPT!
