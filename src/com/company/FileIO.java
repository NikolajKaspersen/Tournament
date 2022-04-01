package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{

        ArrayList<String> inputData() {
        File file = new File("src/com/company/data.txt");
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            String header = scan.nextLine();
            while (scan.hasNextLine()) {
                data.add(scan.nextLine());//“Egon: 30000”
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }

    public String[] readData() {

        File file = new File("src/com/company/fieldData.csv");
        String[] data = new String[40];

        try {
            Scanner scan = new Scanner(file);
            int i = 0; //counter variabel

            String header = scan.nextLine();//Ignorer header

            while (scan.hasNextLine()) {
                data[i]=scan.nextLine();
                i++;
                // data.add();
            }
        } catch (FileNotFoundException e) {

            data = null;
        }
        return data;
    }

    public String readResult()
    {
        return null;
    }


    public String SaveDate()
    {
        return null;
    }





}
