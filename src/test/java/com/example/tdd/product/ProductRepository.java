package com.example.tdd.product;

import java.util.HashMap;
import java.util.Map;

class ProductRepository {
    private final Map<String, Product> datas = new HashMap<>();
    public void save(Product product) {
        datas.put(product.getName(), product);
    }
}
