package com.java.View;

import java.util.Scanner;

public class InputUtility {

    public static int numberForMenu()  {
        Scanner scanner = new Scanner(System.in);
        AnimalView animalView = new AnimalView();
        int number = scanner.nextInt();
        while (number < 1 || number > 5) {
            animalView.printMessage(AnimalView.ERR_NUMB_FOR_MENU);
            number = scanner.nextInt();
        }
        return number;
    }

    public static int numberForMorThanAge() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static String familyForFunc()  {
        Scanner scanner = new Scanner(System.in);
        String fam = scanner.next();
        return fam;
    }

    public static String[] speciesAndColorForFunc()  {
        Scanner scanner = new Scanner(System.in);
        String sp = scanner.next();
        String col = scanner.next();
        String[] str = new String[2];
        str[0] = sp;
        str[1] = col;
        return str;
    }

}