package HomeWork_12;

import java.util.*;

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
        List<Integer> newRandomList = randomList(100, -20, 20);
        List<Integer> noDuplicatesList = new ArrayList<>();
        Set<Integer> noDuplicatesSet = new HashSet<>();
        int duplicatesCount = 0;

        for (Integer numList : newRandomList) {
            if (noDuplicatesSet.contains(numList)) {
                duplicatesCount++;
            }else{
                noDuplicatesSet.add(numList);
                noDuplicatesList.add(numList);
            }
        }
        System.out.println("Original generated list: ");
        System.out.println(newRandomList);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("List without duplicates: ");
        System.out.println(noDuplicatesList);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Count of duplicates= " + duplicatesCount);
    }
}

