package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
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
        button8.setText("Alle tilmeldte hold");
        button9.setText("Holdenes placering i turneringen");
        button10.setText("Planlagte kampe");
        button11.setText("Hvornår den næste kamp spilles");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
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
        result = JOptionPane.showOptionDialog(null, "Tryk for at se holdets spillere + score:", "Tilmeldte hold",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, score, score[0]);
    }

    public static void button2Pressed() throws IOException
    {
        // TODO Knappen skal kunne tage input fra brugeren og gemme den vha. bufferedwriter klassen
    }
}
