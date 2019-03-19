package com.kirll.morhalenko;

public class AnagramMaker {

    private static final String SEPARATOR = " ";

    public String splitAndReverseString(String inputString) {
        return String.join(SEPARATOR, reverseStrings(inputString.split(SEPARATOR)));
    }

    private String[] reverseStrings(String[] strings) {
        String[] reversedStrings = new String[strings.length];
        int stringNumber, lastStringNumber = strings.length;
        for (stringNumber = 0; stringNumber < lastStringNumber; stringNumber++) {
            String stringNeedsToReverse = strings[stringNumber];
            reversedStrings[stringNumber] = doStringReversed(stringNeedsToReverse);
        }
        return reversedStrings;
    }


    private String doStringReversed(String textForReverse) {
        char[] charArrayOfWord = textForReverse.toCharArray();
        int numberOfRightChar = charArrayOfWord.length - 1, numberOfLeftChar = 0;

        while (numberOfLeftChar < numberOfRightChar) {
            if (!Character.isAlphabetic(charArrayOfWord[numberOfLeftChar]))
                numberOfLeftChar++;
            else if (!Character.isAlphabetic(charArrayOfWord[numberOfRightChar]))
                numberOfRightChar--;
            else {
                swapCharacters(charArrayOfWord, numberOfLeftChar, numberOfRightChar);
                numberOfLeftChar++;
                numberOfRightChar--;
            }
        }
        return String.valueOf(charArrayOfWord);

    }

    private char[] swapCharacters(char[] arrayOfChars, int firstCharNum, int secondCharNum) {
        char clipboard = arrayOfChars[firstCharNum];
        arrayOfChars[firstCharNum] = arrayOfChars[secondCharNum];
        arrayOfChars[secondCharNum] = clipboard;
        return arrayOfChars;
    }

}