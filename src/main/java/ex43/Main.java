/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 43 Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex43;

import java.io.IOException;

public class Main {

    public static void main(String []args) throws IOException {

        createWeb website = new createWeb();
        website.genWeb(website.askSiteName(),website.askAuthor());
    }
}
