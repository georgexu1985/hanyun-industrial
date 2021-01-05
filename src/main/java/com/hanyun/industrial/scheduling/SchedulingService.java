package com.hanyun.industrial.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SchedulingService {

    private static int count = 0;

    @Scheduled(cron = "*/10 * * * * ?")
    public void init() {
//        log.info("##############SchedulingService ================== " + count++);
    }
}
