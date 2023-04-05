package hw_2023_03_29;

import java.util.*;

public class Task4_hw_2023_03_29 {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 4:");
        System.out.println("(всё количество дублей из списка слов)");
        task4(List.of("рыба", "кит", "рыба", "кит", "рыба", "килька"));
    }
    private static void task4(List<String> words){
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        System.out.println(map);
        System.out.println("**********************************************************************");
    }
}
