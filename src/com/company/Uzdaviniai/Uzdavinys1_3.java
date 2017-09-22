package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_3 {
    public void skaiciai() {
        System.out.println("Iveskite du skaicius");
        Scanner skaneris = new Scanner(System.in);
        int skaicius1 = skaneris.nextInt();
        int skaicius2 = skaneris.nextInt();
        System.out.println(skaicius1 + skaicius2);
        System.out.println(skaicius1 - skaicius2);

    }
}
