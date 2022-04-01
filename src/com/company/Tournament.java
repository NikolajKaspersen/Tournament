package com.company;

import java.util.Scanner;

public class Tournament
{
    private String tournamentDescription;
    private int tournamentDateStart;
    private int tournamentDateEnd;

    public static void createTournament()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til fodboldturnering, tast ja for at spille og nej for at ikke spille.");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("nej")) {
            System.exit(0);
        }




    }
}
