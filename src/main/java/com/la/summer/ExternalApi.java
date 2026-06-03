package com.la.summer;

import com.la.summer.config.ExternalApiConfig;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ExternalApi {

    public static final Logger log = LoggerFactory.getLogger(ExternalApi.class);

    @Autowired
    private ExternalApiConfig externalApiConfig;

    @Autowired
    private Environment environment;

//    @Value("${fakestore.url}")
//    private String url;
//    @Value("${fakestore.username}")
//    private String username;
//    @Value("${fakestore.api-key}")
//    private String apiKey;
//    @Value("${fakestore.auth}")
//    private Boolean autorizacija;
//
//    public void printingConfigValues() {
//        log.info("Ispis za url: {}", url);
//        log.info("Ispis za username: {}", username);
//        log.info("Ispis za api-key: {}", apiKey);
//        log.info("Ispis za auth: {}", autorizacija);
//    }

//    public void printingConfigValues() {
//        log.info("Ispis za url: {}", externalApiConfig.getUrl());
//        log.info("Ispis za username: {}", externalApiConfig.getUsername());
//        log.info("Ispis za api-key: {}", externalApiConfig.getApiKey());
//        log.info("Ispis za auth: {}", externalApiConfig.getAuth());
//    }

    public void printingConfigValues() {
        log.info("Ispis za url: {}", environment.getProperty("fakestore.url"));
        log.info("Ispis za username: {}", environment.getProperty("username"));
        log.info("Ispis za api-key: {}", environment.getProperty("api-key"));
        log.info("Ispis za auth: {}", environment.getProperty("auth"));
        log.info("Ispis za ssl: {}", environment.getProperty("fakestore.ssl.active"));
        log.info("Ispis za autorizacija: {}", environment.getProperty("autorizacija", "neki default value"));
    }
}
