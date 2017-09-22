package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_1 {
    public void vardas() {
        System.out.println("Iveskite varda");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }
}
