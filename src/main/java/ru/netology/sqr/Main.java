package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.findSqrInArea(200,300);
        System.out.println("\nРезультат: " + result);
    }
}

