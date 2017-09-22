package com.company;

import com.company.Uzdaviniai.*;

import java.util.Scanner;

public class Main {
    public static final int UZDAVINYS_1_1 = 1;
    public static final int UZDAVINYS_1_2 = 2;
    public static final int UZDAVINYS_1_3 = 3;
    public static final int UZDAVINYS_1_4 = 4;
    public static final int UZDAVINYS_1_5 = 5;
    public static final int UZDAVINYS_1_6 = 6;
    public static final int UZDAVINYS_1_7 = 7;
   // public static final int UZDAVINYS_1_6 = 6;
   // public static final int UZDAVINYS_1_6 = 6;

    public static void main(String[] args) {
        // write your code here
        Scanner skaneris = new Scanner(System.in);
        while (true) {
            System.out.println("Pasirinkite uzdavini, kuri norite matyti");
            System.out.println("Ivedus -1 programa bus baigta");
            int uzdavinioNumeris = skaneris.nextInt();
            switch (uzdavinioNumeris) {
                case UZDAVINYS_1_1:
                    Uzdavinys1_1 uzdavinys1 = new Uzdavinys1_1();
                    uzdavinys1.vardas();
                    break;
                case UZDAVINYS_1_2:
                    Uzdavinys1_2 uzdavinys2 = new Uzdavinys1_2();
                    uzdavinys2.simbolis();
                    break;
                case UZDAVINYS_1_3:
                    Uzdavinys1_3 uzdavinys3 = new Uzdavinys1_3();
                    uzdavinys3.skaiciai();
                    break;
                case UZDAVINYS_1_4:
                    Uzdavinys1_4 uzdavinys4 = new Uzdavinys1_4();
                    uzdavinys4.skaiciaiMetod();
                    break;
                case UZDAVINYS_1_5:
                    Uzdavinys1_5 uzdavinys5 = new Uzdavinys1_5();
                    uzdavinys5.overloadas();
                    break;
                case UZDAVINYS_1_6:
                    Uzdavinys1_6 uzdavinys6 = new Uzdavinys1_6();
                    uzdavinys6.kmi();
                    break;
                case UZDAVINYS_1_7:
                    Uzdavinys1_7 uzdavinys7 = new Uzdavinys1_7();
                    uzdavinys7.parametrai();
                    break;
                default:
                    return;

            }
        }

    }
}
