package com.gmail.koryun.yeritsyan.typer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Game {
    private static boolean isRunning = false;
    private static Random random = new Random();
    private static long time = 20000;
    static TopList topList=new TopList();
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private int currentScore;
    private List<String> words = new WordProvider().getWords();
    private String currentWord;

    public static void setIsRunning(boolean isRunning) {
        Game.isRunning = isRunning;
    }

    public static long getTime() {
        return time;
    }

    public void setTime(int sec) {
        this.time = (long) sec * 1000;
    }

    public void startGame() throws IOException {
        isRunning = true;
        GameTimer gameTimer = new GameTimer();
        gameTimer.timerStart();
        while (isRunning) {
            currentWord = words.get(random.nextInt(words.size()));
            System.out.println(currentWord);
            if (bufferedReader.readLine().equals(currentWord)) {
                this.currentScore++;
            }
            int currentTime=(int)(this.time-gameTimer.getTime() )/ 1000;
            if(currentTime>0)
            System.out.println(currentTime+ "Seconds");
        }
        System.out.println("Your Score:"+this.currentScore);

        if(topList.checkScore(this.currentScore)){
            System.out.println("Enter your Nick name");
            String name=bufferedReader.readLine();
            topList.add(currentScore,name);
        }

    }

}
