/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 41 Solution
 *  Copyright 2021 Celina Alzenor
 */
package ex41;
import java.io.*;

public class Main
{
    public static void main( String[] args ) throws IOException
    {
        //get path of the file
        File file = new File("./src/main/java/ex41/exercise41_input.txt");

        if(!file.exists())
        {
            System.out.println("File does not exist");
        }

        else
        {
            fileScrape names = new fileScrape();

            //reads names from file and writes them to a new output file
            names.readNOut(file);
        }


    }
}
