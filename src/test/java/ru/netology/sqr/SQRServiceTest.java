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
    void doesCorrectlyFind(int start, int end, int expected) {
        int[] Array1 = Main.fillArray(start, end);
        int[] Array2 = Main.sqrNum(10,99);
        SQRService service = new SQRService();
        int actual = service.countEquals(Array1, Array2);
        assertEquals(expected,actual);
    }
}