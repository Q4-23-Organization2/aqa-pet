package main_package.HomeWork_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1.Написати програму "CheckOddEven" яка друкує "Odd number", якщо змінна непарна, або "Even number",
        // якщо парна. Перед завершенням роботи програма має друкувати "BYE". Значення змінної можна задати
        // вручну через Scanner або присвоїти початкове значення в коді.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your number: ");
        int yourNum = scan.nextInt();
        if (yourNum==0) {
            System.out.println("The entered number is zero!");
        }
        else if (yourNum%2==0) {
            System.out.println(yourNum + " - is Even number");
        } else {
            System.out.println(yourNum + " - is Odd number");
        }
        System.out.println("BYE!!!");

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //2.Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC" якщо значення int змінної дорівнює 1, 2, 3 ... 12. Або повинна вивести "Not a valid month". Розв'язати завдвння 2 способами:
        //
        //1) за допомогою операторів if-else
        //
        //2) за допомогою оператора switch

        // 2.1  За допомогою операторів if-else:
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Chose your month by number from 1 to 12: ");
        int yourMonth = scan1.nextInt();
        if (yourMonth == 1) {
            System.out.println("JAN");
        } else if (yourMonth == 2) {
            System.out.println("FEB");
        } else if (yourMonth == 3) {
            System.out.println("MAR");
        } else if (yourMonth == 4) {
            System.out.println("APR");
        } else if (yourMonth == 5) {
            System.out.println("MAY");
        } else if (yourMonth == 6) {
            System.out.println("JUN");
        } else if (yourMonth == 7) {
            System.out.println("JUL");
        } else if (yourMonth == 8) {
            System.out.println("AUG");
        } else if (yourMonth == 9) {
            System.out.println("SEP");
        } else if (yourMonth == 10) {
            System.out.println("OCT");
        } else if (yourMonth == 11) {
            System.out.println("NOW");
        } else if (yourMonth == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //2.2 За допомогою оператора switch:
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Chose your month by number from 1 to 12: ");
        int yourMonth2 = scan2.nextInt();
        switch (yourMonth2) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOW");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }




//        String Str = new String("Добро пожаловать на ProgLang.su");
//
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.substring(6));
//
//        System.out.print("Возвращаемое значение: ");
//        System.out.println(Str.substring((args.length-1), 15));
    }
}
