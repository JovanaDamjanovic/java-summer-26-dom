package com.la.summer.controller;

import com.la.summer.model.Uredjaj;
import com.la.summer.service.UredjajService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uredjaj")
public class UredjajController {

    private final UredjajService uredjajService;

    public UredjajController(UredjajService uredjajService) {
        this.uredjajService = uredjajService;
    }

    @GetMapping
    public ResponseEntity<Uredjaj[]> vratiSveUredjaje() {
        return ResponseEntity.ok(uredjajService.vratiSveUredjaje());
    }

    @GetMapping("{id}")
    public ResponseEntity<Uredjaj> vratiUredjajPoId(@PathVariable String id) {
        return ResponseEntity.ok(uredjajService.vratiUredjajPoId(id));
    }

    @PostMapping
    public ResponseEntity<Uredjaj> dodajUredjaj(@RequestBody Uredjaj uredjaj) {
        return ResponseEntity.ok(uredjajService.dodajUredjaj(uredjaj));
    }

    @PutMapping("{id}")
    public ResponseEntity<Uredjaj> izmijeniUredjaj(@PathVariable String id,
                                                   @RequestBody Uredjaj uredjaj) {
        return ResponseEntity.ok(uredjajService.izmijeniUredjaj(id, uredjaj));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> obrisiUredjaj(@PathVariable String id) {
        return ResponseEntity.ok(uredjajService.obrisiUredjaj(id));
    }
}