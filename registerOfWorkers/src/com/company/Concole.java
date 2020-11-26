package com.company;

import java.util.Scanner;

public class Concole {
    private static Scanner scanner = new Scanner(System.in);

    public static String readData(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}
