package org.example.cses_daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CsesDailyApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CsesDailyApplication.class, args);
        MissingNumbers missingNumbers = new MissingNumbers();
        long[] arr = {1L,2L,3L,5L};
        missingNumbers.runForMissing(5,arr);
    }

}
