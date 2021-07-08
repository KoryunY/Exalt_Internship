package com.gmail.koryun.yeritsyan.typer;

import java.io.IOException;
import java.util.Scanner;

public class Repl {
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        int cmd;
        while (isActive) {
            Game game = new Game();
            System.out.println("1.Start Game");
            System.out.println("2.Print Top List");
            System.out.println("3.Settings(Clear Top List /Set Game Time(default 20seconds))");
            System.out.println("4.Exit Game");
            cmd = scanner.nextInt();
            switch (cmd) {
                case 1:

                    try {
                        game.startGame();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Game.topList.printList();
                    break;
                case 3:
                    System.out.println("1.Clear Top List");
                    System.out.println("2.Set Game Time");
                    System.out.println("3.go Back");
                    cmd = scanner.nextInt();
                    switch (cmd) {
                        case 1:
                            Game.topList.clear();
                            break;
                        case 2:
                            System.out.println("Enter time in seconds.");
                            game.setTime(scanner.nextInt());
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid Command");
                    }
                    break;
                case 4:
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }
}
