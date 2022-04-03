package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tournament
{
    private String tournamentDescription;
    private int tournamentDateStart;
    private int tournamentDateEnd;
    static ArrayList<String> name;

    public static void createTournament() throws IOException
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Velkommen til bordfodboldturneringen, tast 1 for at oprette dit hold");
        String input;
        input = scanner.nextLine();

        if (!input.equalsIgnoreCase("1"))
        {
            return;
        }
        TextUI.saveInput();
    }

}