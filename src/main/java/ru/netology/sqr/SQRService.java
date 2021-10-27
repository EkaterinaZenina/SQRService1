package ru.netology.sqr;

public class SQRService {

    public int sqr(int UnderNumber, int UpperNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= UpperNumber && sqr <= UnderNumber) {
                int сounter = counter + 1;
            }
        }
        return counter;
    }
}
