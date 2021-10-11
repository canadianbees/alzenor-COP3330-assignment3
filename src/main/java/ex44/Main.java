/*
 *  UCF COP3330 Fall 2021 Assigment 3 Exercise 44 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex44;

import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String []args) throws IOException, ParseException {
        Store bodega = new Store();
        File file = new File("./src/main/java/ex44/exercise44_input.json");
        Map<String, Products> inventory = bodega.readJSON(file);

        boolean found = false;

        //runs until the product has been found
        while(!found)
        {
            //returns true if the product was found
            found = bodega.searchStore(inventory, bodega.findThis());

            //if the product couldn't be found, print the message and prompt for a product name again
            if(!found)
            {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }


    }
}
