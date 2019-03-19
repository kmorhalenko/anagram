package com.kirll.morhalenko;

import org.junit.*;

import static org.junit.Assert.*;

public class MainTest {

    private AnagramMaker anagramMaker;
//
//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("Before CalculatorTest.class");
//    }
//
//    @AfterClass
//    public  static void afterClass() {
//        System.out.println("After CalculatorTest.class");
//    }

    @Before
    public void initTest() {
        anagramMaker = new AnagramMaker();
    }

    @After
    public void afterTest() {
        anagramMaker = null;
    }

    @Test
    public void reverse() throws Exception {
        assertEquals("ewq123", anagramMaker.splitAndReverseString("qwe123"));
    }

}