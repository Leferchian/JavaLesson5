package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Bond 500-900',500,900,8",
            "'Bond 100-1000',100,1000,22"})
    void positiveTest(String name, long lowerBound, long upperBound, long expected) {
        SQRService service = new SQRService();

        long actual = service.square(lowerBound, upperBound);
        assertEquals(expected, actual);

    }
}