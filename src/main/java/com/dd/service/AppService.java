package com.dd.service;

import com.dd.dto.PostData;
import com.dd.dto.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AppService {

    private static final Logger logger = LoggerFactory.getLogger(AppService.class.getSimpleName());

    @Autowired
    private HttpApi httpApi;


    @Scheduled(initialDelay = 10, fixedDelay = 24 * 60 * 60 * 1000L)
    public void schedule() {
        logger.info("Started scheduled task");
        try {
            PostData[] posts = httpApi.getData("https://my-json-server.typicode.com/devicedrivendev/sample-rest/posts",
                    PostData[].class);
            UserData[] users = httpApi.getData("https://my-json-server.typicode.com/devicedrivendev/sample-rest/users",
                    UserData[].class);
            // write the code here to persist data
        } catch (IOException e) {
            logger.error("error fetching data", e);
        }
    }
}
