package com.la.summer;

import com.la.summer.config.DomaciConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DomaciPrinter implements CommandLineRunner {

    private final DomaciConfig domaciConfig;
    private final Environment environment;

    @Value("${domaci.ime}")
    private String ime;

    public DomaciPrinter(DomaciConfig domaciConfig, Environment environment) {
        this.domaciConfig = domaciConfig;
        this.environment = environment;
    }

    @Override
    public void run(String... args) {
        System.out.println("=== @Value ===");
        System.out.println("Ime: " + ime);

        System.out.println("=== Property klasa ===");
        System.out.println("Ime: " + domaciConfig.getIme());
        System.out.println("Grupa: " + domaciConfig.getGrupa());
        System.out.println("Zadatak: " + domaciConfig.getZadatak());
        System.out.println("Predmet: " + domaciConfig.getPredmet());

        System.out.println("=== Environment ===");
        System.out.println("Ime: " + environment.getProperty("domaci.ime"));
        System.out.println("Grupa: " + environment.getProperty("domaci.grupa"));
        System.out.println("Zadatak: " + environment.getProperty("domaci.zadatak"));
        System.out.println("Predmet: " + environment.getProperty("domaci.predmet"));
    }
}