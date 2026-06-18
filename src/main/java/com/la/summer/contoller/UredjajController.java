package com.la.summer.controller;

import com.la.summer.model.Uredjaj;
import com.la.summer.service.UredjajService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uredjaj")
public class UredjajController {

    private final UredjajService uredjajService;

    public UredjajController(UredjajService uredjajService) {
        this.uredjajService = uredjajService;
    }

    @GetMapping
    public Object vratiSveUredjaje() {
        return uredjajService.vratiSveUredjaje();
    }

    @GetMapping("/{id}")
    public Object vratiUredjajPoId(@PathVariable String id) {
        return uredjajService.vratiUredjajPoId(id);
    }

    @PostMapping
    public Object dodajUredjaj(@RequestBody Uredjaj uredjaj) {
        return uredjajService.dodajUredjaj(uredjaj);
    }

    @PutMapping("/{id}")
    public Object izmijeniUredjaj(@PathVariable String id,
                                  @RequestBody Uredjaj uredjaj) {
        return uredjajService.izmijeniUredjaj(id, uredjaj);
    }

    @DeleteMapping("/{id}")
    public Object obrisiUredjaj(@PathVariable String id) {
        return uredjajService.obrisiUredjaj(id);
    }
}