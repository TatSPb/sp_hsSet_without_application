package hw_2023_03_29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3_hw_2023_03_29 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("рыба", "кит","рыба", "кит","рыба", "кит","рыба", "кит" ));
        System.out.println("Исходный: " + words);
        Set<String> wordsUnique = new HashSet<>(words);
        System.out.println("Слова без повторений: " + wordsUnique);
    }
}
