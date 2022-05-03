package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {}

        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
