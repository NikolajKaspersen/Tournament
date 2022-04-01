package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI
{
    public static ArrayList<String> getPlayerNames(String message)
    {
        ArrayList<String> data = new ArrayList<>();

        String input;
        Scanner scan = new Scanner(java.lang.System.in);


        while(data.size() < 6)
        {
            java.lang.System.out.println(message);

            input = scan.nextLine();

            if(input.equalsIgnoreCase("Q"))
            {
                break;
            }
            data.add(input);

        }

        return data;
    }

    public void displayMessage(String msg)
    {
        java.lang.System.out.println(msg);
    }


    public String getUserInput(String message)
    {
        displayMessage(message);
        Scanner scanner = new Scanner(java.lang.System.in);
        String input = scanner.nextLine();

        return input;
    }
}
