package com.company;
import java.util.ArrayList;


public class Team
{
    private String teamName;

    ArrayList<Player> players;

    public Team(String name) {
        this.teamName = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
