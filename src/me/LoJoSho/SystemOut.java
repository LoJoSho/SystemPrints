package me.LoJoSho;

import java.util.Random;

public class SystemOut {

    int MainInt = RandomInt();

    public void SystemPrint() {
        System.out.println(MainInt);
        System.out.println(RandomInt());
    }


    public int RandomInt() {
        Random rand = new Random();
        int minRange = 1, maxRange = 10;
        return rand.nextInt(maxRange - minRange) + minRange;
    }
}
