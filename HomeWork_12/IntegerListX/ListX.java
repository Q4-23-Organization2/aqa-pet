package HomeWork_12.IntegerListX;

import java.util.*;     //'*' означает, что мы можем импортировать любой класс из списка 'java.util'

public class ListX {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Создание списка целых чисел
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(6);

        int x = 5; // Заданное значение X

        System.out.println("Исходный список: " + list); // Вывод исходного списка на экран

        // Создание компаратора для списка
        Comparator<Integer> comparator = new ListXComparator(x);

        // Сортировка списка с использованием созданного компаратора
        Collections.sort(list, comparator);

        System.out.println("Отсортированный список: " + list); // Вывод отсортированного списка на экран
    }
}
