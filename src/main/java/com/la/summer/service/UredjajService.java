package com.la.summer.service;

import com.la.summer.model.Uredjaj;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UredjajService {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String BASE_URL = "https://api.restful-api.dev/objects";

    public Object vratiSveUredjaje() {
        return restTemplate.getForObject(BASE_URL, Object.class);
    }

    public Object vratiUredjajPoId(String id) {
        return restTemplate.getForObject(BASE_URL + "/" + id, Object.class);
    }

    public Object dodajUredjaj(Uredjaj uredjaj) {
        Map<String, Object> request = new HashMap<>();
        request.put("name", uredjaj.getNaziv());
        request.put("data", uredjaj.getPodaci());

        return restTemplate.postForObject(BASE_URL, request, Object.class);
    }

    public Object izmijeniUredjaj(String id, Uredjaj uredjaj) {
        Map<String, Object> request = new HashMap<>();
        request.put("name", uredjaj.getNaziv());
        request.put("data", uredjaj.getPodaci());

        restTemplate.put(BASE_URL + "/" + id, request);
        return "Uredjaj je izmijenjen";
    }

    public Object obrisiUredjaj(String id) {
        restTemplate.delete(BASE_URL + "/" + id);
        return "Uredjaj je obrisan";
    }
}