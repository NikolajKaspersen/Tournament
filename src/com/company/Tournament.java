package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
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
        button1.setText("Opret turnering");
        button2.setText("Tilmelding af hold");
        button3.setText("Se alle tilmeldte hold");
        panel.add(label);
        for (JButton jButton : Arrays.asList(button1, button2, button3))
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
        });

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
        });
    }

    public static void button3Pressed() throws IOException
    {
        String[] score;
        score = new String[]{"Hold 1", "Hold 2", "Hold 3", "Hold 4", "Hold 5", "Hold 6", "Hold 7", "Hold 8"};
        int result;
        result = JOptionPane.showOptionDialog(null, "Tryk for at se holdets spillere + score:",
                "Tilmeldte hold",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, score, score[0]);
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
            inputString = JOptionPane.showInputDialog(null, "Indtast spillernes navn på dit hold" +
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
}
