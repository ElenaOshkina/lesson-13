package ru.oshkina.demo7;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Катя", 42);
        scores.put("Иван", 343);
        scores.put("Анна", 876);

        System.out.println(scores);
        System.out.println(scores.get("Катя"));
    }
}
