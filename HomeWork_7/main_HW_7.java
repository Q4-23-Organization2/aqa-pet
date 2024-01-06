package HomeWork_7;

import java.util.Scanner;

public class main_HW_7 {
    public static void main(String[] args) {

        // 1. Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[].
        // Для конвертації рядка, використовувати метод toCharArray())

        String str = "арозаупаланвалапуазора";
        String result = "Palindrome";
        char[] strng = str.toCharArray();
        for (int i=0; i<strng.length; i++) {
            System.out.println("Element № [" + i + "] - " + "[" + strng[i] + "]");
        }
        System.out.println( "String Length = " + strng.length);
        for (int i = 0; i < strng.length / 2; i++) {
            if (strng[i] != strng[strng.length - 1 - i]) {
                result = "Not Palindrome!";
                System.out.println("[" + strng[i] + "] != [" + strng[strng.length - 1 - i] + "]");
                break;
            }
            System.out.println("[" + strng[i] + "] = [" + strng[strng.length - 1 - i] + "]");
        }
        System.out.println(result);

        System.out.println("1.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.

        boolean success2 = false;
        while (!success2) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter the length of your array: ");
            int arrayLength2 = input2.nextInt();
            if (arrayLength2 <= 0) {
                System.out.println("The array size must be greater than zero!");
            } else {
                success2 = true;
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
        }

        System.out.println("2.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 3. Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0,
        // і виводить отриманий масив на екран.

        boolean success3 = false;
        while (!success3) {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter the length of your array: ");
            int arrayLength3 = input3.nextInt();
            if (arrayLength3 <= 0) {
                System.out.println("The array size must be greater than zero!");
            } else {
                success3 = true;

                int[] arrayOfNum3 = new int[arrayLength3];
                System.out.println("Insert your numbers: ");
                for (int i = 0; i < arrayLength3; i++) {
                    arrayOfNum3[i] = input3.nextInt();
                }
                for (int i = 0; i < arrayLength3; i++) {
                    if (arrayOfNum3[i] % 2 == 0) {
                        arrayOfNum3[i] = 0;
                    }
                    System.out.print("[" + arrayOfNum3[i] + "]");
                }
                System.out.println(" Your new array");

            }
        }
        System.out.println("3.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //4. Написати програму, яка друкує таблицю значень sin(x),
        // де х - від 0 до 360 з кроком 10.(значення мають бути записані в масив за допомогою циклу)

        double[] arraySinX = new double[360];
        for (int i = 0; i <= arraySinX.length; i+=10) {
            System.out.println("[sin(x)" + i + "°] = [" + Math.sin(i) + "]");
        }

        System.out.println("4.)++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int count = 0;
        int sum = 0;

        int[][] initArray = {
                {
                        1, -2, 3, 4
                },
                {
                        -1, 2, 3, 4
                },
                {
                        1, 20, 3, 4
                },
                {
                        1, -2, 3, 414
                }
        };

        for (int i = 0; i < initArray.length; i++) {
            for (int j = 0; j < initArray.length; j++) {
                if (i > j && initArray[i][j] < 0) {
                    count++;
                }
                if (i < j && initArray[i][j] % 2 != 0) {
                    sum += initArray[i][j];
                }
            }
        }

        System.out.println("Count: " + count);
        System.out.println("sum: " + sum);
    }
}


