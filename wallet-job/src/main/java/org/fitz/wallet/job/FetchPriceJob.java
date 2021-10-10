package org.fitz.wallet.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FetchPriceJob {

    @Scheduled(cron = "*/5 * * * * ?")
    public void doJob() {
        System.out.println("doing something");
    }
}
