package com.company.Practice3HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> chars = new ArrayList<>();
        strings.add(scanner.nextLine());
        strings.add(scanner.nextLine());
        strings.add(scanner.nextLine());
        strings.add(scanner.nextLine());
        strings.add(scanner.nextLine());

        for(int i = 0; i<strings.size();i++){
            String n = strings.get(i);
            if(n.equals("+") || n.equals("-")|| n.equals("*") ||n.equals("/")){
                chars.add(strings.get(i));
                strings.remove(i);
            }

        }

        for(int i = 0; i<strings.size(); i++){
            System.out.print(strings.get(i));
        }
        for(int i = 0; i<chars.size(); i++){
            System.out.print(chars.get(i));
        }
    }
}
