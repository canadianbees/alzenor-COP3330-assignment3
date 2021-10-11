/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 44 MainTest file
 *  Copyright 2021 Celina Alzenor
 */


package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    //tests to see if items are found
    public void findItem() throws IOException, ParseException
    {
        File test1F = new File("./src/test/java/ex44/test1.json");
        Store test = new Store();
        Map<String, Products> testInventory = test.readJSON(test1F);

        assertTrue("Looking if sugar is present",test.searchStore(testInventory,"Sugar"));
        assertTrue("Looking if salt is present",test.searchStore(testInventory,"Salt"));
        assertTrue("Looking if water is present",test.searchStore(testInventory,"Water"));
        assertTrue("Looking if eggs is present",test.searchStore(testInventory,"Eggs"));
        assertTrue("Looking if bread is present",test.searchStore(testInventory,"Bread"));
        assertTrue("Looking if milk is present",test.searchStore(testInventory,"Milk"));

    }

    @Test
    //product wont be found so it will return false
    public void notFound() throws IOException, ParseException
    {
        File test1F = new File("./src/test/java/ex44/test1.json");
        Store test = new Store();
        Map<String, Products> testInventory = test.readJSON(test1F);


        assertFalse("Looking if juice is present",test.searchStore(testInventory,"Juice"));
        assertFalse("Looking if grapes are present",test.searchStore(testInventory,"Grapes"));
        assertFalse("Looking if cookies are present",test.searchStore(testInventory,"Cookies"));
        assertFalse("Looking if cakes are present",test.searchStore(testInventory,"Cakes"));
        assertFalse("Looking if chips are present",test.searchStore(testInventory,"Chips"));
        assertFalse("Looking if dip is present",test.searchStore(testInventory,"Dip"));
    }

}
