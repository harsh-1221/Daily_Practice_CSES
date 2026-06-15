package org.example.cses_daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CsesDailyApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CsesDailyApplication.class, args);
        Repitions repitions = new Repitions();
        String[] arr1 = {"A","T","T","T","T","T","A","A"};
        repitions.maxRepitions(arr1);
    }

}
