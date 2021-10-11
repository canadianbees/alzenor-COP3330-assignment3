/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 45 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex45;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main( String [] args) throws IOException {

        File input = new File("./src/main/java/ex45/exercise45_input.txt");
        if(!input.exists())
        {
            System.out.println("File does not exist");
        }

        else
        {
            findIt quote = new findIt();

            //getText gets the text from the file, input
            //replaceWord replaces a selected word with another
            //output writes to a new file that the user specifies by askOutput
            quote.output(quote.replaceWord(quote.getText(input)),quote.askOutput());
        }

    }
}
