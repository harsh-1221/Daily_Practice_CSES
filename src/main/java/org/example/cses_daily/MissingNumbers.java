package org.example.cses_daily;

import java.util.Arrays;

public class MissingNumbers{

    public void runForMissing(long n, long[] obj) {
                long actualSum = Arrays.stream(obj).sum();
                long expectedSum = (n * (n + 1)) / 2;

                System.out.println(expectedSum - actualSum);

        }
}

