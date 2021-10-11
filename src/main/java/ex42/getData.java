/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 42 getData class file
 *  Copyright 2021 Celina Alzenor
 */

package ex42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getData {

    //gets info from file and returns a list filled with that information
    public List<Employee> listOfEmployees(File file) throws IOException {

        //gets file
        BufferedReader data = new BufferedReader(new FileReader(file));

        String person;
        String[] info;

        //list to hold the employees' info
        List<Employee> list = new ArrayList<>();

        //runs until the end of the file is reached
        while ((person = data.readLine()) != null) {

            //split the person's info into last name, first name, and salary, each with
            //a separate index respectively. Stored in a string array
            info = person.split(",");

            //put info in list
            list.add(new Employee(info[0], info[1], info[2]));
        }
        data.close();
        return list;
    }

    //returns a chart with all employee info
    public String printChart(List<Employee> list) {

        getLengths longest = new getLengths();

        //gets the longest value in each column
        int longLN = longest.getLongestLN(list);
        int longFN = longest.getLongestFN(list);
        int longSAL = longest.getLongestSAL(list);

        //adds the longest last name, first name, and salary together
        int totalDash = longLN + longFN + longSAL+1;

        //stores header in output
        String output = String.format("%-"+longLN+ "s %-"+longFN+"s %s\n", "Last", "First", "Salary");

        //for formatting purposes
        for (int i = 0; i < totalDash; i++) {

            output += "-";
        }

        output += "\n";

        //goes through each employee in the list
        for (Employee p : list) {
            StringBuilder ln = new StringBuilder(p.getLastN());
            StringBuilder fn = new StringBuilder(p.getFirstN());

            //add space until the border is reached
            while (ln.length() <= longLN) {
                ln.append(" ");
            }

            while (fn.length() <= longFN) {
                fn.append(" ");
            }

            //store each line in the output string
            output += ln + "" + fn + "" + p.getSalary()+"\n";

        }

        return output;
    }
}
