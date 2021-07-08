package com.gmail.koryun.yeritsyan.typer;


import java.util.*;

public class TopList {
    static Map<Integer, String> topMap;

    public TopList() {
        topMap = new TreeMap<>(Collections.reverseOrder());
    }

    public boolean checkScore(int score) {
        if(topMap.size()==0)return true;
        if (topMap.size() != 0) {
            if (topMap.keySet().stream().findFirst().get() <= score) {
                topMap.remove(score);
                return true;
            }
        }
        return false;
    }

    public void add(int score, String name) {
        topMap.put(score, name);
    }
    public void clear(){
        topMap.clear();
    }
    public void printList() {
        System.out.println("___________________________");
        for (int key :
                topMap.keySet()) {
            System.out.println(topMap.get(key) + "::" + key);
        }
        System.out.println("___________________________");
    }
}
