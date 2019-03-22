package com.company.Practice4HomeWork;

import java.util.Scanner;

public class Zadanie3inet {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int res = 0;
            for (int i=1; i<=n; ++i)
                res = (res + k) % i;
            System.out.println(res + 1);
        }
    }

