/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 43 MainTest file
 *  Copyright 2021 Celina Alzenor
 */


package ex43;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testHTML()
    {
        createHTML test = new createHTML();
        test.genSkeleton("website.com","website author");

        assertEquals("Checking if the html for website.com is correct","<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>website.com</title>\n" +
                "<meta name =\"author\" content=\"website author\">"+
                "</head>\n"+
                "</html>", test.genSkeleton("website.com","website author"));

        assertEquals("Checking if the html for google.com is correct","<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>google.com</title>\n" +
                "<meta name =\"author\" content=\"CEO OF GOOGLE\">"+
                "</head>\n"+
                "</html>", test.genSkeleton("google.com","CEO OF GOOGLE"));
    }

    //makes new directories, should return TRUE
    @Test
    public void checkDirect()
    {
        assertTrue(TESTmainDirect("website.com"));
        assertTrue(TESTmainDirect("google.com"));

        assertTrue(TESTcssDirect("website.com"));
        assertTrue(TESTcssDirect("google.com"));

        assertTrue(TESTjsDirect("website.com"));
        assertTrue(TESTjsDirect("google.com"));
    }

    //since these directories already exist, they should return false
    @Test
    public void AlreadyExist()
    {
        assertFalse("Checking if the MAIN directory for website.com already exists",TESTmainDirect("website.com"));
        assertFalse("Checking if the MAIN directory for google.com already exists",TESTmainDirect("google.com"));

        assertFalse("Checking if the CSS directory for website.com already exists",TESTcssDirect("website.com"));
        assertFalse("Checking if the CSS directory for google.com already exists",TESTcssDirect("google.com"));

        assertFalse("Checking if the JS directory for website.com already exists",TESTjsDirect("website.com"));
        assertFalse("Checking if the JS directory for google.com already exists",TESTjsDirect("google.com"));
    }

    //structured the same way in the createWeb class file
    public boolean TESTcssDirect(String sn)
    {
        return new File("./src/test/java/ex43/website/"+sn+"/css/").mkdirs();
    }

    public boolean TESTjsDirect(String sn)
    {
        return new File("./src/test/java/ex43/website/"+sn+"/js/").mkdirs();
    }

    public boolean TESTmainDirect(String sn)
    {
        return new File("./src/test/java/ex43/website/"+sn).mkdirs();
    }
}
