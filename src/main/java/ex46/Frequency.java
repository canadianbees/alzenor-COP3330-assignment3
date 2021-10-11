/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 46 Frequency class file
 *  Copyright 2021 Celina Alzenor
 */

package ex46;

import java.io.*;
import java.util.*;

public class Frequency {


    public Map<String,Integer> getWords(File file) throws IOException
    {
        BufferedReader read = new BufferedReader(new FileReader(file));
        Map<String,Integer> tracker = new HashMap<>();
        String line;
        String words = "";

        //reads the words from the file
        while((line = read.readLine()) != null)
        {
            words += line + " ";
        }

        //puts each word into an index in a string array
        String [] array = words.split(" ");

        //for each string in the array
        for(String s: array)
        {
            //if the map already has the word
            if(tracker.containsKey(s))
            {
                //update its value by one
                tracker.put(s,tracker.get(s)+1);
            }

            //if it's not already in the map, put it in there
            else
            {
                tracker.put(s,1);
            }
        }

        return tracker;
    }

    //prints out a histogram of the word's frequency
    public String wordFreq(Map<String,Integer> tracker)
    {
        int longest = 0;
        String output ="";

        //gets the longest word
        for(Map.Entry<String,Integer> string: tracker.entrySet())
        {
            if(string.getKey().length() > longest)
            {
                longest = string.getKey().length();
            }

        }

        //goes through each word in the map
        for(Map.Entry<String,Integer> string: tracker.entrySet())
        {
            //gets the key and adds a colon
            String s = string.getKey();
            s +=":";

            //formatting purposes
            while(s.length() <= longest+2)
            {
                s+= " ";
            }

            output += s;
            //prints out frequency
            for(int i = 0; i < string.getValue(); i++)
            {
                output += "*";
            }
            output += "\n";
        }

        return output;
    }

    //sorts the map by value
    public Map<String,Integer> sortByFreq(Map<String,Integer> tracker)
    {
        List<Map.Entry<String,Integer>> list =  new LinkedList<>(tracker.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                //returns the greatest one
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String,Integer> sorted = new LinkedHashMap<>();

        //puts data from newly sorted list into a new map
        for(Map.Entry<String,Integer> s : list)
        {
            sorted.put(s.getKey(),s.getValue());
        }

        //returns map
        return sorted;
    }
}
