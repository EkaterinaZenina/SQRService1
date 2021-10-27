package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldThreeSqr() {
        SQRService service = new SQRService();
        int UnderNumber = 200;
        int UpperNumber = 300;
        int expected = 3;

        int actual = service.sqr(UpperNumber, UnderNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldOneSqr() {
        SQRService service = new SQRService();
        int UnderNumber = 100;
        int UpperNumber = 200;
        int expected = 1;

        int actual = service.sqr(UpperNumber, UnderNumber);


        assertEquals(expected, actual);
    }

}
