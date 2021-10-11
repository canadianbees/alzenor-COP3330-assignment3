/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 43 createHTML class file
 *  Copyright 2021 Celina Alzenor
 */

package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createHTML {

    public String genSkeleton(String sn, String auth)
    {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>"+sn+"</title>\n" +
                "<meta name =\"author\" content=\""+auth+"\">"+
                "</head>\n"+
                "</html>";
    }

    public void genHtml(String sn, String auth) throws IOException {
        File htmlF = new File("./src/main/java/ex43/website/index.html");
        BufferedWriter writr = new BufferedWriter(new FileWriter(htmlF));
        writr.write(genSkeleton(sn,auth));
        writr.close();
    }

}
