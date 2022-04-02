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
        JButton button;
        button = new JButton();
        JButton button2;
        button2 = new JButton();
        button.setText("Se holdscore");
        button2.setText("Opret et nyt hold");
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(e ->
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
    }


    public static void button1Pressed() throws IOException
    {
        String[] score = {"Hold 1", "Hold 2", "Hold 3", "Hold 4", "Hold 5", "Hold 6", "Hold 7", "Hold 8"};
        int result = JOptionPane.showOptionDialog(null,
                "Se holdscore på:", "Holdscore",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, score, score[0]);
    }
}
