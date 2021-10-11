/*
 *  UCF COP3330 Fall 2021 Assigment 3 Exercise 45 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex45;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void checkOldText() throws IOException {
        File testFile = new File("./src/test/java/ex45/test1.txt");

        findIt replacement = new findIt();
        assertEquals("Checking the old text","The quick brown fox jumps over the lazy dog. The dog\n" +
                "didn't like this and started barking ferociously at the fox.\n" +
                "The fox, in retaliation, started growling!\n",replacement.getText(testFile));

    }

    @Test
    public void checkNewText() throws IOException
    {
        File testFile = new File("./src/test/java/ex45/test1.txt");
        File TFuot = new File("./src/test/java/ex45/test1out.txt"); // output file


        findIt replacement = new findIt();
        assertEquals("Checking the new text","The quick brown duck jumps over the lazy dog. The dog\n" +
                "didn't like this and started barking ferociously at the duck.\n" +
                "The duck, in retaliation, started growling!\n",replaceWord(TFuot, replacement.getText(testFile)));
    }

    //works the same way as the method in the findIt class file
    //replaces fox with duck
    public String replaceWord(File file, String old) throws IOException {
        //replaces utilize with use and returns it to a new string
        String newText = old.replaceAll("fox", "duck");
        System.out.println(newText);

        //writes new text to output file
        BufferedWriter writr = new BufferedWriter(new FileWriter(file));
        writr.write(newText);
        writr.close();

        return newText;

    }
}
