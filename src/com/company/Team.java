package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Team
{
    ArrayList<Player> players = new ArrayList<>();
    Set<String> playerNames = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    private String teamName;
    private int numberOfPlayers;


    public Team(String name)
    {
        this.teamName = name;
    }

    public ArrayList<Player> addPlayers()
    {
        System.out.println("What are the names of the " + this.numberOfPlayers + " players?\n");

        for (int i = 1; i <= this.numberOfPlayers; i++) {
            while (true) {
                System.out.println("Player " + i + " please enter your name");
                String playerName = sc.nextLine();

                if (playerNames.add(playerName)) {// Set.add returns true if name was added to it
                    Player p = new Player();
                    p.setPlayerName(playerName);
                    players.add(p);
                    break; // input new player
                }
            }
        }
        return players;
    }

    public String getName()
    {
        return teamName;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }
}
