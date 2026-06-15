package org.example.cses_daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CsesDailyApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CsesDailyApplication.class, args);
       IncreasingArray increasingArray =
               new IncreasingArray();
       int[] arr = {3,2,5,4,7};
       increasingArray.minimumMoves(5,arr);
    }

}
