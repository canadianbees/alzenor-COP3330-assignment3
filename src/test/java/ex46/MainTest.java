/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 46 MainTest file
 *  Copyright 2021 Celina Alzenor
 */
package ex46;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testHisto1() throws IOException {

        File testF = new File("./src/test/java/ex46/test1.txt");
        Frequency test = new Frequency();
        assertEquals("Checking histogram for first file",
                "zebra:     ******\n" +
                "pencil:    ****\n" +
                "pad:       ****\n" +
                "peach:     ***\n" +
                "marker:    ***\n" +
                "cat:       ***\n" +
                "pen:       ***\n" +
                "dog:       ***\n" +
                "elephant:  ***\n" +
                "college:   **\n" +
                "note:      **\n" +
                "mirror:    **\n" +
                "car:       **\n" +
                "plant:     **\n" +
                "notepad:   *\n" +
                "gel:       *\n" +
                "school:    *\n" +
                "spinner:   *\n", test.wordFreq(test.sortByFreq(test.getWords(testF))));

        System.out.println(test.wordFreq(test.sortByFreq(test.getWords(testF))));
    }

    @Test
    public void testHisto2() throws IOException {

        File testF = new File("./src/test/java/ex46/test2.txt");
        Frequency test = new Frequency();

        assertEquals("Checking histogram for second file",
                "fun:       ********************************************************\n" +
                "butter:    ****************************************\n" +
                "apple:     *******************************\n" +
                "tea:       ****************************\n" +
                "towel:     ****************************\n" +
                "paper:     *********\n" +
                "zebra:     ******\n" +
                "pencil:    ****\n" +
                "pad:       ****\n" +
                "peach:     ***\n" +
                "marker:    ***\n" +
                "cat:       ***\n" +
                "pen:       ***\n" +
                "dog:       ***\n" +
                "elephant:  ***\n" +
                "college:   **\n" +
                "note:      **\n" +
                "mirror:    **\n" +
                "car:       **\n" +
                "plant:     **\n" +
                "notepad:   *\n" +
                "gel:       *\n" +
                "school:    *\n" +
                "spinner:   *\n",test.wordFreq(test.sortByFreq(test.getWords(testF))));

        System.out.println(test.wordFreq(test.sortByFreq(test.getWords(testF))));
    }

    @Test
    public void testHisto3() throws IOException {

        File testF = new File("./src/test/java/ex46/test3.txt");
        Frequency test = new Frequency();

        assertEquals("Checking histogram for third file",
                "fun:     ********************************************************\n" +
                "butter:  ****************************************\n" +
                "apple:   *******************************\n" +
                "tea:     ****************************\n" +
                "towel:   ****************************\n" +
                "paper:   *********\n", test.wordFreq(test.sortByFreq(test.getWords(testF))));

        System.out.println(test.wordFreq(test.sortByFreq(test.getWords(testF))));
    }


}
