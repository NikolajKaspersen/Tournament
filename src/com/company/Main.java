package com.company;

import java.io.IOException;

public class Main
{
    static TournamentSystem tournament;
    public static void main(String[] args) throws IOException
    {
        //System.out.println();
        //TournamentSystem.runTournament();

        tournament = new TournamentSystem();

        Tournament.tournamentFrame();
        Tournament.createTournament();
    }
}
