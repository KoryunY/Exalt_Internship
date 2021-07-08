package com.gmail.koryun.yeritsyan.typer;


import java.util.*;

public class TopList {
    final static int TOP_COUNT = 3;
    static NavigableMap<Integer, String> topMap;

    public TopList() {
        topMap = new TreeMap<>(Collections.reverseOrder());
    }

    public boolean checkScore(int score) {
        if (topMap.isEmpty()) return true;
        if (topMap.size() == TOP_COUNT) {
            int last=topMap.lastEntry().getKey();
            if (last< score) {
                topMap.remove(last);
                return true;
            }
            else return false;
        }
        return true;
}

    public void add(int score, String name) {
        topMap.put(score, name);
    }

    public void clear() {
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
