package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"100, 300, 8",
                        "200, 300, 3",
                        "200, 300, 5",
                        "-1, -3, 5"})
    void doesCorrectlyFind(int firstNumber, int lastNumber, int expected) {
        SQRService service = new SQRService();
        int actual = service.findSqrInArea(firstNumber, lastNumber);
        assertEquals(expected,actual);
    }

}