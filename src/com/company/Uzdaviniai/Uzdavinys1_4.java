package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_4 {
    public void skaiciaiMetod() {
        System.out.println("Iveskite du skaicius");
        Scanner skaneris = new Scanner(System.in);
        int skaic1 = skaneris.nextInt();
        int skaic2 = skaneris.nextInt();
        System.out.println(suma(skaic1, skaic2));
        System.out.println(skirtumas(skaic1, skaic2));
    }

    public int suma(int skaic1, int skaic2) {
        return skaic1 + skaic2;
    }

    public int skirtumas(int skaic1, int skaic2)
    {
        return skaic1 - skaic2;
    }
}
