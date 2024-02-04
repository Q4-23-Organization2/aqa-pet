package HomeWork_12.IntegerListX;

import java.util.Comparator;

class ListXComparator implements Comparator<Integer> {
    private final int x;

    public ListXComparator(int x) {
        this.x = x;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 <= x && o2 <= x) {
            return o1 - o2;
        } else if (o1 > x && o2 > x) {
            return o1 - o2;
        } else if (o1 <= x && o2 > x) {
            return -1;
        } else {
            return 1;
        }

    }
}
