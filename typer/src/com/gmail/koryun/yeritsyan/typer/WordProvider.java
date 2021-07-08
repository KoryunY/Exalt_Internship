package com.gmail.koryun.yeritsyan.typer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordProvider {
    final String path = "resources\\words.txt";
    private List<String> words;

    public List<String> getWords() {
        return words;
    }

    public WordProvider() {
        try {
            this.words = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Something got Wrong");
        }
    }

}
