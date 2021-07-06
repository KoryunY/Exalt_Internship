package com.gmail.koryun.yeritsyan.shuffler;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Repl {
    public static void Menu(List<String> entryList,Scanner sc){
        boolean isActive=true;
        int cmd;
        while (isActive){
            System.out.println("Enter command number");
            System.out.println("1.Create new List");
            System.out.println("2.com.gmail.koryun.yeritsyan.shuffler created List");
            System.out.println("3.Print List");
            System.out.println("4.exit");
            cmd= sc.nextInt();
            switch (cmd){
                case 1:
                    entryList.clear();
                    System.out.println("List Element Number");
                    int count = sc.nextInt();
                    for (int i = 1; i <= count; i++) {
                        System.out.println("Enter " + i + " element Value");
                        entryList.add(sc.next());
                    }
                    break;
                case 2:
                    Collections.shuffle(entryList);
                    break;
                case 3:
                    System.out.println(entryList);
                    break;
                case 4:
                    isActive=false;
                    break;
                default:
                    System.out.println("Enter Valid Command");
            }
        }
    }
}
