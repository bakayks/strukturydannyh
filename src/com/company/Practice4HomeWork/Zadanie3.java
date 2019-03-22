package com.company.Practice4HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); int b = scanner.nextInt();
        ArrayList<Integer> ints = new ArrayList<>();
        for(int i = 0; i<a; i++){
            ints.add(i+1);
        }

        for (int i = 0; i<ints.size(); i++){
            System.out.println(ints.get(i));
        }

        int udal =  b - 1;
        int y = 0;
        while(udal<ints.size()){
            ints.remove(udal);
            udal = udal + b - 1;
            if(udal>ints.size()){
                udal = udal - ints.size();
                System.out.println("aassd");
            }
            if(ints.size() == 1){
                System.out.println("Число Иосифуса = "+ints.get(0));
            }
        }


        for (int i = 0; i<ints.size(); i++){
            System.out.println(ints.get(i));
        }

    }
}
