package com.la.summer.dto.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String name;
    private Double price;

    /*JSON:
    * {
    * "name": "IPHONE 17....",
    * "price": 999.99
    * }*/
}
