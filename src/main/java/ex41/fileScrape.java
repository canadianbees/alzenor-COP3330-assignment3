/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 41 fileScrape Class file
 *  Copyright 2021 Celina Alzenor
 */

package ex41;
import java.io.*;
import java.util.*;

public class fileScrape {

    public String readNOut(File file) throws IOException {

        //gets file
        BufferedReader reader = new BufferedReader(new FileReader(file));

        //file to write output to
        BufferedWriter writr = new BufferedWriter(new FileWriter("./src/main/java/ex41/exercise41_output.txt"));

        //count for number of names in file, the "longest" variable is to keep track of the longest name on file
        int count = 0;
        int longest = 0;

        String personName;
        String [] fullName;

        //tree map to auto sort by last name
        TreeMap<String, String> list = new TreeMap<>();

        //runs until the end of the file is reached
        while ((personName = reader.readLine()) != null)
        {
            //if the person's name is longer than the current longest name, update
            if(personName.length() > longest)
            {
                longest = personName.length();
            }

            //split the name into first and last name using an array
            fullName = personName.split(" ");

            //put last name as the key and first name as the value
            list.put(fullName[0],fullName[1]);

            //update the count of names
            count++;

        }

        reader.close();

        String output = "Total of "+count+" names\n";
        //for loop is for formatting purposes, it is based on the longest name
        for(int i = 0; i < longest; i++)
        {
            output += "-";
            writr.write("-");
        }

        output += "\n";

        //write each name in the list sorted by last name to output file
        for(Map.Entry<String, String> s: list.entrySet())
        {
            output += s.getKey()+" "+s.getValue()+"\n";
        }

        writr.write(output);
        writr.close();

        return output;
    }
}
