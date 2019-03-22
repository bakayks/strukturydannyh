package com.company.Practice2HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Получение данных с консоли
        int[] link1int1 = {scanner.nextInt(), scanner.nextInt()};
        int[] link1int2 = {scanner.nextInt(), scanner.nextInt()};
        int[] link1int3 = {scanner.nextInt(), scanner.nextInt()};
        int[] link2int1 = {scanner.nextInt(), scanner.nextInt()};
        int[] link2int2 = {scanner.nextInt(), scanner.nextInt()};

        //Создание связных списков
        LinkedList<int[]> link1 = new LinkedList<>();
        LinkedList<int[]> link2 = new LinkedList<>();
        LinkedList<int[]> res = new LinkedList<>();

        //Добавление данных в связный список
        link1.add(link1int1);
        link1.add(link1int2);
        link1.add(link1int3);
        link2.add(link2int1);
        link2.add(link2int2);

        for(int i = 0; i<link1.size(); i++){
            int[] rez = link1.get(i);
            for(int x = 0; x<link2.size(); i++){
                int[] rez1 = link2.get(x);
                if(rez[1]==rez1[1]){
                    int[] d = {rez[0]+rez1[0], rez1[1]};
                    res.add(d);
                }
            }
        }

        for(int i = 0; i<res.size();i++){
            int[] rez = res.get(i);
            System.out.print(rez[0]+" "+rez[1]+",");
        }
    }
}
