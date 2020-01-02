package com.wenruiwang.mallbuilding.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder() {
        LOGGER.info("order is cancelled, and release locked stock according to sku number");
    }
}
