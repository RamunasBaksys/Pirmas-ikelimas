package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_7 {
    public float kmi2(float mase, float ugis) {

        return mase / (ugis * ugis);

    }

    public void parametrai() {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Iveskite savo mase");
        float mase = skaneris.nextFloat();
        System.out.println("Iveskite savo ugi metrais");
        float ugis = skaneris.nextFloat();
        System.out.println(kmi2(mase, ugis));

    }
}
