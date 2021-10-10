package org.fitz.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableScheduling
public class WalletJobApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(WalletJobApplication.class, args);
    }
}
