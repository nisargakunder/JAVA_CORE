package com.bookappliaction.bookapp.schedular;

import com.bookappliaction.bookapp.service.BookService;
import org.springframework.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheEvictSchedular {
    private Logger logger = LoggerFactory.getLogger(CacheEvictSchedular.class);
    @Autowired
    private BookService bookService;

    @Scheduled(cron = "0,30 * * * * *")
    public void evictBookCache() {
        bookService.evictBookCache();
        logger.info("Evicting BookCache every 30 seconds");
    }

}
