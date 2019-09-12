import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        HashMap<String, String> eliza = new HashMap<String, String>();

        eliza.put("me", "you");
        eliza.put("i", "you");
        eliza.put("I", "you");
        eliza.put("am", "are");
        eliza.put("my", "your");
        String respose = " ";
        String myval = "Why do you think that ";
        System.out.println("Good day.");
        System.out.println("What is your problem? Enter your resposnse or q to quit: ");
        respose = keyboard.nextLine();
        ArrayList<String> qualifier = new ArrayList<>();
        for (String key : eliza.keySet()) {

            if (respose.contains(key)) {

                respose = respose.replaceAll(key, eliza.get(key));



            System.out.println(myval + respose + "?");

            System.out.println("Enter your response or Q to quit");
            respose = keyboard.nextLine();}
            if (respose.equalsIgnoreCase("q") || respose.equalsIgnoreCase("quit") || respose.equalsIgnoreCase("I am felling greate")) {

                System.out.println(respose);

            }


        }
    }
}









