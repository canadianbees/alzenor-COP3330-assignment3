/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 43 createWeb class file
 *  Copyright 2021 Celina Alzenor
 */

package ex43;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createWeb {

    //asks user for the website's name
    public String askSiteName()
    {
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Site name: ");
        name += input.nextLine();

        return name;
    }

    //asks user for the author's name
    public String askAuthor()
    {
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Author: ");
        name += input.nextLine();

        return name;
    }

    //generates the necessary directories
    public void genWeb(String sn, String auth) throws IOException {

        //asks user if they want to create a JS folder or a CSS folder
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want a folder for JavaScript? ");
        String js = input.next();

        System.out.print("Do you want a folder for CSS? ");
        String css = input.next();

        //if the main directory doesn't already exist, create it
        if(mainDirect(sn))
        {
            System.out.println("Created ./src/main/java/ex43/website/"+sn);

        }

        else
        {
            System.out.println("The main directory already exists!");
        }

        //creates the html file
        createHTML index = new createHTML();
        index.genHtml(sn,auth);

        System.out.println("Created ./src/main/java/ex43/website/index.html");

        //if user choices to create a js folder, it will create one if one doesn't already exist
        if(js.matches("y"))
        {
            if(jsDirect(sn))
            {
                System.out.println("Created ./src/main/java/ex43/website/"+sn+"/js/");

            }

            else
            {
                System.out.println("The JavaScript directory already exists!");

            }

        }

        //if user choices to create a css folder, it will create one if one doesn't already exist
        if(css.matches("y"))
        {
            if(cssDirect(sn))
            {
                System.out.println("Created ./src/main/java/ex43/website/"+sn+"/css/");
            }

            else
            {
                System.out.println("The CSS directory already exists!");
            }
        }

        input.close();
    }

    //checks if directory already exists, if it does, it returns false
    public boolean cssDirect(String sn)
    {
        return new File("./src/main/java/ex43/website/"+sn+"/css/").mkdirs();
    }

    //works same as cssDirect method
    public boolean jsDirect(String sn)
    {
        return new File("./src/main/java/ex43/website/"+sn+"/js/").mkdirs();
    }

    //checks if main directory exists already
    public boolean mainDirect(String sn)
    {
        return new File("./src/main/java/ex43/website/"+sn).mkdirs();
    }

}
