package com.example.donationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DonationMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DonationMsApplication.class, args);
    }

}
