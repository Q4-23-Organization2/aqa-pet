package HomeWork_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DuplicatesList {
    public static List<Integer> randomList(int listSize, int minNum, int maxNum) {
        List<Integer> randomListNumbers = new ArrayList<>();
        Random randomNumbers = new Random();
        for (int i = 0; i < listSize; i++) {
            randomListNumbers.add(randomNumbers.nextInt(maxNum - minNum +1) + minNum);
        }
        return randomListNumbers;
    }

    public static void main(String[] args) {
        System.out.println(randomList(100, -20, 20));
    }
}

