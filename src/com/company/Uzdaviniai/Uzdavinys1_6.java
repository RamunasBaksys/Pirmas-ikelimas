package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_6 {
    public void kmi ()
    {
        System.out.println("Iveskite savo mase");
        Scanner skaneris = new Scanner(System.in);
        int mase = skaneris.nextInt();
        System.out.println("Iveskite savo ugi metrais");
        float ugis = skaneris.nextFloat();
        float kmi = (float) mase / (float)(ugis * ugis);
        System.out.println((float) kmi);
    }
}
