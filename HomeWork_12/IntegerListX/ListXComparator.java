package HomeWork_12.IntegerListX;

import java.util.Comparator;

class ListXComparator implements Comparator<Integer> {
    private final int x;

    public ListXComparator(int x) {
        this.x = x;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        // Если оба числа меньше или равны X, или оба числа больше X
        if ((o1 <= x && o2 <= x) || (o1 > x && o2 > x)) {
            // Вычисляем разницу между числами
            // Если a < b, результат будет отрицательным
            // Если a > b, результат будет положительным
            // Если a == b, результат будет равен нулю
            return o1 - o2;     //Возвращаем разницу, сдвигаем числа('-1' - o1 идёт перед o2, '0' - оставляем на месте, '+1' - o1 идёт после o2)
        } else if (o1 <= x && o2 > x) { // Если одно число не превышает X, а другое больше X
            return -1; // Первое число должно идти перед вторым
        } else {
            return 1; // Первое число должно идти после второго
        }
    }
}
