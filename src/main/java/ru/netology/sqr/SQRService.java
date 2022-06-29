package ru.netology.sqr;

public class SQRService {
    public long square(long lowerBound, long upperBound) {
        long result = 0;
        for (long side = 10;side<=99;side++ ){
            if (side*side>=lowerBound) {
                if (side*side<=upperBound) {
                    result++;
                }
            }
        }
        return (result);
    }
}
