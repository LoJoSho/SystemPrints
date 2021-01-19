package me.LoJoSho;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SystemOut SystemOut1 = new SystemOut();
        int i;
        for (i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(1);
            SystemOut1.SystemPrint();
            TimeUnit.SECONDS.sleep(1);
            SystemOut1.SystemPrint();
        }
    }
}
