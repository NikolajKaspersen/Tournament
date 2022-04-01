package com.company;

import java.util.Scanner;

public class Tournament
{
    private String tournamentDescription;
    private int tournamentDateStart;
    private int tournamentDateEnd;

    public void createTournament()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til fodboldturnering, tast ja for at spille");
        String input = scanner.nextLine();

        if(!input.equalsIgnoreCase("ja")) {
            System.exit(0);
        }
            //heheheheh//




    }
}
