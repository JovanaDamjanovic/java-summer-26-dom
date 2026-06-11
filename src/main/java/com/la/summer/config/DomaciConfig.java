package com.la.summer.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("domaci")
@Getter
@Setter
public class DomaciConfig {

    private String ime;
    private String grupa;
    private String zadatak;
    private String predmet;
}