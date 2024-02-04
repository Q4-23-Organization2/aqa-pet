package HomeWork_12.IntegerListX;

import java.util.*;     //'*' означает, что мы можем импортировать любой класс из списка 'java.util'

public class ListX {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(); // Создание списка целых чисел
        listOfNumbers.add(7);
        listOfNumbers.add(1);
        listOfNumbers.add(5);
        listOfNumbers.add(5);
        listOfNumbers.add(9);
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(6);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(7);
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(1);
        listOfNumbers.add(9);

        int x = 5; // Заданное значение X

        System.out.println("Исходный список: " + listOfNumbers); // Вывод исходного списка на экран

        // Создание компаратора для списка
        Comparator<Integer> numbersComparator = new ListXComparator(x);

        // Сортировка списка с использованием созданного компаратора
        listOfNumbers.sort(numbersComparator);

        System.out.println("Отсортированный список: " + listOfNumbers); // Вывод отсортированного списка на экран
    }
}
