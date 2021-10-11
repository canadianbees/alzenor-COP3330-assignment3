/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 41 AppTest file
 *  Copyright 2021 Celina Alzenor
 */
package ex41;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    //checks if output is sorted
    public void checkSort() throws IOException {
        fileScrape test = new fileScrape();
        File testFile1 = new File("./src/test/java/ex41/test1.txt");
        File testFile2 = new File("./src/test/java/ex41/test2.txt");
        File testFile3 = new File("./src/test/java/ex41/test3.txt");

        String output1 = "Total of 21 names\n" +
                "---------------------------\n" +
                "adsfagcvnmnyuiy, asdfasdfwe\n" +
                "bnvmqerqre, zxczbtad\n" +
                "cvbdfgjhkb vs,\n" +
                "cvmawtliou, dfgadfgsg\n" +
                "dfghrtyiyu, adsfasdfsdfs\n" +
                "dfgwerte, asdfasdfa\n" +
                "erytiuou, hfjsertre\n" +
                "gjhkuopiyiyu, asdfas\n" +
                "hgkuipgkbxbi, cvjkyute\n" +
                "qwerfghdfgcv, cvbxcvbxcb\n" +
                "qweryuiou, ertweu\n" +
                "qweryuyohjdfgf, sdfasdf\n" +
                "sdfewrtiioopjhk, sdfasdf\n" +
                "sdfgvbnm, fghdserg\n" +
                "sdfgvbnmghje, asfdasdf\n" +
                "sdfgwrtey, xcvbcxvbc\n" +
                "sfgiuouio, sdfgsdfga\n" +
                "vbnxffs, uyouttebzb\n" +
                "wretyuiyuv, asdaa\n" +
                "zcvxgasdfn, xcvbadfs\n" +
                "zxcvzxvsd, dfcvnour\n";

        String output2 = "Total of 12 names\n" +
                "-----------------\n" +
                "bananas, joelle\n" +
                "cantaloupe, melon\n" +
                "celery, vegetable\n" +
                "fruit, peach\n" +
                "grapes, tiny\n" +
                "kiwi, hairy\n" +
                "lemons, sour\n" +
                "limes, sour\n" +
                "pit, apple\n" +
                "plums, purple\n" +
                "watermelon, big\n" ;

        String output3 = "Total of 9 names\n" +
                "--------------------------\n" +
                "Connors-Fairbanks, Michael\n" +
                "Garrett, Jeffrey\n" +
                "Jones-Smith, Jimothy\n" +
                "Michaleson, Michael\n" +
                "Miller-Cross, Christopher\n" +
                "Pearson, Bennett\n" +
                "Smith-Jones, Maya\n" +
                "Spencer-Wong, Aaron\n" +
                "Tapper, Timothy\n";


            assertEquals("Checking output for first file",output1,test.readNOut(testFile1));
            assertEquals("Checking output for second file",output2 ,test.readNOut(testFile2));
            assertEquals("Checking output for third file",output3 ,test.readNOut(testFile3));

    }
}
