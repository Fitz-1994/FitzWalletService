package org.fitz.wallet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan({"org.fitz.wallet.mapper"})
public class WalletQueryApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WalletQueryApplication.class, args);
    }
}
