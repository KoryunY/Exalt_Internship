package com.gmail.koryun.yeritsyan.typer;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int score;

    public static void start(Scanner scanner) {
        Random random=new Random();
        String currentWord;
        Timer timer=new Timer();
        timer.start();
        while (timer.isAlive()){
            currentWord=FastTyper.words.get(random.nextInt(FastTyper.words.size()));
            System.out.println(currentWord);
            if(scanner.next().equals(currentWord) && timer.isAlive()){
                score++;
            }
            System.out.println(timer.getTime()/1000+"seconds Left");
        }
        System.out.println("Game Over");
        System.out.println("Your Score is "+score);
    }
}
