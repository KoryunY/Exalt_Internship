package com.gmail.koryun.yeritsyan.typer;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    Timer timer;
    final long startTime = System.currentTimeMillis();

    public void timerStart() {

        this.timer = new Timer();
        this.timer.schedule(new TimerTask() {
            @Override
            public void run() {

                stopTimer();

            }
        }, Game.getTime());
    }

    public long getTime() {
        return System.currentTimeMillis() - this.startTime;
    }

    private void stopTimer() {
        Game.setIsRunning(false);
        try {
            Game.bufferedReader.wait();
            System.out.println();
            Game.bufferedReader.close();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Gamer Over.Type anything to score.");
        }
        this.timer.cancel();
    }
}
