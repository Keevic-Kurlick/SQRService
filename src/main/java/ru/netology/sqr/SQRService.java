package ru.netology.sqr;

public class SQRService {
    public int findSqrInArea(int firstNumber, int lastNumber) {
        int sqr;
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
             sqr = i*i;
            if (sqr >= firstNumber && sqr <= lastNumber) {
                counter++;
            };
        }

        return counter;
    }
}