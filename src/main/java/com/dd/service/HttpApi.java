package com.dd.service;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.io.IOException;

@Service
public class HttpApi {
    private static final Logger logger = LoggerFactory.getLogger(HttpApi.class.getSimpleName());

    private CloseableHttpClient httpClient = HttpClients.createDefault();

    public <T> T getData(String url, Class<T> responseClass) throws IOException {
        HttpGet request = new HttpGet(url);
        // Implement the code
        return null;
    }

    @PreDestroy
    public void destroy() throws IOException {
        httpClient.close();
    }

}
