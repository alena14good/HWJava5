package ru.netology.sqr.HWJava5.services;

public class SQRService {
    public int calSQRService(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

