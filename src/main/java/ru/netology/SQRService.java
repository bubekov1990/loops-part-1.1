package ru.netology;

public class SQRService {

    public int howManySquares(int minimalimit, int maxsimumlimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > minimalimit && i * i < maxsimumlimit) {
                counter++;
            }
        }
        return counter;
    }
}
