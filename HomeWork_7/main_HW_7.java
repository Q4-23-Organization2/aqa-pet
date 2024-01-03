package HomeWork_7;

import java.util.Scanner;

public class main_HW_7 {
    public static void main(String[] args) {

        // 1. Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[].
        // Для конвертації рядка, використовувати метод toCharArray())

        System.out.println("1.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int arrayLength2 = input2.nextInt();
        if (arrayLength2 <= 0) {
            System.out.println("The array size must be greater than zero!");
        } else {
            int[] arrayOfNum2 = new int[arrayLength2];
            System.out.println("Insert your numbers: ");
            for (int i = 0; i < arrayLength2; i++) {
                arrayOfNum2[i] = input2.nextInt();
            }
            int maxArrayNum = arrayOfNum2[0];
            for (int i = 0; i < arrayLength2; i++) {
                if (arrayOfNum2[i] > maxArrayNum) {
                    maxArrayNum = arrayOfNum2[i];
                }
            }
            System.out.println("Max number of array is: " + maxArrayNum);

            int minArrayNum = arrayOfNum2[0];
            for (int i = 0; i < arrayLength2; i++) {
                if (arrayOfNum2[i] < minArrayNum) {
                    minArrayNum = arrayOfNum2[i];
                }
            }
            System.out.println("Min number of array is: " + minArrayNum);
        }
        System.out.println("2.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 3. Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0,
        // і виводить отриманий масив на екран.

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int arrayLength3 = input2.nextInt();
        if (arrayLength3 <= 0) {
            System.out.println("The array size must be greater than zero!");
        } else {
            int[] arrayOfNum3 = new int[arrayLength3];
            System.out.println("Insert your numbers: ");
            for (int i = 0; i < arrayLength3; i++) {
                arrayOfNum3[i] = input3.nextInt();
            }

            int evenNumArray = arrayOfNum3[0];
            for (int i = 0; i < arrayLength3; i++) {
                if (arrayOfNum3[i] % 2 == 0) {
                    arrayOfNum3[i] = 0;
                }
                System.out.print("[" + arrayOfNum3[i] + "]");
            }
            System.out.println(" Your new array");

            System.out.println("3.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

        //4. Написати програму, яка друкує таблицю значень sin(x),
        // де х - від 0 до 360 з кроком 10.(значення мають бути записані в масив за допомогою циклу)

        double[] arraySinX = new double[360];
        for (int i = 0; i <= arraySinX.length; i+=10) {
            System.out.println("[sin(x)" + i + "°] = [" + Math.sin(i) + "]");
        }
    }
}


