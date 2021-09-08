package org.example;

import java.time.Year;
import java.time.temporal.TemporalField;
import java.util.Scanner;

import static java.lang.System.out;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App ask = new App();
        int a = ask.askage();
        int b = ask.askRetire();
        int year = Year.now().getValue();
        String outp = ask.stringf(a,b,year);
        out.println( outp);
    }

    private int askage(){
        out.print("What is your current age? ");
        int age = in.nextInt();
        return age;
    }
    private int askRetire(){
        out.print("At what age would you like to retire? ");
        int retire = in.nextInt();
        return retire;
    }

    private String stringf(int a, int b,int Year){
        return String.format("You have %d years left until you can retire.\n" +
                "It's %d, so you can retire in %d.", b-a, Year,Year+(b-a));
    }
}
