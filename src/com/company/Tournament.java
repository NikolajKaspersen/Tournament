package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Tournament
{
    private String tournamentDescription;
    private int tournamentDateStart;
    private int tournamentDateEnd;

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
        JButton button5;
        button5 = new JButton();
        JButton button6;
        button6 = new JButton();
        JButton button7;
        button7 = new JButton();
        JButton button8;
        button8 = new JButton();
        JButton button9;
        button9 = new JButton();
        JButton button10;
        button10 = new JButton();
        JButton button11;
        button11 = new JButton();
        button1.setText("Opret turnering");
        button2.setText("Tag imod tilmeldinger");
        button3.setText("Planlæg kampe");
        button4.setText("Registrer kampresultater");
        button5.setText("Tilføj hold til de indledende kampe");
        button6.setText("Tilføj hold til semifinalerne");
        button7.setText("Tilføj hold til finalekampen");
        button8.setText("Se alle tilmeldte hold");
        button9.setText("Se holdenes placering i turneringen");
        button10.setText("Se planlagte kampe");
        button11.setText("Se hvornår den næste kamp spilles");
        panel.add(label);
        for (JButton jButton : Arrays.asList(button1, button2, button3, button4, button5,
                button6, button7, button8, button9, button10, button11))
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

        button8.addActionListener(e ->
        {
            try
            {
                button8Pressed();
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

    public static void button8Pressed() throws IOException
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
        // TODO Knappen skal kunne tage input fra brugeren og gemme den vha. bufferedwriter klassen
        String inputString;
        inputString = JOptionPane.showInputDialog(null, "Indtast spillernes navn på dit hold" +
                "(2-5 spillere)");
        int input;
        input = Integer.parseInt(inputString);
        System.out.println("Spillernavn: " + input);

        JOptionPane.showMessageDialog(null, "Spiller indtastet " + input);
    }
}
