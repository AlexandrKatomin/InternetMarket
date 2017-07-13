package ru.pre_job;

/**
 * Created by Alex on 13.07.2017.
 */

import java.util.Scanner;

public class ConsoleReader {

    private ConsoleReader() {
    }

    private final static Scanner SCANNER = new Scanner(System.in);

    public static int readInt(String informText) {
        System.out.println(informText);
        return SCANNER.nextInt();
    }

    public static double readDouble(String informText) {
        System.out.println(informText);
        return Double.parseDouble(SCANNER.nextLine());
    }

    public static void clearBuffer() {
        SCANNER.nextLine();
    }

    public static String readString(String informText) {
        System.out.println(informText);
        return SCANNER.nextLine();
    }
}

