package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_2 {
    public void simbolis ()
    {
        System.out.println("Iveskite zodi");
        Scanner skaneris = new Scanner(System.in);
        String simbolis = skaneris.nextLine();
        System.out.println(simbolis.length());
    }
}
