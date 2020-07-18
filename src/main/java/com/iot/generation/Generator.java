package com.iot.generation;

import java.util.Random;

public class Generator {

    public double generujLiczbe(double rangeMin, double rangeMax)
    {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        randomValue = Math.round(randomValue * 100);
        randomValue = randomValue/100;
        return randomValue;
    }
}
