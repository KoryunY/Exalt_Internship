package com.gmail.koryun.yeritsyan.typer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static List<String> readFrom(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }
}
