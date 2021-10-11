/*
 *  UCF COP3330 Fall 2021 Assigment 3 Exercise 45 findIt class file
 *  Copyright 2021 Celina Alzenor
 */

package ex45;

import java.io.*;
import java.util.Scanner;

public class findIt {

    public String getText(File file) throws IOException {

        String line;
        String old = "";
        BufferedReader read = new BufferedReader(new FileReader(file));

        //reads in the lines of the file and adds the necessary characters at the end of each line
        //to signify that is the end of the line
        while ((line = read.readLine()) != null) {

            old += line + "\n";

        }

        read.close();
        return old;
    }

    //returns the new text
    public String replaceWord(String old) {

        //replaces utilize with use and returns it to a new string
        String newText = old.replaceAll("utilize", "use");
        return newText;

    }

    //asks user what file they want to write the new text to
    public boolean output(String newText,String outputName) throws IOException
    {
        //takes the rewrites the file with the new text
        BufferedWriter writr = new BufferedWriter(new FileWriter("./src/main/java/ex45/"+outputName));
        writr.write(newText);

        System.out.print("Successful output!");
        writr.close();

        return true;
    }

    public String askOutput()
    {
        Scanner outputName = new Scanner(System.in);
        String name = "";
        System.out.print("Enter name of output file: ");
        name += outputName.nextLine();

        return name;
    }

}
