package com.gmail.koryun.yeritsyan.typer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FastTyper {
    static  List<String> words;
    public static void start() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type 'start' to start the Game");
        if(scanner.next().equals("start")){
            Game.start(scanner);
        }
        else System.out.println("Wrong Input");
    }

    public static void checkStart() {
        try {
             words=FileReader.readFrom("src\\com\\gmail\\koryun\\yeritsyan\\typer\\words.txt");
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
