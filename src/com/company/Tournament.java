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
        System.out.println("Velkommen til bordfodboldturneringen, tast ja for at oprette dit hold");
        String input;
        input = scanner.nextLine();

        if (!input.equalsIgnoreCase("ja"))
        {
            return;
        }
        TextUI.saveInput();
    }

    public static void tournamentFrame()
    {
        JFrame frame;
        frame = new JFrame("Bordfodboldsystemet");
        JPanel panel;
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label;
        label = new JLabel("Velkommen til bordfodboldsystemet");
        JButton button1;
        button1 = new JButton();
        JButton button2;
        button2 = new JButton();
        JButton button3;
        button3 = new JButton();
        JButton button4;
        button4 = new JButton();
        button1.setText("Opret turnering");
        button2.setText("Tilmelding af hold");
        button3.setText("Se alle tilmeldte hold");
        button4.setText("Registrer kampresultater");
        panel.add(label);
        for (JButton jButton : Arrays.asList(button1, button2, button3, button4))
        {
            panel.add(jButton);
        }
        frame.add(panel);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // TODO Implementer en måde hvorpå knappen direkte instansierer og viser dialoger ved tryk af knap 1 & 2
        // TODO JOptionPane-klassen er en reel mulighed her
        // TODO ProgressMonitor-klassen kan også sætte en dialog op, der viser forløbet af en operation,
        // TODO men den giver udfordringer på input siden

        button1.addActionListener(e ->
                {
                    JOptionPane.showMessageDialog(null, "Her skal turneringslederen " +
                            "have mulighed for at oprette en ny turnering", "", JOptionPane.INFORMATION_MESSAGE);
                }
        );

        button2.addActionListener(e ->
                {
                    try
                    {
                        button2Pressed();
                    }
                    catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                }
        );

        button3.addActionListener(e ->
                {
                    try
                    {
                        button3Pressed();
                    }
                    catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                }
        );

        button4.addActionListener(e ->
                {
                    JOptionPane.showMessageDialog(null, "Her skal turneringslederen " +
                            "have mulighed for at registrere kampresultater", "", JOptionPane.INFORMATION_MESSAGE);
                }
        );
    }

    public static void button1Pressed()
    {
        // TODO Oprettelse af ny turnering
    }


    public static void button2Pressed() throws IOException
    {
        // TODO Knappen skal kunne tage input fra brugeren og gemme den vha. filewriter klassen
        // TODO Problem med parseInt som skal løses (FIXET)
        // TODO input skal oplagres i lokal tekst fil som en arraylist
        while (true)
        {
            FileWriter out;
            out = new FileWriter("src/com/company/data.txt", true);
            String inputString;
            inputString = JOptionPane.showInputDialog(null, "Indtast spillernes" +
                    "navn på dit hold" +
                    "(2-5 spillere)");
            String input;
            input = (inputString);
            System.out.println("Spillernavn: " + input);
            JOptionPane.showMessageDialog(null, "Spiller indtastet: " + input);
            System.out.print(name);
            out.write(name +"\n");
            out.close();
        }
    }

    public static void button3Pressed() throws IOException
    {
        // TODO Når der trykkes på et hold, skal spillernavnene komme op
        String[] score;
        score = new String[]{"Hold 1", "Hold 2", "Hold 3", "Hold 4", "Hold 5", "Hold 6", "Hold 7", "Hold 8"};
        int result1;
        result1 = JOptionPane.showOptionDialog(null, "Tryk for at se holdets spillere + score:",
                "Tilmeldte hold",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, score, score[0]);
        JOptionPane.showMessageDialog(null, "Her bør holdets spillere fra " +
                "data.txt filen vises", "", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void button4Pressed()
    {
        // TODO Registrering af kampresultater
    }
}