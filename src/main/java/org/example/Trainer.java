package org.example;

import java.util.Random;

public class Trainer {
    private WordPair[] list;
    private int index = -1;
    private int correct;
    private int incorrect;
    public Trainer() {

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
        if(list != null && list.length > 0) {
            Random random = new Random();
            this.index = random.nextInt(list.length);
        }
    }
}
