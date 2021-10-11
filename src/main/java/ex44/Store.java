/*
 *  UCF COP3330 Fall 2021 Assigment 3 Exercise 44 Store class file
 *  Copyright 2021 Celina Alzenor
 */

package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Store {

    //asks user to input a product name
    public String findThis() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String prodName = "";
        prodName += input.nextLine();

        return prodName;

    }

    //reads a JSON file and puts its contents into a hashmap
    public Map<String, Products> readJSON(File in) throws IOException, ParseException {

        Map<String, Products> inventory = new HashMap<>();
        JSONParser jsonPar = new JSONParser();

        //reads json file
        JSONObject contents = (JSONObject) jsonPar.parse(new FileReader(in));

        //gets the products jsonArray
        JSONArray catalog = (JSONArray) contents.get("products");

        //goes through each object in the JSON array
        for (Object o : catalog) {
            JSONObject info = (JSONObject) o;
            String name = (String) info.get("name");
            double price = (double) info.get("price");
            long quant = (long) info.get("quantity");
            inventory.put(name, new Products(name, price, quant));
        }


        return inventory;
    }

    //searches the hashmap for a product, returns false if it could not be found
    public boolean searchStore(Map<String, Products> inventory, String find) {

        //goes through each key in the inventory hashmap
        for (Map.Entry<String, Products> s : inventory.entrySet()) {

            //get key
            String key = s.getKey();

            //if the key matches the product that is being searched for, print its contents and return true
            if (key.matches(find)) {
                System.out.println("Name: " + key);
                System.out.printf("Price: %.2f\n",inventory.get(find).getPrice());
                System.out.println("Quantity: " + inventory.get(find).getQuantity());
                return true;
            }

        }

        //product wasn't found so return false
        return false;
    }


}
