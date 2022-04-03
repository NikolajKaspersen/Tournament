package com.company;

import java.io.FileWriter;
import java.io.IOException;
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

    static ArrayList<String> name;

    static
    {
        name = new ArrayList<>();
    }

    public static void saveInput() throws IOException
    {
        FileWriter out;
        out = new FileWriter("src/com/company/data.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        while (name.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne:");
            name.add(sc.next());
        }
        System.out.print(name);
        out.write(name +"\n");
        out.close();
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
