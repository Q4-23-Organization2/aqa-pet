package HomeWork_12;

import java.util.*;

public class DuplicatesList {

    // Метод для генерации коллекции случайных чисел заданного размера в заданном диапазоне
    public static List<Integer> randomList(int listSize, int minNum, int maxNum) {
        List<Integer> randomListNumbers = new ArrayList<>();
        Random randomNumbers = new Random();
        // Заполнение списка случайными числами в заданном диапазоне
        for (int i = 0; i < listSize; i++) {
            randomListNumbers.add(randomNumbers.nextInt(maxNum - minNum +1) + minNum);
        }
        return randomListNumbers;
    }

    public static void main(String[] args) {
        List<Integer> newRandomList = randomList(100, -20, 20);
        // Создание нового списка для генерации случайных чисел в диапазоне

        Set<Integer> noDuplicatesSet = new HashSet<>();     // Создание нового сета для отслеживания неповторяющихся чисел
        List<Integer> noDuplicatesList = new ArrayList<>(); // Создание нового списка для хранения элементов без дубликатов
        int duplicatesCount = 0; // Переменная, которая увиличивается с каждым удалённым дубликатом, и отображает общее их количество

        for (Integer numList : newRandomList) {         //В цикле условие для перебора и сортировки дубликатов от уникальных чисел
            if (noDuplicatesSet.contains(numList)) {
                duplicatesCount++;                      //Счётчик удалённых дубликатов
            }else{
                noDuplicatesSet.add(numList);           //Добавление уникального числа в сет
                noDuplicatesList.add(numList);          //Добавление уникального числа в новый лист
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

