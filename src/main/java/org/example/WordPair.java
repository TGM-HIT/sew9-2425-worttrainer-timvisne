package org.example;

public class WordPair {
    private String word;
    private String url;
    public WordPair() {
        this.word = "";
        this.url = "";
    }
    public WordPair(String word, String url) {
        this.word = word;
        this.url = url;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
