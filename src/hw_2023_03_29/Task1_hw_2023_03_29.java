package hw_2023_03_29;

import java.util.ArrayList;
import java.util.List;

public class Task1_hw_2023_03_29 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Исходный: " + nums);
        System.out.print("Только нечётные: ");
        for (Integer num: nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

