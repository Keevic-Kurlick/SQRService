package ru.netology.sqr;

public class SQRService {
    public int findSqrInArea(int firstNumber, int lastNumber) {
        int start = 10;
        int end = 99;
        int counter = 0;
        int[] arraySqr = new int[(end - start) + 1];

        for (int i = 0; i < arraySqr.length; i++) {
            arraySqr[i] = start * start;
            if (arraySqr[i] >= firstNumber & arraySqr[i] <= lastNumber) {
                counter++;
            }
            start++;
        }

        return counter;
    }
}