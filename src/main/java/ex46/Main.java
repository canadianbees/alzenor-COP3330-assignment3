/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 46 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex46;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {

        File input = new File("./src/main/java/ex46/exercise46_input.txt");

        if(!input.exists())
        {
            System.out.println("File does not exist");
        }

        else
        {
            Frequency word = new Frequency();

            //getWords reads words from a file and returns a map with those words
            //sortByFreq takes in a map, and returns a sorted map
            //wordFreq takes in a map and prints frequencies of each word
            System.out.print(word.wordFreq(word.sortByFreq(word.getWords(input))));
        }

    }
}
