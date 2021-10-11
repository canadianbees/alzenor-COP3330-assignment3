/*
 *  UCF COP3330 Fall 2021 Assignment 3 Exercise 42 MainTest file
 *  Copyright 2021 Celina Alzenor
 */

package ex42;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    //checks if the longest length is returned for each column
    public void checkLongest() throws IOException {
        File file1 = new File("./src/test/java/ex42/test1.txt");

        getData test = new getData();
        getLengths testL1 = new getLengths();

        assertEquals("checking longest first name of first file",11,testL1.getLongestFN(test.listOfEmployees(file1)));
        assertEquals("checking longest last name of first file",11,testL1.getLongestLN(test.listOfEmployees(file1)));
        assertEquals("checking longest salary of first file",8,testL1.getLongestSAL(test.listOfEmployees(file1)));

        file1 = new File("./src/test/java/ex42/test2.txt");
        assertEquals("checking longest first name of second file",28,testL1.getLongestFN(test.listOfEmployees(file1)));
        assertEquals("checking longest last name of second file",33,testL1.getLongestLN(test.listOfEmployees(file1)));
        assertEquals("checking longest salary of second file",8,testL1.getLongestSAL(test.listOfEmployees(file1)));

    }

    @Test
    //checks if chart is printed correctly
    public void checkChart() throws IOException {

        File file1 = new File("./src/test/java/ex42/test1.txt");
        getData test = new getData();

        assertEquals("Checking chart for first file",
                "Last        First       Salary\n" +
                "-------------------------------\n" +
                "Chapman     Katerina    257038\n" +
                "Meyer       Jose        394406\n" +
                "Rodriguez   Ralph       265247\n" +
                "Moore       Dana        171619\n" +
                "Rogers      Chloe       416078\n" +
                "Flores      Robyn       377134\n" +
                "Ross        Sandra      476336\n" +
                "Thomas      Tara        198541\n" +
                "Ramos       Maya        114180\n" +
                "Houston     Elijah      204399\n" +
                "Zavala      Anika       66876\n" +
                "Hutchings   Frazer      297431\n" +
                "Prosser     Fern        312350\n" +
                "Dawson      Amy-Leigh   101810\n" +
                "Tait        Aariz       427371\n" +
                "Phelps      Remi        315619\n",test.printChart(test.listOfEmployees(file1)));

        file1 = new File("./src/test/java/ex42/test2.txt");

        assertEquals("Checking chart for second file",
                "Last                              First                        Salary\n" +
                "----------------------------------------------------------------------\n" +
                "adfsfsadf                         sdgsfgserter                 124248\n" +
                "sdgasdggsgasgs                    sdgfsdfgrtere                454604\n" +
                "sdfgdsfgsgdfgd                    dfgreyedbcvbxc               395399\n" +
                "sdfgetegxcvbcb                    sdgseryrghdsgd               132163\n" +
                "dfghdrtyreuyyiyu                  fhfghnvbncxvbsdte            123\n" +
                "sdfgdsgcvbnmhjluiotyrewadsfgdf    sdgfrweytruyiutpougfnvbn     430797\n" +
                "ghjyutryegdfjtyrtgdfg             sdcbvghyretsgdhrtedgdf       7456\n" +
                "gsfhtyrtgffhyrtgff                sgdfyrteftudhgfgteagf        3803\n" +
                "dfgsdgdfgdgsdgs                   sdgfgdffg                    74673\n" +
                "dfgertdgffhg                      sdfgdvbnvmbnxb               72647\n" +
                "sdfgwertyruiojhgf                 mnbvcdsfghjkiuyg             9841\n" +
                "poiuytghjhgfvb                    sdfgwerytutujgjdgdg          24347\n" +
                "sdfggjnbvftyuikjhgfrtyhnbvfghnb   fghjuytfghjopoiuytfvbg       51558\n" +
                "fhgjfhghopuyutyrtgdfggfbxgn       mnbvddfguiplkjhgfvf          88090\n" +
                "wertyuioiuytreghhgfdfbnbfjkoi     mnbvcxasdfghjkloiuytrewfgh   7361\n" +
                "asdfasdfdsasdf                    jyuityk                      133213\n" +
                "sdfg                              iuyt                         115861\n" +
                "kgjhdfg                           jkhhkk                       102701\n" +
                "dfg                               jkhn                         90466\n" +
                "sdfgsf                            hjtyui                       111707\n" +
                "mhjlo                             xaqwer                       2785\n" +
                "xcvbfg                            nbmjo                        84617\n",test.printChart(test.listOfEmployees(file1)));

    }

}
