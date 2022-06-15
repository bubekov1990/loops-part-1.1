package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "from 10 to 99 range 0-10, 0, 0,10",
            "from 10 to 99 range 0-100, 1, 0,100",
            "from 10 to 99 range 400-800, 9, 400,800",
            "from 10 to 99 range 1000-5000, 39, 1000,5000",
            "from 10 to 99 range 0-9000, 85, 0,9000",
            "from 10 to 99 range -10-300, 0, -10,-300"
    })

    public void calculateSqrt(String testName, int expected, int lower, int upper) {
        SQRService service = new SQRService();

        int actual = service.howManySquares(lower, upper);

        assertEquals(actual, expected);
    }

}