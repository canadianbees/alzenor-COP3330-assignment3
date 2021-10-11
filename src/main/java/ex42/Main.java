/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 42 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex42;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String []args) throws IOException {

        File file = new File("./src/main/java/ex42/exercise42_input.txt");

        //if file doesn't exist, end program
        if(!file.exists())
        {
            System.out.println("File does not exist");
        }

        //if the file exists, print the chart
        else
        {
            getData empRecords = new getData();

            //listOfEmployees takes in the file and returns a list of employees
            //printChart does the appropriate formatting and returns a chart with all the info
            System.out.print(empRecords.printChart(empRecords.listOfEmployees(file)));

        }

    }

}
