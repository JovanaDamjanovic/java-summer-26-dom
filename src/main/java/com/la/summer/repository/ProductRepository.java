package com.la.summer.repository;

import com.la.summer.dto.command.ProductCreateDto;
import com.la.summer.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

//    private static final Logger log = LoggerFactory.getLogger(ProductRepository.class);

    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1, "iPhone 17 Pro Max", "iPhone 17 Pro Max desc", 999.99);
        Product product2 = new Product(2, "Acer Nitro Five", "Acer Nitro Five decs", 1270.83);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Oral B Pro7000");
        product3.setDescription("Oral B Pro7000 desc");
        product3.setPrice(72.23);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getById(Integer id) {
        List<Product> productList = getAll();
        for(Product product : productList) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getByPriceAndName(Double price, String name) {
        List<Product> returnList = new ArrayList<>();

        List<Product> productList = getAll();
        for(Product product : productList) {
            if(product.getPrice() >= price && product.getName().contains(name)) {
                returnList.add(product);
            }
        }
        return returnList;
    }

    public Product create(ProductCreateDto body) {
        Product product = new Product();
        product.setId(4);
        product.setName(body.getName());
        product.setDescription(body.getDesc());
        product.setPrice(body.getCijena());

        return product;
    }

    public Product update(Integer id, ProductCreateDto body) {
        Product product = getById(id);
        if(product != null) {
            product.setName(body.getName());
            product.setDescription(body.getDesc());
            product.setPrice(body.getCijena());
        }
        return product;
    }

    public void delete(Integer id) {
        log.info("Izbrisali smo product sa id: {}", id);
    }
}
