package org.example;

import java.util.Random;

public class Trainer {
    WordPair[] list;
    int index = -1;
    private int correct;
    private int incorrect;
    public Trainer() {
        this.list = new WordPair[]{
                new WordPair("Apfel", "https://www.mcdonalds.at/wp-content/uploads/2023/02/1500x1500-web-pop-neu-happy-meal-apfel-768x768.png"),
                new WordPair("Birne", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTL1TEq6L1BL9AcCclaYEAV8m2Qzgw62FzBHg&s")
        };
    }



    public Trainer(WordPair[] list) {
    }
    public boolean select(int index ) {
        if (index > 0 && index < list.length) {
            this.index = index;
            return true;
        }
        return false;
    }
    public void selectRandom() {
        if (list != null && list.length > 0) {
            Random random = new Random();
            this.index = random.nextInt(list.length);
        } else {
            this.index = -1;
        }
    }
    public boolean guess(String guess) {
        if(guess.equals(list[index].getWord())) {
            correct++;
            this.selectRandom();
            return true;
        }
        incorrect++;
        return false;
    }

    public int getCorrect() {
        return correct;
    }

    public int getIncorrect() {
        return incorrect;
    }
}
