/*
 *  UCF COP3330 Fall 2021 assignment_name Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex42;

import java.util.List;

public class getLengths {

    //returns the length of the longest last name
    public int getLongestLN(List<Employee> dataSalaries) {

        int longestLast = 0;
        for (Employee e : dataSalaries) {
            if (e.getLastN().length() > longestLast) {
                longestLast = e.getLastN().length();
            }
        }

        //plus 2 to ensure that the column is one space longer than the longest value in the column
        return longestLast+2;
    }

    //returns the length of the longest last name
    public int getLongestFN(List <Employee> dataSalaries) {

        int longestFirst = 0;
        for (Employee e : dataSalaries) {
            if (e.getFirstN().length() > longestFirst) {
                longestFirst = e.getFirstN().length();
            }
        }

        return longestFirst+2;
    }

    //returns the length of the longest last name
    public int getLongestSAL(List <Employee> dataSalaries) {
        int salLength = 0;

        for (Employee e : dataSalaries) {
            if (e.getSalary().length() > salLength) {
                salLength = e.getSalary().length();
            }
        }

        return salLength+2;
    }

}
