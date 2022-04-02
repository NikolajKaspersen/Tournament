package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI
{
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
}
