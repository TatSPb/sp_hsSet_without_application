package hw_2023_03_29;

import java.util.*;

public class Task2_hw_2023_03_29 {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Исходный: " + nums1);

        Set<Integer> nums = new TreeSet<>(nums1);
        System.out.print("Только чётные без повторений: ");
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}


