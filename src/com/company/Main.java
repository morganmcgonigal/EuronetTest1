package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = fileToString("problem_1_data.txt");

        int start = 0;
        int end = 10;
        int addressLength;
        int hobbiesLength;

        while (end < str.length()) {
            Person person = new Person();
            String hobbies;

            person.setFirstName(str.substring(start, end).trim());

            if (person.getFirstName().matches("^[ A-Za-z]+$")) {
                System.out.println("First Name:     " + person.getFirstName());
            }
            else if (person.getFirstName().length() < 1) {
                System.out.println("First Name:     (empty)");
            }
            else {
                System.out.println("First Name:     ERROR " + person.getFirstName() + " is invalid");
            }

            start += 10;
            end += 10;

            person.setMiddleName(str.substring(start, end).trim());

            if (person.getMiddleName().matches("^[ A-Za-z]+$")) {
                System.out.println("Middle Name:     " + person.getMiddleName());
            }
            else if (person.getMiddleName().length() < 1) {
                System.out.println("Middle Name:     (empty)");
            }
            else {
                System.out.println("Middle Name:     ERROR " + person.getMiddleName() + " is invalid");
            }

            start += 10;
            end += 30;

            person.setLastName(str.substring(start, end).trim());

            if (person.getLastName().matches("^[ A-Za-z]+$")) {
                System.out.println("Last Name:     " + person.getLastName());
            }
            else if (person.getLastName().length() < 1) {
                System.out.println("Last Name:     (empty)");
            }
            else {
                System.out.println("Last Name:     ERROR" + person.getLastName() + " is invalid");
            }

            start += 30;
            end += 3;
            addressLength = Integer.parseInt(str.substring(start, end));
            end += addressLength;
            start += 3;

            person.setAddress(str.substring(start, end).trim());

            if (person.getAddress().matches("^[a-zA-Z0-9 #./,]+$")) {
                System.out.println("Street Address:     " + person.getAddress());
            }
            else if (person.getAddress().length() < 1) {
                System.out.println("Street Address:     (empty)");
            }
            else {
                System.out.println("Street Address:     ERROR" + person.getAddress() + " is invalid");
            }

            start += addressLength;
            end += 1;
            hobbiesLength = Integer.parseInt(str.substring(start, end));
            start += 1;
            end += 10;

            for (int i = 1; i <= hobbiesLength; i++)
            {
                person.setHobbies(str.substring(start, end).trim());

                start += 10;
                end += 10;
            }

            System.out.print("Hobbies:  ");
            if (person.getHobbies().size() > 0) {
                for (int i = 0; i < person.getHobbies().size(); i++) {
                    if (person.getHobbyItem(i).matches("^[ A-Za-z ,]+$")) {
                        System.out.print(person.getHobbyItem(i) + " ");
                    }
                    else {
                        System.out.println("ERROR   " + person.getHobbyItem(i) + " is invalid");
                    }
                }
            }
            else {
                System.out.print("(empty)");
            }
            System.out.println("\n");
        }
    }

    private static String fileToString(String fileName)
    {
        File file = new File(fileName);
        String str = "";
        try
        {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine())
            {
                str = fileReader.nextLine();
            }
        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        return str;
    }
}