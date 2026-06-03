package com.la.summer.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("fakestore")
@Getter
@Setter
public class ExternalApiConfig {

    private String url;
    private String username;
    private String apiKey;
    private Boolean auth;
}
