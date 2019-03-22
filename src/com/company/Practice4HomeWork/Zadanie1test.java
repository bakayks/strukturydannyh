package com.company.Practice4HomeWork;

public class Zadanie1test {
        public static void main(String[] args) {
            Zadanie1 myQueue = new Zadanie1(5);

            myQueue.insert(10);
            myQueue.insert(20);
            myQueue.insert(30);
            myQueue.insert(40);
            myQueue.insert(50);

            myQueue.remove();
            myQueue.remove();
            myQueue.remove();

            myQueue.insert(60);

            while (!myQueue.isEmpty()) {
                int n = myQueue.remove();
                System.out.println("Elem: " + n);
            }

        }

    }

