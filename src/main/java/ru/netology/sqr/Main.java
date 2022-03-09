package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        printArray(fillArray(100,300), "чисел");
        printArray(sqrNum(10, 99), "квадратов");
        int[] array1 = fillArray(100,300);
        int[] array2 = sqrNum(10,99);
        SQRService service = new SQRService();
        int result = service.countEquals(array1, array2);
        System.out.println("\nРезультат: " + result);

    }

    public static int[] fillArray(int start, int end) {
        int[] arrayNum = new int[(end - start)+1];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = start;
            start++;
        }
        return arrayNum;
    }

    public static int[] sqrNum(int start, int end) {
        int[] arraySqr = new int[(end - start)+1];
        for (int i = 0; i < arraySqr.length; i++) {
            arraySqr[i] = start*start;
            start++;
        }
        return arraySqr;
    }

    public static void printArray (int[] array, String name) {
        System.out.println("\nМассив " + name + ": ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

