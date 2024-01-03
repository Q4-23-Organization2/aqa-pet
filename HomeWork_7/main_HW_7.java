package HomeWork_7;

import java.util.Scanner;

public class main_HW_7 {
    public static void main(String[] args) {

        // 1. Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[].
        // Для конвертації рядка, використовувати метод toCharArray())

        // 2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int arrayLength = input.nextInt();
        if (arrayLength <= 0) {
            System.out.println("The array size must be greater than zero!");
        } else {
            int[] arrayOfNum = new int[arrayLength];
            System.out.println("Insert your numbers: ");
            for (int i = 0; i < arrayLength; i++) {
                arrayOfNum[i] = input.nextInt();
            }
            int maxArrayNum = arrayOfNum[0];
            for (int i = 0; i < arrayLength; i++) {
                if (arrayOfNum[i] > maxArrayNum) {
                    maxArrayNum = arrayOfNum[i];
                }
            }
            System.out.println("Max number of array is: " + maxArrayNum);

            int minArrayNum = arrayOfNum[0];
            for (int i = 0; i < arrayLength; i++) {
                if (arrayOfNum[i] < minArrayNum) {
                    minArrayNum = arrayOfNum[i];
                }
            }
            System.out.println("Min number of array is: " + minArrayNum);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 3. Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0,
        // і виводить отриманий масив на екран.




    }
}


