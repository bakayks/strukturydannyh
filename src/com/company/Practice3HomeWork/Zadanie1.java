package com.company.Practice3HomeWork;

public class Zadanie1 {

    public static void main(String[] args) {
        int chis = 7;
        int integ[] = {5,6,9,8,7,1,2,3,5};
        int x = 0;
        int i = 0;
        while(x != chis){
            x = integ[i];
            i++;
        }
        int p = i-1;
        int z = 7;
        int lev = 0;
        while(chis<=z){
            z = integ[i];
            if(integ[i-1] <= chis){
                lev = integ[i-1];
                z = integ[i-1];
            }
            i = i-1;
    }

        int prav = 0;
        z = 7;
        while(chis<=z){
            z = integ[p];
            if(integ[p+1] <= chis){
                prav = integ[p+1];
                z = integ[p+1];
            }
            p = p+1;
        }
        System.out.println("Leviy element "+lev+", Praviy element "+prav);
    }
}
