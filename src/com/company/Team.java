package com.company;
import java.util.ArrayList;


public class Team
{
    ArrayList<String> players = new ArrayList<>();

    public ArrayList<String> getPlayers()
    {
        return players;
    }

    public void addPlayer(String name) {
        players.add(name);
    }

    public boolean canAddPlayer() {
        return players.size() < 5;
    }

    public boolean playerEnough() {
        return players.size() > 1;
    }

}
