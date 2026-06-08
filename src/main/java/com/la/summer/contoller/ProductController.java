package com.la.summer.contoller;

import com.la.summer.dto.command.ProductCreateDto;
import com.la.summer.dto.query.ProductDto;
import com.la.summer.model.Product;
import com.la.summer.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {

//    @Autowired
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll() {
        List<ProductDto> response = productService.getAll();
        if(response.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable("id") Integer id) {
        ProductDto response = productService.getById(id);
        if(response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }

//    @GetMapping("queryParam") api/product/queryParam?price=cijena&name=naziv
    @GetMapping(params = {"price", "name"})
    public ResponseEntity<List<Product>> getByPriceAndName(@RequestParam("price") Double price, @RequestParam String name) {
        List<Product> response = productService.getByPriceAndName(price, name);
        if(response.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductCreateDto body) {
       Product response = productService.create(body);
       return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> update(@PathVariable Integer id, @RequestBody ProductCreateDto body) {
        Product response = productService.update(id, body);
        if(response == null ) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        productService.delete(id);
//        return ResponseEntity.ok().build();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
