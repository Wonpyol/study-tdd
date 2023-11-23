package com.example.tdd.product;

class ProductPort {
    private ProductRepository productRepository;

    public ProductPort(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save(Product product) {
        productRepository.save(product);
    }

}
