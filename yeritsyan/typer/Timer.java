package com.gmail.koryun.yeritsyan.typer;

public class Timer extends Thread{
    private int time=10000;

    public int getTime() {
        return time;
    }

    @Override
    public void run() {
        while (this.time>=0){
            this.time-=1000;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
