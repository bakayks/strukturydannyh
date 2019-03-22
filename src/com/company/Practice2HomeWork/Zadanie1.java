package com.company.Practice2HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Получение данных с консоли
        int[] link1int1 = {scanner.nextInt(), scanner.nextInt()};
        int[] link1int2 = {scanner.nextInt(), scanner.nextInt()};
        int[] link1int3 = {scanner.nextInt(), scanner.nextInt()};
        int[] link2int1 = {scanner.nextInt(), scanner.nextInt()};
       // int[] link2int2 = {scanner.nextInt(), scanner.nextInt()};

        //Создание связных списков
        LinkedList<int[]> link1 = new LinkedList<>();
        LinkedList<int[]> link2 = new LinkedList<>();
        LinkedList<int[]> res = new LinkedList<>();

        //Добавление данных в связный список
        link1.add(link1int1);
       // link1.add(link1int2);
       // link1.add(link1int3);
        link2.add(link2int1);
       // link2.add(link2int2);

        LinkedList<int[]> vychislenie = new LinkedList<>();

        for(int i = 0; i<link1.size(); i++){
            for(int z = 0; z<link2.size(); z++){
                int[] get1 = link1.get(i);
                int[] get2 = link2.get(z);
                int[] rez = {get1[0]*get2[0], get1[1]+get2[1]};
                vychislenie.add(rez);
            }
        }


        ArrayList<int[]> konets = new ArrayList<>();
        int n = vychislenie.size();
        for(int i = 0; i<n; i++){
            int[] rez = vychislenie.get(0);
            konets.add(rez);
            int v = konets.size();
            vychislenie.remove(0);
            for(int j = 0; j<n - i - 1; j++){
                int[] rez1 = vychislenie.get(j);
                if(rez[1] == rez1[1]){
                    int[] last = konets.get(v-1);
                    konets.remove(v-1);
                    int[] gotovo = {last[0]+rez1[0], rez1[1]};
                    konets.add(gotovo);
                }
            }

        }
        konets.remove(2);
        konets.remove(3);
        System.out.println();
        for(int i = 0; i<konets.size();i++){
            int[] rez = konets.get(i);

            System.out.print(rez[0]+" "+rez[1]+",");
        }
    }
}
