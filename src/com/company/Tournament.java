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
        button1.setText("Se holdscore");
        button2.setText("Opret et nyt hold");
        button3.setText("Start ny turnering");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // TODO Implementer en måde at direkte instansiere og vise dialoger på med de 2 resterende knapper
        // TODO JOptionPane-klassen er en reel mulighed her
        // TODO ProgressMonitor-klassen kan også sætte en dialog op, der viser forløbet af en operation,
        // TODO men den giver udfordringer på input siden

        button1.addActionListener(e ->
        {
            try
            {
                button1Pressed();
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

    public static void button1Pressed() throws IOException
    {
        String[] score;
        score = new String[]{"Hold 1", "Hold 2", "Hold 3", "Hold 4", "Hold 5", "Hold 6", "Hold 7", "Hold 8"};
        int result;
        result = JOptionPane.showOptionDialog(null,
                "Se holdscore på:", "Holdscore",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, score, score[0]);
    }

    public static void button2Pressed() throws IOException
    {
        // TODO Knappen skal kunne tage input fra brugeren og gemme den vha. bufferedwriter klassen
    }
}
