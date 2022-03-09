package ru.netology.sqr;

public class SQRService {

    public int countEquals(int[] array1, int[] array2) {
        int counter = 0;

        for (int j : array2) {
            for (int num : array1) {
                if (num == j)
                    counter++;
            }
        }

        return counter;
    }
}