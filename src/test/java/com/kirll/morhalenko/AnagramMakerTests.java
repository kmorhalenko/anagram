package com.kirll.morhalenko;

import org.junit.*;

import static org.junit.Assert.*;

public class AnagramMakerTests {
    private AnagramMaker anagramMaker = new AnagramMaker();

    @BeforeClass
    public static void beforeClass() {
        System.out.println(" _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____ ");
        System.out.println("|_   _| ____/ ___|_   _| / ___|_   _|/ \\  |  _ \\_   _| ____|  _ \\");
        System.out.println("  | | |  _| \\___ \\ | |   \\___ \\ | | / _ \\ | |_) || | |  _| | | | |");
        System.out.println("  | | | |___ ___) || |    ___) || |/ ___ \\|  _ < | | | |___| |_| |");
        System.out.println("  |_| |_____|____/ |_|   |____/ |_/_/   \\_\\_| \\_\\|_| |_____|____/ \n");
    }

    @Test
    public void reverseNumericalString() {
        assertEquals("1234567890", anagramMaker.splitAndReverseString("1234567890"));
    }

    @Test
    public void specialCharactersNotReverse() {
        assertEquals("!@#$%^&*(()", anagramMaker.splitAndReverseString("!@#$%^&*(()"));

    }

    @Test
    public void reverseStringOfCharacters() {
        assertEquals("privetMir", anagramMaker.splitAndReverseString("riMtevirp"));

    }

    @Test
    public void splitAndReverseString() {
        assertEquals("qwerty asdfgh zxcvb", anagramMaker.splitAndReverseString("ytrewq hgfdsa bvcxz"));
    }

    @Test
    public void reverseEmptyString() {
        assertEquals("", anagramMaker.splitAndReverseString("       "));
    }

    @Test
    public void reverseStringWithCharactersAndNumbers() {
        assertEquals("qwe123qwe", anagramMaker.splitAndReverseString("ewq123ewq"));
    }

    @Test
    public void reverseStringWithCharactersAndSpecialCharacters() {
        assertEquals("sad!@#qwe", anagramMaker.splitAndReverseString("ewq!@#das"));
    }

}

