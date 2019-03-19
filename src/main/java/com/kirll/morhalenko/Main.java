package com.kirll.morhalenko;

import java.util.Scanner;

public class Main {

    private final static AnagramMaker anagramMaker = new AnagramMaker();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you string:\n");

        String inputString = scanner.nextLine();
        System.out.println("   Input string: " + inputString);

        String outputString = anagramMaker.splitAndReverseString(inputString);
        System.out.print("Reversed string: "+outputString);

    }

}


