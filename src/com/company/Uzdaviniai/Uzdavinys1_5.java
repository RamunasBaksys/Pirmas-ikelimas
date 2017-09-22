package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_5 {
    public void overloadas() {
        System.out.println("Iveskite du skaicius");
        Scanner skaneris = new Scanner(System.in);
        float skaic1 = skaneris.nextFloat();
        float skaic2 = skaneris.nextFloat();
        System.out.println(veiksmas(skaic1, skaic2));
        System.out.println(veiksmas ((float) skaic1, (float) skaic2));
    }

    public int veiksmas(int skaic1, int skaic2) {
        return skaic1 + skaic2;
    }

    public float veiksmas(float skaic1, float skaic2) {
        return (float) skaic1 - skaic2;
    }
}

