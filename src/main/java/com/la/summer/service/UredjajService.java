package com.la.summer.service;

import com.la.summer.model.Uredjaj;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class UredjajService {

    private final RestClient restClient = RestClient.create("https://api.restful-api.dev/objects");

    public Uredjaj[] vratiSveUredjaje() {
        return restClient.get()
                .retrieve()
                .body(Uredjaj[].class);
    }

    public Uredjaj vratiUredjajPoId(String id) {
        return restClient.get()
                .uri("/{id}", id)
                .retrieve()
                .body(Uredjaj.class);
    }

    public Uredjaj dodajUredjaj(Uredjaj uredjaj) {
        return restClient.post()
                .body(uredjaj)
                .retrieve()
                .body(Uredjaj.class);
    }

    public Uredjaj izmijeniUredjaj(String id, Uredjaj uredjaj) {
        return restClient.put()
                .uri("/{id}", id)
                .body(uredjaj)
                .retrieve()
                .body(Uredjaj.class);
    }

    public String obrisiUredjaj(String id) {
        restClient.delete()
                .uri("/{id}", id)
                .retrieve()
                .toBodilessEntity();

        return "Uredjaj je obrisan";
    }
}