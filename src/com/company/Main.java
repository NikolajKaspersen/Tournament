package com.company;

public class Main {


// TODO Jframe med 5 knapper,
// TODO knap 1 skal være registre teams
// TODO knap 2 skal vis Teams current goalscores
// TODO knap 3 skal registre match result
// TODO knap 4 skal lave et nyt Tournament
// TODO knap 5 skal vise result for være kamp
    public static void main(String[] args)
    {

        //TournamentSystem.runTournament();

        //System.out.println();
        //TournamentSystem.runTournament();
        Tournament tournament = new Tournament();
        tournament.createTournament();

    }
}
